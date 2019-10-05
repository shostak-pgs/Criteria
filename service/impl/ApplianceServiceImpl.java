package by.htp.part03.block11.criteria.task01.service.impl;

import java.util.List;
import by.htp.part03.block11.criteria.task01.dao.ApplianceDAO;
import by.htp.part03.block11.criteria.task01.dao.DAOException;
import by.htp.part03.block11.criteria.task01.dao.DAOFactory;
import by.htp.part03.block11.criteria.task01.entity.Appliance;
import by.htp.part03.block11.criteria.task01.entity.criteria.Criteria;
import by.htp.part03.block11.criteria.task01.service.ApplianceService;
import by.htp.part03.block11.criteria.task01.service.ServiceException;
import by.htp.part03.block11.criteria.task01.service.validation.Validator;


public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
		throw new ServiceException("Неверный параметр");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance;
		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e) {
		
			throw new ServiceException(e);
		}				
		return appliance;
	}

}

