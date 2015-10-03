package com.junit.personal.testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.Matchers.*;

public class ExpectedExceptionsClass {
	
	@Rule
	public ExpectedException exp = ExpectedException.none();
	
	@Test
	public void expectedExceptionsMethod() {
		exp.expect(ArrayIndexOutOfBoundsException.class);
		System.out.println("Before the Wrong Array");
		int[][] i = new int[1][1];
		
		i[0][0]=10;
		i[0][1]=11;
		
		i[1][0]=12;
		i[1][1]=13;
		i[1][2]=14;
		System.out.println("Print: "+i[1][2]);
		System.out.println("After the Wrong Array");
	}
	
	@Test
	  public void throwsNullPointerExceptionWithMessage() {
		exp.expect(NullPointerException.class);
		exp.expectMessage("happened?");
		exp.expectMessage(startsWith("What"));
	    throw new NullPointerException("What happened?");
	  }
}