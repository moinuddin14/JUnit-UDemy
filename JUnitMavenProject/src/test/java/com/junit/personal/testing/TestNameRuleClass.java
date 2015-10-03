package com.junit.personal.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameRuleClass {

	@Rule
	public TestName testName = new TestName();
	
	@Test
	public void implTestNameRuleMethod(){
		System.out.println(testName.getMethodName());
	}
	
	@After
	public void testDown(){
		Assert.assertEquals("implTestNameRuleMethod*", testName.getMethodName());
		System.out.println("Matching");
	}
}
