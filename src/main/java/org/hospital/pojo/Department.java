package org.hospital.pojo;

/*
 * department :科室
 * doctor:医生信息
 * medicine:药物
 * patient:病人信息
 * pay:扣费项目及金额
 * treatment:某个病人的某种治疗项目
 */
public class Department {
	
	private int id;
	private String name;
	private String content;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Department(int id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
	}
	
	public Department() {
	}
}
