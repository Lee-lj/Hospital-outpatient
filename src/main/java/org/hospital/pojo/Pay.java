package org.hospital.pojo;

public class Pay {

	private int id;
	private String content;
	private int money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Pay(int id, String content, int money) {
		super();
		this.id = id;
		this.content = content;
		this.money = money;
	}
	public Pay() {
	}
	
}
