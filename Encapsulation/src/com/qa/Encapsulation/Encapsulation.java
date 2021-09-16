package com.qa.Encapsulation;

public class Encapsulation {

	private int shoeCost;
	private String shoeBrand;
	private double shoeSize;

	public Encapsulation() {
		super();
		this.shoeCost = shoeCost;
		this.shoeBrand = shoeBrand;
		this.shoeSize = shoeSize;

	}

	public String getShoeBrand() {
		return shoeBrand;
	}

	public void setShoeBrand(String shoeBrand) {
		this.shoeBrand = shoeBrand;
	}

	public int getShoeCost() {
		return shoeCost;
	}

	public void setShoeCost(int shoeCost) {
		this.shoeCost = shoeCost;
	}

	public double getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(double shoeSize) {
		this.shoeSize = shoeSize;
	}

	@Override
	public String toString() {
		return "Encapsulation [shoeCost=£" + shoeCost + ", shoeBrand=" + shoeBrand + ", shoeSize=" + shoeSize + "]";
	}
	

}
