package com.qa.conditionals;


public class Conditionals {

	public static void main(String[] args) {
		//Divide(3, 5);
		//FlowCharts(10, 15);
	    //Blackjack(21, 20);
		//UniqueSum(5,5,5);
		

	}

// if first input is large than second input do division else print statement
	private static void Divide(double numOne, double numTwo) {
		if (numOne < numTwo) {
			System.out.println(numOne / numTwo);
		} else {
			System.out.println("division not possible");
		}
	}

// if true sum up the two inputs, if false multiply the two inputs.
	private static void FlowCharts(int num1, int num2) {
		boolean choice = false;

		if (choice) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(num1 * num2);

		}
	}

// Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. 
//If they both go over 21 then return 0
	private static void Blackjack(int num1, int num2) {
		
		
		
		if (num1 > num2 && num1 <= 21) {
			System.out.println(num1);
		}  if (num2 > num1 & num2 <= 21) {
			System.out.println(num2);
		}  if (num1 > 21 && num2 > 21) {
			System.out.println(0);
		}
	}

//Given 3 integer values, return their sum. If one value is the same as another value
//they do not count towards the sum. In other words, only return the sum of unique numbers given.
	private static void UniqueSum(int num1, int num2, int num3) {
		if (num1 != num2 && num1 != num3 && num2 != num3) {
			System.out.println(num1 + num2 + num3);
		} else if (num1 == num2 ) {
			System.out.println(num3);
		} else if (num1 == num3 ) {
			System.out.println(num2);
		} else if (num2 == num3 ) {
			System.out.println(num1);
		} else if (num1 == num2 && num1 == num3) { // 3 of same inputs dont output 
			System.out.println(0);
	
		}
;
	}

}
