package com.junit.basics.rules;

public class TestJavaClass {

	
	public static void main(String[] args) {
		
		String str = "Hello.World";
		String delimiter = "\\.";
		String[] str1 = str.split(delimiter);
		System.out.println(str1.length);
	}
}