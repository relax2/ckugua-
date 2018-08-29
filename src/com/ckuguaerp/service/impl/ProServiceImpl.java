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
	 *添加项目信息
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
	 * 根据ID查询项目信息
	 * 
	 */
	@Override
	public ProEntity queryByProId(Integer proId) throws Exception {
		// TODO Auto-generated method stub
		return proDao.queryByProId(proId);
	}

	/**
	 * 修改项目信息
	 * 
	 */
	@Override
	public void updateByProId(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		proDao.updateByProId(pro);
	}
	
	
	/**
	 * 查询项目列表
	 * 
	 */
	@Override
	public List<ProEntity> queryPro() throws Exception {
		// TODO Auto-generated method stub
		return proDao.queryPro();
	}
	
	/**
	 * 删除项目信息
	 * 
	 */
	@Override
	public void delByProId(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		proDao.delByProId(pro);
	}
	
	
}
