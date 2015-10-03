package com.junit.personal.testing;

import org.junit.Rule;
import org.junit.Test;

public class MySampleRuleImplement {
	
	@Rule
	public MySampleRule mySampleRule = new MySampleRule();
	
	@Test
	public void testMethodForImplementingTheRule(){
		System.out.println("during");
		System.out.println("second during statement");
		throw new ArithmeticException();
	}
}