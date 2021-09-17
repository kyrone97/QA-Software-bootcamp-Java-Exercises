package com.qa.interfaces;

public class Car implements Vehicle, VehicleDoor, Converitable, Boot {

	@Override
	public void bootOpen() {
		System.out.println("Boot is open");
	}

	@Override
	public void bootClose() {
		System.out.println("Boot is closed");

	}

	@Override
	public void roofDown() {
		System.out.println("Roof is down");

	}

	@Override
	public void roofUp() {
		System.out.println("Roof is up");

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
		System.out.println("This is a car");

	}

}

////Exercise:
//Task 1:
//    - Read through community module on Abstraction and Interfaces.
//    - Create an interface called Vehicle, with some methods relevant to all vehicles.
//    - Create some classes which implement your Vehicle interface, such as Bicycle, Car, Van etc.
//    - Have these classes implement the methods differently to one another.
//    - Create some other small interfaces and implement them on relevant classes.
//        - e.g. convertible, sunroof, ecofriendly etc 
//    - Upload your code to GitHub.
//
//Stretch Goal (Only for those who finish the main task):
//    - Write a class called Calculator, which implements the following interface:
//    
//        interface MathsChallenge{
//            int sumOfDivisors(int input);
//        }
//    
//    - Your implementation should take an integer (input) and return the sum of all of its divisors. E.g. 9 -> 1, 3, 9 -> 13.
//    - The value of input will always be a postivie whole number between 1 and 1000.
//- Friendly input, no edge cases :)