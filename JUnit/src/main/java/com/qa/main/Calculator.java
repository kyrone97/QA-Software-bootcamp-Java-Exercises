package com.qa.main;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int i, int j) { 
		return i - j;
	}
	
	public int conditionalCalc(int i, int j, boolean flag) {
		if (flag) {
			return i + j;
		} else {
			return i - j;
		}
	}
}