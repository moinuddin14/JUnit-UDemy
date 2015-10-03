package com.junit.basics.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ExternalResourceClass {

	@Rule
	public ExternalResource externalResource = new ExternalResource() {
		protected void before() throws Throwable {
	        System.out.println("Inside the before method of ExternalResource");
	    }

	    protected void after() {
	        System.out.println("Inside the after method of ExternalResource");
	    }
	};
	
	@Test
	public void insideTestMethod(){
		System.out.println("Inside the Test Method");
	}
	
}