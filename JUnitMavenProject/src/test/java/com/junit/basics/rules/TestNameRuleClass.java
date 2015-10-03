package com.junit.basics.rules;

import junit.framework.Assert;
import org.junit.After;
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
	public void wantToAssertTestNameRule(){
		Assert.assertEquals("implTestNameRuleMethod*", testName.getMethodName());
	}
}