package by.htp.part03.block11.criteria.task01.main;

import java.util.List;

import by.htp.part03.block11.criteria.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		for(Appliance app : appliance) {
			System.out.println(app.toString());
		}
		
	}
	
	// you may add your own code here

}
