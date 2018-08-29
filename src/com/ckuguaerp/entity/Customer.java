package com.ckuguaerp.entity;

import java.io.Serializable;



public class Customer implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Integer customerId;
	private String  customerName;//客户姓名
	private String customerDesc;//详情
	private String customerPhone;//手机号
	private String customerGender;//性别
	private String customerEmail;//邮箱
	private String customerTime;//委托时间
	private Integer customerStatus;//委托状态
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer customerId, String customerName, String customerDesc, String customerPhone,
			String customerGender, String customerEmail, String customerTime) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerDesc = customerDesc;
		this.customerPhone = customerPhone;
		this.customerGender = customerGender;
		this.customerEmail = customerEmail;
		this.customerTime = customerTime;
	}
	
	public Customer(Integer customerId, String customerName, String customerPhone, String customerGender,
			String customerEmail, String customerTime) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerGender = customerGender;
		this.customerEmail = customerEmail;
		this.customerTime = customerTime;
	}
	public Customer(Integer customerId) {
		super();
		this.customerId = customerId;
	}
	public Customer(String customerName, String customerDesc, String customerPhone, String customerGender,
			String customerEmail, String customerTime) {
		super();
		this.customerName = customerName;
		this.customerDesc = customerDesc;
		this.customerPhone = customerPhone;
		this.customerGender = customerGender;
		this.customerEmail = customerEmail;
		this.customerTime = customerTime;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerDesc="
				+ customerDesc + ", customerPhone=" + customerPhone + ", customerGender=" + customerGender
				+ ", customerEmail=" + customerEmail + ", customerTime=" + customerTime + ", customerStatus="
				+ customerStatus + "]";
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerDesc() {
		return customerDesc;
	}
	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerTime() {
		return customerTime;
	}
	public void setCustomerTime(String customerTime) {
		this.customerTime = customerTime;
	}
	public Integer getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
	}
	
}
