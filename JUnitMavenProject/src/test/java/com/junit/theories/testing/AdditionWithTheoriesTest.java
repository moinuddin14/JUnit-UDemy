package com.junit.theories.testing;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class AdditionWithTheoriesTest {
  
@DataPoints
  public static int[] Integers() {
       return new int[]{-1, -2, -10, 1, 10, 1234567};
  }

  @Theory
  public void a_plus_b_is_greater_than_a_and_greater_than_b(Integer a, Integer b) {
      assumeTrue(a >0 && b > 0 );
      System.out.println("Value of A : "+ a +" , Value of B : "+ b +" , value of A+B : "+ (a+b));
	     assertTrue(a + b > a);
	     assertTrue(a + b > b);
	     System.out.println("*****************************");
  }
}