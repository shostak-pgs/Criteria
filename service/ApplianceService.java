package by.htp.part03.block11.criteria.task01.service;


import java.util.List;
import by.htp.part03.block11.criteria.task01.entity.Appliance;
import by.htp.part03.block11.criteria.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	public List<Appliance> find(Criteria criteria) throws ServiceException;
	
}
