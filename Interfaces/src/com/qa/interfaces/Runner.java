package com.qa.interfaces;

public class Runner {

	public static void main(String[] args) {

		Car BMW = new Car();
		BMW.VehicleType();
		BMW.roofDown();
		BMW.roofUp();
		BMW.unlockDoor();
		BMW.lockDoor();
		BMW.bootClose();
		BMW.bootOpen();
		
		System.out.println( "");
		
		Van Lorry = new Van();
		Lorry.VehicleType();
		Lorry.bootOpen();
		Lorry.bootClose();
		Lorry.lockDoor();
		Lorry.unlockDoor();
		
		

	}

}
