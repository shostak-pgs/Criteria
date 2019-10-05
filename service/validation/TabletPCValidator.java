package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TabletPCValidator {
	
	boolean verify(Map<String, Object> parametres) {		
		boolean correct = true;	
		List<String> colorList = Arrays.asList(new String[]{"blue", "red", "green"});
		for (Map.Entry<String, Object> pair : parametres.entrySet()) {
			String key = pair.getKey();
     
			switch (key) {
			
			case("BATTERY_CAPACITY"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int batery = Integer.parseInt(pair.getValue() + "");
			    if (batery > 9 || batery < 1) {correct = false;};
		        break;
			case("COLOR"):
		        String color = pair.getValue() + "";			
		        if (!(colorList.contains(color))) {correct = false;};
		        break;
			case("DISPLAY_INCHES"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int inches = Integer.parseInt(pair.getValue() + "");
		        if (inches > 23|| inches < 7) {correct = false;};
		        break;
			case("MEMORY_ROM"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int memory = Integer.parseInt(pair.getValue() + "");
		        if (memory > 32000 || memory < 1000) {correct = false;};
		        break;			
			case("DISPLAY_INCHS"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int flash_memory = Integer.parseInt(pair.getValue() + "");
		        if (flash_memory > 32 || flash_memory < 1) {correct = false;};
		        break;
		    }	
		}
		return correct;
	}
}
