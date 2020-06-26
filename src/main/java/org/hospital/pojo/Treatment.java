package org.hospital.pojo;

import java.util.Date;

public class Treatment {

	private int id;
	private int pay_Id;
	private int patient_Id;
	private boolean effective;
	private String name;
	private int money;
	private String content;
	private String createTime;
	
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPay_Id() {
		return pay_Id;
	}
	public void setPay_Id(int pay_Id) {
		this.pay_Id = pay_Id;
	}
	public int getPatient_Id() {
		return patient_Id;
	}
	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}
	public boolean isEffective() {
		return effective;
	}
	public void setEffective(boolean effective) {
		this.effective = effective;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Treatment(int id, int pay_Id, int patient_Id, boolean effective, String name, int money, String content,
			String createTime) {
		super();
		this.id = id;
		this.pay_Id = pay_Id;
		this.patient_Id = patient_Id;
		this.effective = effective;
		this.name = name;
		this.money = money;
		this.content = content;
		this.createTime = createTime;
	}
	public Treatment() {
	}
	
}
