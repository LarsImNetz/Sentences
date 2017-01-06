package org.lla_private.service.satzdreher;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestSatzDreherService {

	private SatzDreherService serviceSUT;
	
	@Before
	public void setUp() {
		serviceSUT = Mockito.mock(SatzDreherService.class);
		Mockito.when(serviceSUT.satzDrehen(Mockito.anyString())).thenReturn("verdrehter Satz");
	}
	
	@Test
	public void testSatzDreherService(){
		String actual = serviceSUT.satzDrehen("egal");
		Assert.assertEquals("verdrehter Satz", actual);
	}
}
