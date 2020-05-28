package model.services;

import java.util.List;

import model.dao.SellerDao;
import model.dao.FactoryDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = FactoryDao.createSellerDao();
	
	
	public List<Seller> findAll(){
		return dao.findAll();
	};
	
	public void saveOrUpdate(Seller obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
	
}
