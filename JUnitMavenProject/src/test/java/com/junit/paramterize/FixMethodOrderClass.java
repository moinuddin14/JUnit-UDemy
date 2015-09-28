package com.junit.paramterize;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixMethodOrderClass {

	@Test
	public void testMethodTwo(){
		System.out.println("Inside testMethodTwo");
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
	
	@Test
	public void testMethodSix(){
		System.out.println("Inside testMethodSix");
	}
	
	@Test
	public void testMethodSeven(){
		System.out.println("Inside testMethodSeven");
	}
	
}