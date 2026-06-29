package com.bankapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class MyServiceTest {
	
	@Test
	public void TestExternalApi() {
		ExternalApi mockApi = Mockito.mock(ExternalApi.class);
		
		when(mockApi.getData()).thenReturn("Mock Data");
		
		MyService service = new MyService(mockApi);
		String result = service.fetchData();
		
		assertEquals("Mock Data", result);
	}
	
	@Test
	public void testVerifyInteraction() {
		ExternalApi mockApi = Mockito.mock(ExternalApi.class);
		MyService service = new MyService(mockApi);
		
		service.fetchData();
		
		verify(mockApi, times(1)).getData();
	}
}
