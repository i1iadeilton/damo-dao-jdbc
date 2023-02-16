package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	//Factory serve para não expor as implementações
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
