package com.ckuguaerp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ckuguaerp.dao.IProjectDao;
import com.ckuguaerp.entity.ProEntity;
@Repository
public class ProjectDaoImpl implements IProjectDao {

	@Autowired
	private SqlSession sqlsession;
	/**
	 * 添加项目信息
	 */
	@Override
	public void insertPro(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert("Pro.insertOne", pro);
	}
	
	/**
	 * 根据ID查询项目信息
	 * 
	 */
	@Override
	public ProEntity queryByProId(Integer proId) throws Exception {
		// TODO Auto-generated method stub
		ProEntity pro = new ProEntity(proId);
		return sqlsession.selectOne("Pro.selectByProId", pro);
	}
	
	
	/**
	 * 修改项目信息
	 * 
	 */
	@Override
	public void updateByProId(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.update("Pro.updateByProId",pro);
	}
	
	/**
	 * 查询项目列表
	 * 
	 */
	@Override
	public List<ProEntity> queryPro() throws Exception {
		// TODO Auto-generated method stub
		List<ProEntity> list = new ArrayList<>();
		return sqlsession.selectList("Pro.queryByPro", list);
	}
	
	/**
	 * 删除项目信息
	 * 
	 */
	@Override
	public void delByProId(ProEntity pro) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.update("Pro.delByProId", pro);
	}


}
