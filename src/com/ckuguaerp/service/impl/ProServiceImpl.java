package com.ckuguaerp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckuguaerp.dao.IProjectDao;
import com.ckuguaerp.entity.ProEntity;
import com.ckuguaerp.service.IProService;
@Service
public class ProServiceImpl implements IProService {

	/**
	 *�����Ŀ��Ϣ
	 * 
	 */
	@Autowired
	private IProjectDao proDao;
	
	@Override
	public void insertPro(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		proDao.insertPro(pro);
	}
	/**
	 * ����ID��ѯ��Ŀ��Ϣ
	 * 
	 */
	@Override
	public ProEntity queryByProId(Integer proId) throws Exception {
		// TODO Auto-generated method stub
		return proDao.queryByProId(proId);
	}

	/**
	 * �޸���Ŀ��Ϣ
	 * 
	 */
	@Override
	public void updateByProId(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		proDao.updateByProId(pro);
	}
	
	
	/**
	 * ��ѯ��Ŀ�б�
	 * 
	 */
	@Override
	public List<ProEntity> queryPro() throws Exception {
		// TODO Auto-generated method stub
		return proDao.queryPro();
	}
	
	/**
	 * ɾ����Ŀ��Ϣ
	 * 
	 */
	@Override
	public void delByProId(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		proDao.delByProId(pro);
	}
	
	
}
