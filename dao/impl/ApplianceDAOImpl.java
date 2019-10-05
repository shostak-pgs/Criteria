package by.htp.part03.block11.criteria.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.htp.part03.block11.criteria.task01.dao.ApplianceDAO;
import by.htp.part03.block11.criteria.task01.dao.DAOException;
import by.htp.part03.block11.criteria.task01.entity.Appliance;
import by.htp.part03.block11.criteria.task01.entity.criteria.Criteria;
import by.htp.part03.block11.criteria.task01.service.validation.Validator;

public class ApplianceDAOImpl implements ApplianceDAO{

	final String SOURSE = "C:\\appliances_db.txt";	
	
	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {	
		List<Appliance> result = new ArrayList<>();	
		String categoryOfGoods = criteria.getGroupSearchName();		
		
		List<String> textAppliance = new ArrayList<>();
		List<String> paramList;
		
		try(BufferedReader readerr = new BufferedReader(new FileReader(SOURSE))) {			
			while(readerr.ready()) { 
		        textAppliance.add(readerr.readLine());		        
		    }
		} catch (FileNotFoundException e) {			
			throw new DAOException(e);
		} catch (IOException e) {			
		  	throw new DAOException(e);
		}	
		
		 for (String strAppliance : textAppliance) {	
			paramList = checkType(strAppliance, categoryOfGoods);
			if (paramList.size() > 0) {
				if (compare(getParams(paramList), criteria.getCriteria())) {					
				     result.add(ApplianceFactory.getAppliance(getParams(paramList)));
				}			
		    } 
		}		
		return result;		
	}	
		
	private static List<String> checkType(String strAppliance, String categoryOfGoods) {
		
		Pattern patternName = Pattern.compile("(\\S+)\\s?[;:,]?\\s?");	
		Matcher matcher;
		boolean correct = false;
		List<String> paramList =  new ArrayList<>();
		matcher = patternName.matcher(strAppliance);
		
		while(matcher.find()) {	
			 if (matcher.group(1).equals(categoryOfGoods)) {
				 correct = true;
				 paramList.add((String)("Name=" + matcher.group(1)));
				 continue;
			 } while (correct == true) {
				paramList.add(matcher.group(1));
				break;
		    }
		}		
		return paramList;
	}
		    
	private Map<String, String> getParams(List<String> str) {
     
		Map<String, String> parametres = new HashMap<String, String>();		
		
		Pattern pattern = Pattern.compile("(\\w+)[=](\\w?[.,]?\\w+)");
		Matcher matcher;
		
		for (int i = 0; i < str.size(); i++) {
			matcher = pattern.matcher(str.get(i));
			while(matcher.find()) {					
			    parametres.put(matcher.group(1), matcher.group(2));
			}
		}		
		return parametres;
	}
	
	private boolean compare(Map<String, String> parametres, Map<String, Object> criteria) {
		boolean same = true;
		
		for (Map.Entry<String, Object> entry : criteria.entrySet()) {
			String st = entry.getKey();				
			if (!("" + criteria.get(st)).equals(parametres.get(st))) {
				same = false;
			}
		}
		return same;
	}
}
