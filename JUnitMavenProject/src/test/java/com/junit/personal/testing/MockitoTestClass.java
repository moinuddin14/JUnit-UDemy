package com.junit.personal.testing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class MockitoTestClass {

	Math mathObj;
	
	@Before
	public void create() {
		mathObj = mock(Math.class);
		when(mathObj.isPrime()).thenReturn(30);
	}
	
	@Test
	public void isPrimeTestMethod(){
		System.out.println(mathObj.isPrime());
	}
}
