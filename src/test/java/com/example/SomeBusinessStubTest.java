package com.example;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void findTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(50, result);
		
	}
	
	class DataServiceStub implements DataService{

		@Override
		public int[] retrieveAllData() {
			
			return new int[] {24,6,50};
		}
		
	}

}
