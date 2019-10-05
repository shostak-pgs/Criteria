package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LaptopValidator {
	 boolean verify(Map<String, Object> parametres) {
		boolean correct = true;		
		List<String> osList = Arrays.asList(new String[]{"Windows", "Linux"});
		for (Map.Entry<String, Object> pair : parametres.entrySet()) {
			String key = pair.getKey();
     
			switch (key) {
			
			case("BATTERY_CAPACITY"):				
				if (Validator.checkForFloatNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}				
		        float batery = Float.parseFloat(pair.getValue() + "");
			    if (batery > 9 || batery < 1) {correct = false;};
		        break;
			case("OS"):
		        String os = pair.getValue() + "";			
		        if (!(osList.contains(os))) {correct = false;};
		        break;
			case("MEMORY_ROM"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int memory_rom= Integer.parseInt(pair.getValue() + "");
		        if (memory_rom > 32000|| memory_rom < 1000) {correct = false;};
		        break;
			case("SYSTEM_MEMORY"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int system_memory = Integer.parseInt(pair.getValue() + "");
		        if (system_memory > 3000 || system_memory < 80) {correct = false;};
		        break;
			case("CPU"):
				if (Validator.checkForFloatNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        float cpu = Float.parseFloat(pair.getValue() + "");
		        if (cpu > 4.0 || cpu < 1.0) {correct = false;};
		        break;
			case("DISPLAY_INCHS"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int display = Integer.parseInt(pair.getValue() + "");
		        if (display > 90 || display < 40) {correct = false;};
		        break;
		    }	
		}
		return correct;
	}
}
