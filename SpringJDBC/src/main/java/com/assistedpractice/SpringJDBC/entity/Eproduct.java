package com.assistedpractice.SpringJDBC.entity;

public class Eproduct {
	private int id;
	private String name;
	private double price;

	public Eproduct() {
		super();
	}

	public Eproduct(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Eproduct [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
