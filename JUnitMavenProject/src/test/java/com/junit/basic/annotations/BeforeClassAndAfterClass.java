package com.junit.basic.annotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BeforeClassAndAfterClass {

	@BeforeClass
	public static void beforeClassMethod(){
		System.out.println("Inside Before Class Method");
	}
	
	@AfterClass
	public static void afterClassMethod(){
		System.out.println("Inside After Class Method");
	}
	
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
	
	@Test
	@Ignore
	public void testMethodThree(){
		System.out.println("Inside Test Third Method");
	}
	
	@Test
	public void testMethodFour(){
		System.out.println("Inside Test Fourth Method");
	}
	
}