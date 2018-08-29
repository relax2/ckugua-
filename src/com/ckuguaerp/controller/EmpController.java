package com.ckuguaerp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ckuguaerp.entity.Emp;
import com.ckuguaerp.service.IEmpService;
import com.ckuguaerp.util.JsonUtil;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private IEmpService empService;
	
	@RequestMapping(value = "/add", produces = "application/json;charset=utf-8")
	public String register(@RequestParam(name = "empName") String empName, 
			@RequestParam(name = "empCode") String empCode, 
			@RequestParam(name = "empPwd") String empPwd, 
			@RequestParam(name = "empSex") String empSex, 
			@RequestParam(name = "empBirthday") String empBirthday, 
			@RequestParam(name = "empPhone") String empPhone, 
			@RequestParam(name = "empEmail") String empEmail, 
			@RequestParam(name = "empDept") String empDept, 
			@RequestParam(name = "empJoinTime") String empJoinTime) {
		
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			Emp emp = new Emp(empName, empCode, empPwd, empSex, empBirthday, empPhone, empEmail, empDept, empJoinTime);
			empService.addEmp(emp);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
	}
	
	@RequestMapping(value = "/list", produces = "application/json;charset=utf-8")
	public String queryEmps() {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		
		try {
			List<Emp> emps = empService.queryEmpss();
			rtnMap.put("emps", emps);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
	}
	
	@RequestMapping(value = "/one", produces = "application/json;charset=utf-8")
	public String queryById(@RequestParam(name = "empId") Integer id) {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			Emp emp = empService.queryById(id);
			rtnMap.put("data", emp);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
	}
	
	@RequestMapping("/del")
	public String delEmp(@RequestParam(name = "empId") Integer id, HttpServletRequest request) {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			//首先查询出员工个人具体信息
			Emp emp = empService.queryById(id);
			//查询出的员工个人信息放到session中
//			HttpSession session = request.getSession();
//			session.setAttribute("empinfo", emp);
//			emp = (Emp)session.getAttribute("empinfo");
			
			//获取表内各个字段
			Integer empId = emp.getEmpId();
			String empName = emp.getEmpName();
			String empCode = emp.getEmpCode();
			String empPwd = emp.getEmpPwd();
			String empSex = emp.getEmpSex();
			String empBirthday = emp.getEmpBirthday();
			String empPhone = emp.getEmpPhone();
			String empEmail = emp.getEmpEmail();
			String empDept = emp.getEmpDept();
			String empJoinTime = emp.getEmpJoinTime();
			Integer empStatus = 2;
			emp = new Emp(empId, empName, empCode, empPwd, empSex, empBirthday, empPhone, empEmail, empDept, empJoinTime, empStatus);
			empService.delEmp(emp);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
	}
	
	@RequestMapping(value = "/mod", produces = "application/json;charset=utf-8")
	public String updEmp(@RequestParam(name = "empId") Integer id, 
			@RequestParam(name = "empBirthday") String empBirthday, 
			@RequestParam(name = "empPhone") String empPhone, 
			@RequestParam(name = "empEmail") String empEmail, 
			HttpServletRequest request) {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			//首先查询出员工个人具体信息
			Emp emp = empService.queryById(id);
			//查询出的员工个人信息放到session中
//			HttpSession session = request.getSession();
//			session.setAttribute("empinfo", emp);
//			emp = (Emp)session.getAttribute("empinfo");
			
			//获取表内各个字段
			Integer empId = emp.getEmpId();
			String empName = emp.getEmpName();
			String empCode = emp.getEmpCode();
			String empPwd = emp.getEmpPwd();
			String empSex = emp.getEmpSex();
//			String empBirthday = emp.getEmpBirthday();
//			String empPhone = emp.getEmpPhone();
//			String empEmail = emp.getEmpEmail();
			String empDept = emp.getEmpDept();
			String empJoinTime = emp.getEmpJoinTime();
			emp = new Emp(empId, empName, empCode, empPwd, empSex, empBirthday, empPhone, empEmail, empDept, empJoinTime);
			empService.updEmp(emp);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
	}
}
