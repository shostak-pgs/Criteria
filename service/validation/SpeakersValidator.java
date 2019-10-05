package by.htp.part03.block11.criteria.task01.service.validation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SpeakersValidator {
	
	boolean verify(Map<String, Object> parametres) {
		boolean correct = true;
		List<String> frequency = Arrays.asList(new String[]{"2-4", "3-4", "2-3.5"});
		for (Map.Entry<String, Object> pair : parametres.entrySet()) {
			String key = pair.getKey();
     
			switch (key) {
			
			case("POWER_CONSUMPTION"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int power_consumption = Integer.parseInt(pair.getValue() + "");
			    if (power_consumption > 25 || power_consumption < 10) {correct = false;};
		        break;
			case("FREQUENCY_RANGE"):
		        String frequency_threshold = pair.getValue() + "";			
		        if (!(frequency.contains(frequency_threshold))) {correct = false;};
		        break;
			case("NUMBER_OF_SPEAKERS"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int number_of_speakers = Integer.parseInt(pair.getValue() + "");
		        if (number_of_speakers > 10|| number_of_speakers < 1) {correct = false;};
		        break;
			case("CORD_LENGTH"):
				if (Validator.checkForNumber(pair.getValue() + "") != true) {
					correct = false;
					break;
				}
		        int cord_length = Integer.parseInt(pair.getValue() + "");
		        if (cord_length > 5 || cord_length < 1) {correct = false;};
		        break;			
		    }	
		}
		return correct;
	}
}
