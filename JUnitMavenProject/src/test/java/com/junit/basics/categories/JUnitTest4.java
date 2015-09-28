package com.junit.basics.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTests.class)
public class JUnitTest4 {

	@Test
	public void JUnitTest4Method1(){
		System.out.println("Inside the method JUnitTest4Method1");
	}
	
	@Category(RegressionTests.class)
	@Test
	public void JUnitTest4Method2(){
		System.out.println("Inside the method JUnitTest4Method2");
	}
	
	@Test
	public void JUnitTest4Method3(){
		System.out.println("Inside the method JUnitTest4Method3");
	}
	
	@Test
	public void JUnitTest4Method4(){
		System.out.println("Inside the method JUnitTest4Method4");
	}
	
}
