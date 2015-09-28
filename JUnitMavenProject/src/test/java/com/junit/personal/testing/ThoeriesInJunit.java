package com.junit.personal.testing;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assume.*;
import static org.junit.Assert.*;

@RunWith(Theories.class)
public class ThoeriesInJunit {

	 @DataPoints
	  public static int[] integers() {
	     return new int[]{
	                   -1, -10, -1234567,1, 10, 1234567};
	  }

	  @Theory
	  public void a_plus_b_is_greater_than_a_and_greater_than_b(Integer a, Integer b) {
	     assumeTrue(a >0 && b > 0 );
	     System.out.println("Value of A : "+ a +" , Value of B : "+ b +" , value of A+B : "+ a+b);
	     assertTrue(a + b > a);
	     assertTrue(a + b > b);
	     System.out.println("*****************************");
	  }

	  /*@Theory
	  public void addition_is_commutative(Integer a, Integer b) {
	     assertTrue(a + b == b + a);
	  }*/
	
}