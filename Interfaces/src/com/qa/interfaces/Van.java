package com.qa.interfaces;

public class Van implements Vehicle, VehicleDoor, Boot {

	@Override
	public void bootOpen() {
		System.out.println("Boot is open");		
		
	}

	@Override
	public void bootClose() {
		System.out.println("Boot is closed");		
		
	}

	@Override
	public void unlockDoor() {
		System.out.println("Door is unlocked");		
		
	}

	@Override
	public void lockDoor() {
		System.out.println("Door is locked");		
		
	}

	@Override
	public void VehicleType() {
		System.out.println("This is a Van");		
		
	}
	

}
