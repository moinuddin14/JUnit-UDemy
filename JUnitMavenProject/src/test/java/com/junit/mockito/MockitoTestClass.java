package com.junit.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
public class MockitoTestClass {

	
	//Comments
	Calculator cal;
	
	@Before
	public void setup(){
		cal = mock(Calculator.class);
		when(cal.isPrimeNumber(30)).thenCallRealMethod();
	}
	
	@Test
	public void testMethod(){
		System.out.println(cal.isPrimeNumber(30));
	}
}
