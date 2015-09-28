package com.junit.personal.testing;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ExternalResourceClass {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Inside the before class method");
	}
	
	@Before
	public void beforeMethod(){
		System.out.println("Inside the before method");
	}
	
	@Rule
	public ExternalResource er = new ExternalResource() {
		@Override
	      protected void before() throws Throwable {
	          System.out.println("Before Method of ExternalResource");
	         };

	      @Override
	      protected void after() {
	          System.out.println("After Method of ExternalResource");
	         };

	};
	
	@Test
	public void testMethod(){
		System.out.println("Inside Test Method");
	}
	
}
