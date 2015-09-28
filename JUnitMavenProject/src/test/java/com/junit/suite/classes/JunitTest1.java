package com.junit.suite.classes;
import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest1 {

	CollegeFirstDay college = new CollegeFirstDay();
   String[] collegeStuf = {"Books", "Notebooks", "Pens"};

   @Test
   public void testPrepareMyBag() {	
      System.out.println("Inside whatShouldBeInMyBag()");    

      for(String str:college.whatShouldBeInMyBag()){
    	  String[] str1 = str.split(" ");
    	  for(String str2:str1){
    		  System.out.println(str2);
    	  }
      }
    //assertArrayEquals(collegeStuf, college.whatShouldBeInMyBag());
    System.out.println("****************END OF JUNITTEST1****************");
   
   }
}