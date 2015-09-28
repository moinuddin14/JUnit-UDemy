package com.maven.tests;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestJUnitClass {

	@Test
	public void testMethodOne() {
		System.out.println("Inside Maven JUnit testMethodOne Method");
		this.testMethodThree();
	}
	
	@Test
	public void testMethodTwo() {
		//new ArrayList<Object>().get(1);
		int i = 10/0;
	}
	
	@Test
	public void testMethodThree() {
		System.out.println("Inside Maven JUnit testMethodThree Method");
	}
	
	@Test
	public void testMethodFour() {
		System.out.println("Inside Maven JUnit testMethodFour Method");
	}

}