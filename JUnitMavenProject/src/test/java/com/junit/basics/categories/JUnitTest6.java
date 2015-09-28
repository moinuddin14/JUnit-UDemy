package com.junit.basics.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JUnitTest6 extends JUnitTest4{

	@Category(RegressionTests.class)
	@Test
	public void JUnitTest6Method1(){
		System.out.println("Inside the method JUnitTest6Method1");
	}
	
	@Test
	public void JUnitTest6Method2(){
		System.out.println("Inside the method JUnitTest6Method2");
	}
}
