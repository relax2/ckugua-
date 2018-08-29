package com.ckuguaerp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ckuguaerp.entity.ProEntity;
import com.ckuguaerp.service.IProService;
import com.ckuguaerp.util.JsonUtil;

@RestController
@RequestMapping("/pro")
public class ProController {
	
	@Autowired
	private IProService proService;
	
	/**
	 * 添加项目信息
	 * @param proId
	 * @param proNeed
	 * @param proStart
	 * @param proEnd
	 * @param proStauts
	 * @return
	 */
	@RequestMapping(value = "/insert",produces = "application/json;charset=utf-8")
	public String Pro(@RequestParam(name = "proName") String proName,
			@RequestParam(name = "proJia") String proJia,
			@RequestParam(name = "proStart") String proStart,
			@RequestParam(name = "proEnd") String proEnd){
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			Integer proStatus = 1;
			ProEntity pro = new ProEntity(proName, proJia,proStart, proEnd, proStatus);
			proService.insertPro(pro);
			rtnMap.put("rtnCode","1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}   
		return JsonUtil.objToJson(rtnMap);
	}
	
	/**
	 * 根据Id查询项目信息
	 * 
	 */
	@RequestMapping(value = "/query", produces = "application/json;charset=utf-8")
	public String seleByProId(@RequestParam(name = "proId") Integer proId){
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			ProEntity pro = proService.queryByProId(proId);
			rtnMap.put("data", pro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JsonUtil.objToJson(rtnMap);
	}
	
	/**
	 * 修改项目信息
	 * 
	 */
	@RequestMapping(value = "/update" ,produces = "application/json;charset=utf-8")
	public String updateByProId(@RequestParam(name = "proId") Integer proId,
			@RequestParam(name = "proName") String proName,
			@RequestParam(name = "proJia") String proJia,
			@RequestParam(name = "proStart") String proStart,
			@RequestParam(name = "proEnd") String proEnd,
			HttpServletRequest request) {
		Map<String, Object> rtnMap = new HashMap<>();
		try {
			ProEntity pro = proService.queryByProId(proId);
		    pro = new ProEntity(proId, proJia, proName, proStart, proEnd);
		    proService.updateByProId(pro);
		    rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}	
		return JsonUtil.objToJson(rtnMap);
	}
	
	
	/**
	 * 查询列表信息
	 * 
	 */
	@RequestMapping(value = "/queryAll",produces = "application/json;charset=utf-8")
	public String queryByPro(){
		Map<String, Object> rtnMap = new HashMap<String, Object>();
		try {
			List<ProEntity> list = proService.queryPro();
			rtnMap.put("list", list);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		
		return JsonUtil.objToJson(rtnMap);
	}
	
	/**
	 * 删除项目信息
	 * 
	 */
	@RequestMapping(value = "/del",produces = "application/json;charset=utf-8")
	public String delByProId(@RequestParam(name = "proId") Integer proId, HttpServletRequest request){
		Map<String, Object> rtnMap = new HashMap<>();
		try {
			ProEntity pro = proService.queryByProId(proId);
//			Integer proid = pro.getProId();
			String projia = pro.getProJia();
			String proname = pro.getProName();
			String prostart = pro.getProStart();
			String proend = pro.getProEnd();
			Integer prostatus = 1;
			pro = new ProEntity(proId, projia, proname, prostart, proend, prostatus);
			proService.delByProId(pro);
			rtnMap.put("rtnCode", "1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			rtnMap.put("rtnCode", "0");
			e.printStackTrace();
		}
		
		return JsonUtil.objToJson(rtnMap);
	} 
	
	
}
