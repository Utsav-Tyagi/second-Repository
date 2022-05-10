package com.cg.collections;

public class Product implements Comparable<Product> {
 


	private int prodCode;
	private String prodName;
	private float price;
	private float rating;
	

	


	public Product(int prodCode, String prodName, float price, float rating) {
		super();
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.price = price;
		this.rating = rating;
	}
	
	public Product(int prodCode2, String prodName2, int price2, int rating2)
	{
		
	}
//setters&getters
	public int getProdCode() {
		return prodCode;
	}


	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Product [prodCode=" + prodCode + ", prodName=" + prodName + ", price=" + price + ", rating=" + rating
				+ "]";
	}
	
	public int compareTo(Product p) {
//		System.out.println("comparing" +this.prodName);
	if(this.price<p.price) {
		return -1;
	}
	else {
		return 1;
	}
	}
	

}
