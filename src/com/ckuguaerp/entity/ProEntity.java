package com.ckuguaerp.entity;

public class ProEntity {

	public Integer proId;//��ĿID
	public String proJia;//�׷�
	public String proName;//��Ŀ����
	public String proStart;//��Ŀ��ʼʱ��
	public String proEnd;//��Ŀ����ʱ��
	public Integer proStatus;//��Ŀ���״̬ 0:�������  1:����δ���
	public ProEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProEntity(Integer proId) {
		super();
		this.proId = proId;
	}

	public ProEntity(String proJia, String proName, String proStart, String proEnd) {
		super();
		this.proJia = proJia;
		this.proName = proName;
		this.proStart = proStart;
		this.proEnd = proEnd;
	}

	public ProEntity(String proJia, String proName, String proStart, String proEnd, Integer proStatus) {
		super();
		this.proJia = proJia;
		this.proName = proName;
		this.proStart = proStart;
		this.proEnd = proEnd;
		this.proStatus = proStatus;
	}

	public ProEntity(Integer proId, String proJia, String proName, String proStart, String proEnd) {
		super();
		this.proId = proId;
		this.proJia = proJia;
		this.proName = proName;
		this.proStart = proStart;
		this.proEnd = proEnd;
	}

	public ProEntity(Integer proId, String proJia, String proName, String proStart, String proEnd, Integer proStatus) {
		super();
		this.proId = proId;
		this.proJia = proJia;
		this.proName = proName;
		this.proStart = proStart;
		this.proEnd = proEnd;
		this.proStatus = proStatus;
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProJia() {
		return proJia;
	}

	public void setProJia(String proJia) {
		this.proJia = proJia;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProStart() {
		return proStart;
	}

	public void setProStart(String proStart) {
		this.proStart = proStart;
	}

	public String getProEnd() {
		return proEnd;
	}

	public void setProEnd(String proEnd) {
		this.proEnd = proEnd;
	}

	public Integer getProStatus() {
		return proStatus;
	}

	public void setProStatus(Integer proStatus) {
		this.proStatus = proStatus;
	}

	@Override
	public String toString() {
		return "ProEntity [proId=" + proId + ", proJia=" + proJia + ", proName=" + proName + ", proStart=" + proStart
				+ ", proEnd=" + proEnd + ", proStatus=" + proStatus + "]";
	}
	
	
}
