package com.ckuguaerp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ckuguaerp.entity.Emp;
import com.ckuguaerp.service.IEmpService;
import com.ckuguaerp.util.JsonUtil;

@RestController
@RequestMapping("/user")
public class LoginController {

	
	@Autowired
	private IEmpService empService;
	
	@RequestMapping(value = "/login", produces = "application/json;charset=utf-8")
	public String doLogin(@RequestParam(name = "empCode") String empCode, 
			@RequestParam(name = "empPwd") String empPwd, 
			HttpServletRequest request) {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			Emp emp = empService.queryByEmpCode(empCode);
			//У��Ա���˺��Ƿ����
			if(null != emp) {
				//����Ա�������Ƿ���ȷ
				if(empPwd.equals(emp.getEmpPwd())) {
					HttpSession session = request.getSession();
					session.setAttribute("LOGIN", emp);
					rtnMap.put("data", emp);
					//���ñ�ʶ
					rtnMap.put("rtnCode", "1");//������ȷ��ʶ
				} else {
					rtnMap.put("rtnCode", "2");//��������ʶ
				}
			} else {
				rtnMap.put("rtnCode", "3");//�û��������ڱ�ʶ
			}
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");//��¼�쳣��ʶ
			e.printStackTrace();
		}
		
		return JsonUtil.objToJson(rtnMap);
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		//���session
		session.removeAttribute("LOGIN");
		return "login";
	}
}
