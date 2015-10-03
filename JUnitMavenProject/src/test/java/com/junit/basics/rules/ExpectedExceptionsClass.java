package com.junit.basics.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionsClass {
	
	@Rule
	public ExpectedException exp = ExpectedException.none();
	
	@Test
	public void exceptionsMethod(){
		exp.expect(ArrayIndexOutOfBoundsException.class);
		int[][] i = new int[2][2];
		
		i[0][0] = 10;
		i[0][1] = 11;
		
		i[1][0] = 12;
		i[1][1] = 13;
		i[1][2] = 14;
		
		System.out.println("Print: "+i[1][2]);
	}
	
}