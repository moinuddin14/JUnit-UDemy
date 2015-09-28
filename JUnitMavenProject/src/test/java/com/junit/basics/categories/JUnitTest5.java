package com.junit.basics.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JUnitTest5 {

	@Category(FastTests.class)
	@Test
	public void JUnitTest5Method1(){
		System.out.println("Inside the method JUnitTest5Method1");
	}
	
	@Category(RegressionTests.class)
	@Test
	public void JUnitTest5Method2(){
		System.out.println("Inside the method JUnitTest5Method2");
	}
	
	@Category(SlowTests.class)
	@Test
	public void JUnitTest5Method3(){
		System.out.println("Inside the method JUnitTest5Method3");
	}
	
}
