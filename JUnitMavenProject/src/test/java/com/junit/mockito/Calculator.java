package com.junit.mockito;

public class Calculator {

	//Addition of two numbers
	public int doAdd (int a, int b){
		return (a+b);
	}
	
	//Multiply two numbers
	public int doMul(int a, int b){
		return (a*b);
	}
	
	//Division of two numbers
	public float doDiv(int a, int b){
		return (a/b);
	}
	
	//Return a Prime number
	public boolean isPrimeNumber(int param){
		return true;
	}
}