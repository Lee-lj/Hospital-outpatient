package org.hospital.pojo;

public class DoctorWithDepart {
	
	private int id;
	private String name;
	private String deName;
	private boolean sex;
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
	public String getDeName() {
		return deName;
	}
	public void setDeName(String deName) {
		this.deName = deName;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public DoctorWithDepart(int id, String name, String deName, boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.deName = deName;
		this.sex = sex;
	}
	public DoctorWithDepart() {
		super();
	}
	

	
}
