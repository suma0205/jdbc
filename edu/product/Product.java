package edu.product;

public class Product {
	private int id;
	private String name;
	private String descprition;
	private int price;

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

	public String getDescprition() {
		return descprition;
	}

	public void setDescprition(String descprition) {
		this.descprition = descprition;
	}

	public int getPrice() {
		return price;
	}
	// alt+s=genetrate field

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(int id, String name, String descprition, int price) {
		super();
		this.id = id;
		this.name = name;
		this.descprition = descprition;
		this.price = price;
	}
	// alt+s=generate constructor using superclass

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	// alt+s=generate toString

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descprition=" + descprition + ", price=" + price + "]";
	}
}
