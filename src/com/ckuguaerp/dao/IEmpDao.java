package com.ckuguaerp.dao;

import java.util.List;

import com.ckuguaerp.entity.Emp;

public interface IEmpDao {
	
	/**
	 * 	根据用户名查询用户信息
	 * @param userPhone
	 * @return
	 * @throws Exception
	 */
	public Emp queryByEmpCode(String empCode) throws Exception;
	
	/**
	 *  新增员工信息
	 * @param user
	 * @throws Exception
	 */
	public void addEmp(Emp emp) throws Exception;
	
	/**
	 * 查询员工信息列表
	 * @return
	 * @throws Exception
	 */
	public List<Emp> queryEmpss() throws Exception;
	
	/**
	 * 根据id查询员工信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Emp queryById(Integer id) throws Exception;
	
	/**
	 * 根据员工id修改员工工作状态，当做删除
	 * @param emp
	 * @throws Exception
	 */
	public void delEmp(Emp emp) throws Exception;
	
	/**
	 * 修改员工个人信息
	 * @param emp
	 * @throws Exception
	 */
	public void updEmp(Emp emp) throws Exception;
	
}
