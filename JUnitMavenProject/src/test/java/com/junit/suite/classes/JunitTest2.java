package com.junit.suite.classes;
import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest2 {

	CollegeFirstDay school = new CollegeFirstDay();
   String[] collegeStuf= {"Books", "Notebooks", "Pens", "Pencils"};

   @Test
   
   public void testAddPencils() {	
      System.out.println("Inside ahAddIDCardElseWillNotBeAllowed()");    
      //assertArrayEquals(collegeStuf, school.ahAddIDCardElseIWillNotBeAllowed());     
      System.out.println("****************END OF JUNITTEST2****************");

   }
   
}