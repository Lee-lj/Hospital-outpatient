package org.hospital.pojo;

public class Doctor {
	
	private int id;
	private String name;
	private boolean sex;
	private int departid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getdepartid() {
		return departid;
	}
	public void setdepartid(int departid) {
		this.departid = departid;
	}
	public Doctor(int id, String name, boolean sex, int departid) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.departid = departid;
	}
	
	public Doctor() {
	}
	

}
