package com.junit.paramterize;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedClass {

	@Parameters
	public static Collection<Object[]> fibonacciData(){
		return Arrays.asList(new Object[][]{
				{ 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 },{ 6, 8 }
		});
	}
	
	private int input;
	private int expected;
	
	public ParameterizedClass(int input, int expected) {
		this.input=input;
		this.expected=expected;
	}
	
	@Test
	public void testParameterMethod(){
		System.out.println("Input: "+input+ " Output: "+expected);
	}
	
}