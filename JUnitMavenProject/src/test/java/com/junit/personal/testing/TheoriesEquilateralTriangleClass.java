package com.junit.personal.testing;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static org.hamcrest.Matchers.*;

@RunWith(Theories.class)
public class TheoriesEquilateralTriangleClass {

	public static int j = 1;
	@DataPoints
	public static int[] firstSide(){
		return new int[]{
				-1, -5, -20, 9
		};
	}
	
	@DataPoints
	public static int[] secondSide(){
		return new int[]{
				-1, -5, -20, 3, 8
		};
	}
	
	@DataPoints
	public static int[] thridSide(){
		return new int[]{
				-1, -5, -20, 7, 5
		};
	}
	
	@DataPoint
	public static int i = 6;
	
	@Theory
	public void equlateralTrianglePerimeter(int a, int b, int c){
		assumeTrue(a>0 && b>0 && c>0 && a==b && b==c);
		System.out.println("Values of A: "+ a +" B: "+ b +" C: "+ c);
		//Perimeter
		assertSame((3*a), (3*b));
		System.out.println("Shame to Shame!");
	}
	
	@Theory
	public void areaOfRectangle(int a, int b, int c, int d){
		/*assumeTrue(a>0 && b>0 && c>0 && a==c && b==d && a!=b && a!=b && b!=c && c!=d);
		System.out.println(a+" *** "+b+" *** "+c+" *** "+d);
		//Assume
		System.out.println("The number of different combinations for Rectangle are "+j);
		j++;*/
		
		//assertTrue(2>5);
		assertThat(2, greaterThan(5));
	}
	
	
}