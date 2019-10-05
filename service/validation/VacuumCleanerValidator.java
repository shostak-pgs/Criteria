package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class VacuumCleanerValidator {
	
	boolean verify(Map<String, Object> parametres) {
		boolean correct = true;
		List<String> filterList = Arrays.asList(new String[]{"A", "B", "C"});
		List<String> bag_typeList = Arrays.asList(new String[]{"A2", "AA-89", "XX00"});
		List<String> wand_typeList = Arrays.asList(new String[]{"all-in-one"});
		
		for (Map.Entry<String, Object> pair : parametres.entrySet()) {
			String key = pair.getKey();
     
			switch (key) {
			
			case("POWER_CONSUMPTION"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int power = Integer.parseInt(pair.getValue() + "");
			    if (power > 350 || power < 50) {correct = false;};
		        break;		        
			case("FILTER_TYPE"):
		        String filter = pair.getValue() + "";			
		        if (!(filterList.contains(filter))) {correct = false;};
		        break;
			case("BAG_TYPE"):
		        String bag_type = pair.getValue() + "";			
		        if (!(bag_typeList.contains(bag_type))) {correct = false;};
		        break;
			case("WAND_TYPE"):
		        String wand_type = pair.getValue() + "";			
		        if (!(wand_typeList.contains(wand_type))) {correct = false;};
		        break;			
			case("MOTOR_SPEED_REGULATION"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int speed= Integer.parseInt(pair.getValue() + "");
		        if (speed > 4000 || speed < 2000) {correct = false;};
		        break;			
			case("CLEANING_WIDTH"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int width= Integer.parseInt(pair.getValue() + "");
		        if (width > 32 || width < 1) {correct = false;};
		        break;
		    }	
		}
		return correct;
	}
}
