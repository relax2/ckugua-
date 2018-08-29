package com.ckuguaerp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ckuguaerp.entity.Customer;
import com.ckuguaerp.service.ICustomerService;
import com.ckuguaerp.util.JsonUtil;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired 
	private ICustomerService custService;
	
	
	@RequestMapping(value = "list", produces = "application/json;charset=utf-8")
	public String queryByList() {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			List<Customer> list = custService.selectCustList();
			rtnMap.put("Customer", list);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		
		return JsonUtil.objToJson(rtnMap);
		
	}
	
	@RequestMapping(value ="/get", produces = "application/json;charset=utf-8")
	public String queryById(@RequestParam(name= "customerId")Integer customerId) {
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			Customer cust =  custService.selectCustById(customerId);
			rtnMap.put("data", cust);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
		
	}
	
	
		@RequestMapping(value = "/add", produces = "application/json;charset=utf-8")
		public String addCust(
				@RequestParam(name="customerName")String customerName, 
				@RequestParam(name="customerDesc")String customerDesc,
				@RequestParam(name="customerPhone")String customerPhone,
				@RequestParam(name="customerGender")String customerGender,
				@RequestParam(name="customerEmail")String customerEmail,
				@RequestParam(name="customerTime")String customerTime
				) {
			Map<String, Object> rtnMap= new HashMap<String, Object>();
			
			try {
				Customer cust = new Customer(customerName,customerDesc,customerPhone,customerGender,customerEmail,customerTime);
				custService.addCust(cust);
				rtnMap.put("rtnCode", "1");
			} catch (Exception e) {
				rtnMap.put("rtnCode", "0");
				e.printStackTrace();
			}
			return JsonUtil.objToJson(rtnMap);
			
		}
	
		@RequestMapping(value = "/update", produces = "application/json;charset=utf-8")
		public String updateCust(
					@RequestParam(name="customerId")Integer customerId,
					@RequestParam(name="customerName")String customerName, 
					@RequestParam(name="customerPhone")String customerPhone,
					@RequestParam(name="customerGender")String customerGender,
					@RequestParam(name="customerEmail")String customerEmail,
					@RequestParam(name="customerTime")String customerTime) {
			Map<String, Object> rtnMap =  new HashMap<String, Object>();
			
			try {
				Customer cust = custService.selectCustById(customerId);
				cust = new Customer(customerId,customerName,customerPhone,customerGender,customerEmail,customerTime);
				custService.updateCust(cust);
				
				rtnMap.put("rtnCode", "1");//修改成功
			} catch (Exception e) {
				rtnMap.put("rtnCode", "0");//修改失败
				e.printStackTrace();
			}
			return JsonUtil.objToJson(rtnMap);
	
	}
		@RequestMapping(value = "/del", produces = "application/json;charset=utf-8")
		public String delCust(@RequestParam(name= "customerId")Integer customerId) {
			Map<String, Object> rtnMap = new HashMap<String, Object>();
			
			try {
				Customer cust = custService.selectCustById(customerId);
				
				custService.delCust(cust);
				rtnMap.put("rtnCode", "1");//修改成功
			} catch (Exception e) {
				rtnMap.put("rtnCode", "0");//修改失败
				e.printStackTrace();
			}
			
			
			return JsonUtil.objToJson(rtnMap);
			
		}
}
