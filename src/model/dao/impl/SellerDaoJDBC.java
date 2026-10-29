package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller obj) {
		
		
	}

	@Override
	public void update(Seller obj) {
		
		
	}

	@Override
	public void deleteById(Integer id) {
		
		
	}

	@Override
	public void findById(Integer id) {
		
		
	}

	@Override
	public List<Seller> findAll() {
		
		return null;
	}

	
}
