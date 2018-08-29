package com.ckuguaerp.service;

import java.util.List;

import com.ckuguaerp.entity.ProEntity;

public interface IProService {

	/**
	 * �����Ŀ��Ϣ
	 */
	public void insertPro(ProEntity Pro) throws Exception;
	
	
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
