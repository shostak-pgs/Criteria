package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Map;

public class OvenValidator {
	
	boolean verify(Map<String, Object> parametres) {
		
	boolean correct = true;		
		for (Map.Entry<String, Object> pair : parametres.entrySet()) {
			String key = pair.getKey();

			switch (key) {
			
			case("POWER_CONSUMPTION"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int power = Integer.parseInt(pair.getValue() + "");
			    if (power > 4000 || power < 1000) {correct = false;};
		        break;
			case("WEIGHT"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int weight = Integer.parseInt(pair.getValue() + "");
		        if (weight > 56 || weight < 17) {correct = false;};
		        break;
			case("CAPACITY"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int capacity = Integer.parseInt(pair.getValue() + "");
		        if (capacity > 35|| capacity < 25) {correct = false;};
		        break;
			case("DEPTH"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int depth = Integer.parseInt(pair.getValue() + "");
		        if (depth > 60 || depth < 30) {correct = false;};
		        break;
			case("HEIGHT"):
		        int height = Integer.parseInt(pair.getValue() + "");
		        if (height > 90 || height < 35) {correct = false;};
		        break;
			case("WIDTH"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int width = Integer.parseInt(pair.getValue() + "");
		        if (width > 90 || width < 40) {correct = false;};
		        break;
		    }	
		}
		return correct;
	}
}
