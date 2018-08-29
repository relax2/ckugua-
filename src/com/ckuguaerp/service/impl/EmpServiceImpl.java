package com.ckuguaerp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckuguaerp.dao.IEmpDao;
import com.ckuguaerp.entity.Emp;
import com.ckuguaerp.service.IEmpService;

@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private IEmpDao empDao;
	
	@Override
	public Emp queryByEmpCode(String empCode) throws Exception {
		return empDao.queryByEmpCode(empCode);
	}

	@Override
	public void addEmp(Emp emp) throws Exception {
		empDao.addEmp(emp);
	}

	@Override
	public List<Emp> queryEmpss() throws Exception {
		return empDao.queryEmpss();
	}

	@Override
	public Emp queryById(Integer id) throws Exception {
		return empDao.queryById(id);
	}

	@Override
	public void delEmp(Emp emp) throws Exception {
		empDao.delEmp(emp);
	}

	@Override
	public void updEmp(Emp emp) throws Exception {
		empDao.updEmp(emp);
	}

}
