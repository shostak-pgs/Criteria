package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Map;

public class RefrigeratorValidator {
	
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
			    if (power > 300 || power < 100) {correct = false;};
		        break;
			case("WEIGHT"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int weight = Integer.parseInt(pair.getValue() + "");
		        if (weight > 50 || weight < 10) {correct = false;};
		        break;
			case("CAPACITY"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int freezer_capacity = Integer.parseInt(pair.getValue() + "");
		        if (freezer_capacity > 30|| freezer_capacity < 5) {correct = false;};
		        break;
			case("OVERALL_CAPACITY"):
				if (Validator.checkForFloatNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        float overall_capacity = Float.parseFloat(pair.getValue() + "");
		        if (overall_capacity > 60 || overall_capacity < 30) {correct = false;};
		        break;
			case("HEIGHT"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int height = Integer.parseInt(pair.getValue() + "");
		        if (height > 300 || height < 50) {correct = false;};
		        break;
			case("WIDTH"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int width = Integer.parseInt(pair.getValue() + "");
		        if (width > 90 || width < 60) {correct = false;};
		        break;
		    }	
		}
		return correct;
	}
}
