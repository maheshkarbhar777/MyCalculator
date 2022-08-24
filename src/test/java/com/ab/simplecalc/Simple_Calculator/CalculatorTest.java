package com.ab.simplecalc.Simple_Calculator;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculatorTest  {

	private static final double b=46;

	BasicCalculator obj = new BasicCalculator();//Object of the test class for which the test is designed
	
	//Test case for add method in the Operations class 
	@Test
	public void add() {
		assertEquals(25, obj.Add(),b);
		System.out.println("Test case1 runs");
	}
	
	/*
	 * @Test public void multiply() { assertEquals(25, obj.Multiply(),b);
	 * System.out.println("Test case2 runs"); }
	 */
	
	@Test
	public void substract() {
		assertEquals(25, obj.Add());
		System.out.println("Test case3 runs");
	}
	
	/*
	 * @Test public void divide() { assertEquals(25, obj.Divide());
	 * System.out.println("Test case4 runs"); }
	 */
}
