package com.example;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	
	@Test
	public void findTheGreatestFromAllData() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15,24,3});
		
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
		
	}
	
	@Test
	public void findTheGreatestFromOneData() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
		
	}
}
