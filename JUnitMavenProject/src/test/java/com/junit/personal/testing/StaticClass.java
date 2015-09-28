package com.junit.personal.testing;

public class StaticClass {

	public static int i = 10;
	public int j = 20;
	public class StaticClassInner{
		
		public StaticClassInner(){
			System.out.println("Inside StaticClassInner, Static Instance variable: "+i);
			System.out.println("Inside StaticClassInner, Non-Static Instance variable: "+j);
		}
		
	}
	
	public StaticClass(){
		System.out.println("Inside StaticClass");
	}
}
