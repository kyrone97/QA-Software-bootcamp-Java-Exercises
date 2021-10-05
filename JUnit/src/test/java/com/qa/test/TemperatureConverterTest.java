package com.qa.test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.main.TemperatureConverter;

public class TemperatureConverterTest {

	TemperatureConverter tc;
	
	@Before
	public void init() {
		tc = new TemperatureConverter();
	}
	
	@Test
	public void fahrenheitToCelsiusTest() {
		assertEquals(15.556, tc.convertFahrenheitToCelsius(60), 0.001);
	}
	
	
	
	
}