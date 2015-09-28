package com.junit.basic.annotations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterAnnotationsClass {

	@Before
	public void beforeMethod(){
		System.out.println("Inside Before Method");
	}
	
	@After
	public void tearDown(){
		System.out.println("Inside After Method");
	}
	
	@Test
	public void testMethodOne(){
		System.out.println("Inside Test One Method");
	}
	
	@Test
	public void testMethodTwO(){
		System.out.println("Inside Test Two Method");
	}
	
}