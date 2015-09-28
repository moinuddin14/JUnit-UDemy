package com.junit.basics.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

//Categories - SlowTests, FastTests, SanityTests, RegressionTests

public class JUnitTest3 {

	@Category(SlowTests.class)
	@Test
	public void JUnitTest3Method1(){
		System.out.println("Inside the method JUnitTest3Method1");
	}
	
	@Category({SlowTests.class, RegressionTests.class})
	@Test
	public void JUnitTest3Method2(){
		System.out.println("Inside the method JUnitTest3Method2");
	}
	
	@Category(FastTests.class)
	@Test
	public void JUnitTest3Method3(){
		System.out.println("Inside the method JUnitTest3Method3");
	}
	
	@Category(SanityTests.class)
	@Test
	public void JUnitTest3Method4(){
		System.out.println("Inside the method JUnitTest3Method4");
	}
}
