package com.ckuguaerp.dao;

import java.util.List;

import com.ckuguaerp.entity.Customer;

public interface ICustomerDao {
	
	/**
	 * 根据ID查询
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	public Customer selectCustById(Integer customerId )throws Exception;
	
	/**
	 * 添加信息
	 * @param customer
	 * @throws Exception
	 */
	public void addCust(Customer customer)throws Exception;
	/**
	 * 查询所有信息
	 * @return
	 * @throws Exception
	 */
	public List<Customer> selectCustList()throws Exception;
	/**
	 * 修改与更新
	 * @param customer
	 * @throws Exception
	 */
	public void updateCust(Customer customer)throws Exception;
	/**
	 * 删除
	 * 
	 * @param customer
	 */
	public void delCust(Customer customer) ;

	
}
