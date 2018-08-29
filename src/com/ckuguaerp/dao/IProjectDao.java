package com.ckuguaerp.dao;

import java.util.List;

import com.ckuguaerp.entity.ProEntity;

public interface IProjectDao {

	/**
	 * �����Ŀ��Ϣ
	 */
	public void insertPro(ProEntity pro) throws Exception;
	
	
	/**
	 * ����ID��ѯ��Ŀ��Ϣ
	 */
	public ProEntity queryByProId(Integer proId) throws Exception;
	
	/**
	 * 
	 * �޸���Ŀ��Ϣ
	 */
	public void updateByProId(ProEntity pro) throws Exception;
	
	/**
	 * ��ѯ��Ŀ�б�
	 * 
	 */
	public List<ProEntity> queryPro() throws Exception;
	
	/**
	 * ɾ����Ŀ��Ϣ
	 * 
	 */
	public void delByProId(ProEntity pro) throws Exception;
	
	
}
