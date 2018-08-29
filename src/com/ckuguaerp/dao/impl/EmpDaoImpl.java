package com.ckuguaerp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ckuguaerp.dao.IEmpDao;
import com.ckuguaerp.entity.Emp;

@Repository
public class EmpDaoImpl implements IEmpDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Emp queryByEmpCode(String empCode) throws Exception {
		Emp emp = new Emp();
		emp.setEmpCode(empCode);
		return sqlSession.selectOne("Emp.selectByEmpCode", emp);
	}
	
	@Override
	public void addEmp(Emp emp) throws Exception {
		sqlSession.insert("Emp.addOne", emp);
	}

	@Override
	public List<Emp> queryEmpss() throws Exception {
		List<Emp> list = new ArrayList<>();
		return sqlSession.selectList("Emp.selectList", list);
	}

	@Override
	public Emp queryById(Integer id) throws Exception {
		Emp emp = new Emp(id);
		return sqlSession.selectOne("Emp.selectById", emp);
	}

	@Override
	public void delEmp(Emp emp) throws Exception {
		sqlSession.update("Emp.delEmp", emp);
	}

	@Override
	public void updEmp(Emp emp) throws Exception {
		sqlSession.update("Emp.updEmp", emp);
	}

}
