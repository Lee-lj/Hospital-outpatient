package org.hospital.pojo;

public class Medicine {

	private int id;
	private String name;
	private String foruse;
	private int util_price;
	private int Quantity;
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
	public String getForuse() {
		return foruse;
	}
	public void setForuse(String foruse) {
		this.foruse = foruse;
	}
	public int getUtil_price() {
		return util_price;
	}
	public void setUtil_price(int util_price) {
		this.util_price = util_price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Medicine(int id, String name, String foruse, int util_price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.foruse = foruse;
		this.util_price = util_price;
		Quantity = quantity;
	}
	public Medicine() {
	}
	
}
