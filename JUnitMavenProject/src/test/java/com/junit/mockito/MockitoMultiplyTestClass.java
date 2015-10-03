package com.junit.mockito;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class MockitoMultiplyTestClass {
	
	@Mock(name="Calculator Mock Object")
	Calculator calc;
	
	@Before
	public void setup(){
		initMocks(this);
		when(calc.doMul(anyInt(), eq(0))).thenReturn(0);
	}
	
	@Test
	public void testMultiply(){
		System.out.println(calc.doMul(20, 0));
	}
}
