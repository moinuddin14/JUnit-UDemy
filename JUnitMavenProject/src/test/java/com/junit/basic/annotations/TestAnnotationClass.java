package com.junit.basic.annotations;

import org.junit.Test;
import org.junit.rules.Timeout;

public class TestAnnotationClass {
	
	@Test(timeout=2000)
	public void testOneMethod() throws InterruptedException{
		System.out.println("Inside the test Method testOneMethod");
		
		Thread.sleep(2000);
		System.out.println("After sleep of 3 Seconds");
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testTwoMethod(){
		System.out.println("Inside the test Method testTwoMethod");
		throw new ArrayIndexOutOfBoundsException();
	}
	
	@Test(expected=IllegalAccessException.class)
	public void testThreeMethod(){
		System.out.println("Inside the test Method testThreeMethod");
	}
	
	@Test
	public void testFourMethod(){
		System.out.println("Inside the test Method testFourMethod");
	}
}