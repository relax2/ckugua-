package com.ckuguaerp.entity;

import java.io.Serializable;

public class Emp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer empId;		//员工编号
	private String empName;		//员工姓名
	private String empCode;		//员工用户名
	private String empPwd;		//员工密码
	private String empSex;		//员工性别
	private String empBirthday;	//员工生日
	private String empPhone;	//员工手机号码
	private String empEmail;	//员工邮箱
	private String empDept;		//员工所在部门
	private String empJoinTime;	//入职日期
	private Integer empStatus;	//工作状态
	
	public Emp() {
		super();
	}

	public Emp(Integer empId) {
		super();
		this.empId = empId;
	}

	public Emp(String empName, String empCode, String empPwd, String empSex, String empBirthday, String empPhone,
			String empEmail, String empDept, String empJoinTime) {
		super();
		this.empName = empName;
		this.empCode = empCode;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.empBirthday = empBirthday;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empDept = empDept;
		this.empJoinTime = empJoinTime;
	}

	public Emp(Integer empId, String empName, String empCode, String empPwd, String empSex, String empBirthday,
			String empPhone, String empEmail, String empDept, String empJoinTime) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCode = empCode;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.empBirthday = empBirthday;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empDept = empDept;
		this.empJoinTime = empJoinTime;
	}

	public Emp(Integer empId, String empName, String empCode, String empPwd, String empSex, String empBirthday,
			String empPhone, String empEmail, String empDept, String empJoinTime, Integer empStatus) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCode = empCode;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.empBirthday = empBirthday;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empDept = empDept;
		this.empJoinTime = empJoinTime;
		this.empStatus = empStatus;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getEmpBirthday() {
		return empBirthday;
	}

	public void setEmpBirthday(String empBirthday) {
		this.empBirthday = empBirthday;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpJoinTime() {
		return empJoinTime;
	}

	public void setEmpJoinTime(String empJoinTime) {
		this.empJoinTime = empJoinTime;
	}

	public Integer getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(Integer empStatus) {
		this.empStatus = empStatus;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empCode=" + empCode + ", empPwd=" + empPwd
				+ ", empSex=" + empSex + ", empBirthday=" + empBirthday + ", empPhone=" + empPhone + ", empEmail="
				+ empEmail + ", empDept=" + empDept + ", empJoinTime=" + empJoinTime + "]";
	}
	
}
