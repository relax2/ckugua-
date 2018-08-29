package com.ckuguaerp.dao;

import java.util.List;

import com.ckuguaerp.entity.Customer;

public interface ICustomerDao {
	
	/**
	 * ����ID��ѯ
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	public Customer selectCustById(Integer customerId )throws Exception;
	
	/**
	 * �����Ϣ
	 * @param customer
	 * @throws Exception
	 */
	public void addCust(Customer customer)throws Exception;
	/**
	 * ��ѯ������Ϣ
	 * @return
	 * @throws Exception
	 */
	public List<Customer> selectCustList()throws Exception;
	/**
	 * �޸������
	 * @param customer
	 * @throws Exception
	 */
	public void updateCust(Customer customer)throws Exception;
	/**
	 * ɾ��
	 * 
	 * @param customer
	 */
	public void delCust(Customer customer) ;

	
}
