package org.hospital.pojo;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Patient {

	private int id;
	private String name;
	private boolean sex;
	private String disease;
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
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Patient(int id, String name, boolean sex, String disease) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.disease = disease;
	}
	public Patient() {
		super();
	}
	
}
