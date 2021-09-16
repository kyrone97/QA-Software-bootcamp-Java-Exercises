package com.qa.Encapsulation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation example = new Encapsulation();
		
		example.setShoeCost(25);
		example.setShoeBrand("Nike");
		example.setShoeSize(8.5);
		System.out.println("My shoe brand is " + example.getShoeBrand()+" My shoe size is "+ example.getShoeSize()+". My shoe cost is £"+example.getShoeCost());
		System.out.println(example.toString());
	}

}
