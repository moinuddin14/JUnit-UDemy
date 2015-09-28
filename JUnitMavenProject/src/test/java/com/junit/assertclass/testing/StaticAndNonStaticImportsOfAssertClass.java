package com.junit.assertclass.testing;

import org.junit.Assert;
import org.junit.Test;
import  static org.junit.Assert.*;

public class StaticAndNonStaticImportsOfAssertClass {

	@Test
	public void assertClassExample(){
		
		int i = 10;
		int j = 20;
		
		assertEquals(40, (i+j));
		System.out.println("Successfully asserted for AssertEquals");
	}
	
}