package com.ckuguaerp.dao;

import java.util.List;

import com.ckuguaerp.entity.ProEntity;

public interface IProjectDao {

	/**
	 * 添加项目信息
	 */
	public void insertPro(ProEntity pro) throws Exception;
	
	
	/**
	 * 根据ID查询项目信息
	 */
	public ProEntity queryByProId(Integer proId) throws Exception;
	
	/**
	 * 
	 * 修改项目信息
	 */
	public void updateByProId(ProEntity pro) throws Exception;
	
	/**
	 * 查询项目列表
	 * 
	 */
	public List<ProEntity> queryPro() throws Exception;
	
	/**
	 * 删除项目信息
	 * 
	 */
	public void delByProId(ProEntity pro) throws Exception;
	
	
}
