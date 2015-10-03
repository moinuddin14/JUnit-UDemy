package com.junit.basics.rules;

import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClassRuleTimeOutRuleClass {
	
	@ClassRule
	public static Timeout timeout = new Timeout(5, TimeUnit.SECONDS);
	
	@Test
	public void testMethodOne() throws InterruptedException{
		Thread.sleep(6000);
		System.out.println("Inside testMethodOne");
	}
	
	@Test
	public void testMethodTwo(){
		System.out.println("Inside testMethodTwo");
		int i = 1;
		while(i>0)
			System.out.println(i);
	}
	
	@Test
	public void testMethodThree(){
		System.out.println("Inside testMethodThree");
	}
	
	@Test
	public void testMethodFour(){
		System.out.println("Inside testMethodFour");
	}
	
	@Test
	public void testMethodFive(){
		System.out.println("Inside testMethodFive");
	}
}