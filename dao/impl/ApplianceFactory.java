package by.htp.part03.block11.criteria.task01.dao.impl;

import java.util.Map;
import by.htp.part03.block11.criteria.task01.dao.DAOException;
import by.htp.part03.block11.criteria.task01.entity.Appliance;
import by.htp.part03.block11.criteria.task01.entity.Laptop;
import by.htp.part03.block11.criteria.task01.entity.Oven;
import by.htp.part03.block11.criteria.task01.entity.Refrigerator;
import by.htp.part03.block11.criteria.task01.entity.Speakers;
import by.htp.part03.block11.criteria.task01.entity.TabletPC;
import by.htp.part03.block11.criteria.task01.entity.VacuumCleaner;
import by.htp.part03.block11.criteria.task01.entity.criteria.SearchCriteria;

public class ApplianceFactory {

	static Appliance getAppliance(Map<String, String> map) {

		Appliance appliance = null;		
		String categoryOfGoods = map.get("Name");

		switch (categoryOfGoods) {

		case "Laptop":
			appliance = createLaptop(map);
			break;

		case "Oven":
			appliance = createOven(map);
			break;

		case "Refrigerator":
			appliance = createRefrigerator(map);
			break;

		case "Speakers":
			appliance = createSpeakers(map);
			break;

		case "TabletPC":
			appliance = createTabletPC(map);
			break;

		case "VacuumCleaner":
			appliance = createVacuumCleaner(map);
			break;		
	    }
		return appliance;
	}

	private static Laptop createLaptop(Map<String, String> params) {
		
		String name = params.get("Name");
		float batery = Float.parseFloat(params.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
		String os = (String) params.get(SearchCriteria.Laptop.OS.toString());
		int memory_rom = Integer.parseInt(params.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
		int system_memory = Integer.parseInt(params.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
		float cpu = Float.parseFloat(params.get(SearchCriteria.Laptop.CPU.toString()));
		int display = Integer.parseInt(params.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));

		return new Laptop(name, batery, os, memory_rom, system_memory, cpu, display);		
	}

	private static Oven createOven(Map<String, String> params) {
	
		String name = params.get("Name");
		int power = Integer.parseInt(params.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
		int weight = Integer.parseInt(params.get(SearchCriteria.Oven.WEIGHT.toString()));
		int capacity = Integer.parseInt(params.get(SearchCriteria.Oven.CAPACITY.toString()));
		int depth = Integer.parseInt(params.get(SearchCriteria.Oven.DEPTH.toString()));
		int height = Integer.parseInt(params.get(SearchCriteria.Oven.HEIGHT.toString()));
		int width = Integer.parseInt(params.get(SearchCriteria.Oven.WIDTH.toString()));

		return new Oven(name, power, weight, capacity, depth, height, width);		
	}

	private static Refrigerator createRefrigerator(Map<String, String> params) {

		String name = params.get("Name");
		int power  = Integer.parseInt(params.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
		int weight = Integer.parseInt(params.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
		int freezer_capacity  = Integer.parseInt(params.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
		float overall_capacity = Float.parseFloat(params.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
		int height = Integer.parseInt((String) params.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
		int width = Integer.parseInt((String) params.get(SearchCriteria.Refrigerator.WIDTH.toString()));

		return new Refrigerator(name, power, weight, freezer_capacity, overall_capacity, height, width);				
	}

	private static Speakers createSpeakers(Map<String, String> params) {	
		
		String name = params.get("Name");		
		int power = Integer.parseInt(params.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
		int number_of_speakers = Integer.parseInt(params.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
		String frequency_threshold =  params.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
		int cord_length = Integer.parseInt(params.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

		return new Speakers(name, power, number_of_speakers, frequency_threshold, cord_length);
	}

	private static TabletPC createTabletPC(Map<String, String> params) {
		
		String name = (String) params.get("Name");
		int battery = Integer.parseInt(params.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
		int inches = Integer.parseInt(params.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
		int memory = Integer.parseInt(params.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
		int flash_memory = Integer.parseInt(params.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
		
		String color = params.get(SearchCriteria.TabletPC.COLOR.toString());

		return new TabletPC(name, battery, inches, memory, flash_memory, color);
	}

	private static VacuumCleaner createVacuumCleaner(Map<String, String> params) {

		String name = params.get("Name");
		int power = Integer.parseInt(params.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()));
		String filter = params.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
		String bag_type = params.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
		String wand_type = params.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
		int speed= Integer.parseInt(params.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));
		int width = Integer.parseInt(params.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

		return new VacuumCleaner(name, power, filter, bag_type, wand_type, speed, width);

	}
}

