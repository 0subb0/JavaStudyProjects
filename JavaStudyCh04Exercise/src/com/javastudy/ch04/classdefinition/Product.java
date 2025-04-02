package com.javastudy.ch04.classdefinition;

public class Product {

	private String product;
	private int price;
	private String make;
	private String tip;
	
	public Product(String product, int price, String make, String tip) {
		// TODO Auto-generated constructor stub
		this.product = product;
		this.price = price;
		this.make = make;
		this.tip = tip;
		
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	@Override
	public String toString() {
		return product + "(" + price + "), " + "제조사 : " + make + ", 상품설명 : " + tip;
	}
	
}
