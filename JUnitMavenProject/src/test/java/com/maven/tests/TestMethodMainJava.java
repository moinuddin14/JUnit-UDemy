package com.maven.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethodMainJava {
	
	@Test
	public void testMethodOne(){
		System.out.println("Inside the Test One Method");
	}

	@TestAnnotation(age = 20, name = "Rehaan", newNames = { "John", "James" }, value = "12345")
	@Test
	public void testMethodTwo(){
		System.out.println("Inside the Test Two Method");
	}
	
	@BeforeClass
	public static void testBeforeClassOneMethod(){
		System.out.println("Inside the BeforeClassMethod One Method");
	}
	
	@BeforeClass
	public static void testBeforeClassTwoMethod(){
		System.out.println("Inside the BeforeClassMethod Two Method");
	}
	
	@AfterClass
	public static void testAfterClassMethod(){
		System.out.println("Inside the AfterClassMethod Method");
	}
	
	@Before
	public void testBeforeMethod(){
		System.out.println("Inside the BeforeMethod Method");
	}
	
	@After
	public void testAfterMethod(){
		System.out.println("Inside the AfterMethod Method");
	}
	
	
}