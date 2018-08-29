package com.ckuguaerp.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ckuguaerp.dao.ICustomerDao;
import com.ckuguaerp.entity.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public Customer selectCustById(Integer customerId) throws Exception {
		Customer cust = new Customer();
		
		cust.setCustomerId(customerId);

		return sqlSession.selectOne("Customer.queryCustById",cust);
	}

	@Override
	public void addCust(Customer customer) throws Exception {
		sqlSession.insert("Customer.addCust",customer);
		
	}

	@Override
	public List<Customer> selectCustList() throws Exception {
		List<Customer> list = new ArrayList<>();
		return sqlSession.selectList("Customer.queryCustByList",list);
	}

	@Override
	public void updateCust(Customer customer) throws Exception {
		sqlSession.update("Customer.updateCust",customer);
		
	}

	@Override
	public void delCust(Customer customer) {
		sqlSession.update("Customer.delCust",customer);
		
	}



}
