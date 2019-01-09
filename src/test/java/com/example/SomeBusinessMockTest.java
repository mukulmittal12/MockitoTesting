package com.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class SomeBusinessMockTest {

	@Test
	public void findTheGreatestFromAllData() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15,24,3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
		
	}
	
	@Test
	public void findTheGreatestFromOneData() {
		
		DataService dataServiceMock = mock(DataService.class);
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
		
	}
}
