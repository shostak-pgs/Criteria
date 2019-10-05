package by.htp.part03.block11.criteria.task01.dao;

import java.util.List;
import by.htp.part03.block11.criteria.task01.dao.DAOException;
import by.htp.part03.block11.criteria.task01.entity.Appliance;
import by.htp.part03.block11.criteria.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws DAOException;
}
