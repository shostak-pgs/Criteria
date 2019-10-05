package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import by.htp.part03.block11.criteria.task01.entity.criteria.Criteria;
import by.htp.part03.block11.criteria.task01.entity.criteria.SearchCriteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		boolean same = true;
		
		Map<String, Object> parametres = criteria.getCriteria();
		String type = criteria.getGroupSearchName();
			
		switch (type) {

		case "Laptop":
			same = new LaptopValidator().verify(parametres);			
			break;

		case "Oven":
			same = new OvenValidator().verify(parametres);
			break;

		case "Refrigerator":
			same = new RefrigeratorValidator().verify(parametres);
			break;

		case "Speakers":
			same = new SpeakersValidator().verify(parametres);
			break;

		case "TabletPC":
			same = new TabletPCValidator().verify(parametres);
			break;

		case "VacuumCleaner":
			same = new VacuumCleanerValidator().verify(parametres);
			break;		
	    }	

			return same;
	}	
	
	public static boolean checkForNumber(String parametr) {
		
        return Pattern.matches("[0-9]+", parametr);
	}
	
	public static boolean checkForFloatNumber(String parametr) {
		
        return Pattern.matches("[0-9.,]+", parametr);
	}
}
