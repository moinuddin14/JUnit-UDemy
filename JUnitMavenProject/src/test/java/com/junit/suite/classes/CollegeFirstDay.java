package com.junit.suite.classes;
import java.util.Arrays;

public class CollegeFirstDay {

	public String[] whatShouldBeInMyBag() {
		String[] collegeStuf = {"TextBooks Notebooks Pens"};
		System.out.println("My College bag contains: "+Arrays.toString(collegeStuf));
		return collegeStuf;
	}

	public String[] ahAddIDCardElseIWillNotBeAllowed() {
		String[] collegeStuf = {"Books Notebooks Pens IDCard"};
		System.out.println("Hope, I Got all the stuff i needed for the first day: "+Arrays.toString(collegeStuf));
		return collegeStuf;
	}
}