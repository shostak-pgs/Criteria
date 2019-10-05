package by.htp.part03.block11.criteria.task01.main;

import java.util.List;

import by.htp.part03.block11.criteria.task01.entity.Appliance;
import by.htp.part03.block11.criteria.task01.entity.criteria.Criteria;
import by.htp.part03.block11.criteria.task01.entity.criteria.SearchCriteria.Laptop;
import by.htp.part03.block11.criteria.task01.entity.criteria.SearchCriteria.Oven;
import by.htp.part03.block11.criteria.task01.entity.criteria.SearchCriteria.TabletPC;
import by.htp.part03.block11.criteria.task01.service.ApplianceService;
import by.htp.part03.block11.criteria.task01.service.ServiceException;
import by.htp.part03.block11.criteria.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance = null;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		try {
			appliance = service.find(criteriaOven);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 40);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		try {
			appliance = service.find(criteriaOven);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
	
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY.toString(), 3);

		try {
			appliance = service.find(criteriaTabletPC);
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}

		PrintApplianceInfo.print(appliance);
		
        /////////////////////////////////////////////////////////////////

        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
        criteriaLaptop.add(Laptop.OS.toString(), "Windows");
       
        try {
            appliance = service.find(criteriaLaptop);
        } catch (ServiceException e) {

            e.printStackTrace();
        }    

        PrintApplianceInfo.print(appliance);
	}
}
	


