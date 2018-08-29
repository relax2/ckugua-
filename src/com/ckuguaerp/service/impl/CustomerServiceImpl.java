package com.ckuguaerp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckuguaerp.dao.ICustomerDao;
import com.ckuguaerp.entity.Customer;
import com.ckuguaerp.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private ICustomerDao custDao;
	
	
	@Override
	public Customer selectCustById(Integer customerId) throws Exception {

		return custDao.selectCustById(customerId);
	}


	@Override
	public List<Customer> selectCustList() throws Exception {
		
		return custDao.selectCustList();
	}

	@Override
	public void updateCust(Customer customer) throws Exception {
		custDao.updateCust(customer);
		
	}


	@Override
	public void addCust(Customer customer) throws Exception {
		custDao.addCust(customer);
		
	}


	@Override
	public void delCust(Customer customer) {
		custDao.delCust(customer);
		
	}

}
