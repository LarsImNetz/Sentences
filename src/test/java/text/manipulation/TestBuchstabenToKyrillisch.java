package text.manipulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBuchstabenToKyrillisch {

	BuchstabenToKyrillisch buchstabenToKyrillischSUT;
	
	@Before
	public void setUp() {
		buchstabenToKyrillischSUT = new BuchstabenToKyrillisch();
	}

	@Test
	public void testHalloWelt() {
		buchstabenToKyrillischSUT.setWord("HALLO WELT");
		buchstabenToKyrillischSUT.perform();
		
		System.out.println(buchstabenToKyrillischSUT.getWord());			
	}
	
	@Test
	public void testB() {
		buchstabenToKyrillischSUT.setWord("B");
		buchstabenToKyrillischSUT.perform();
		
		System.out.println(buchstabenToKyrillischSUT.getWord());	
	}

	@Test
	public void testA() {
		buchstabenToKyrillischSUT.setWord("A");
		buchstabenToKyrillischSUT.perform();
		
		Assert.assertEquals("А", buchstabenToKyrillischSUT.getWord());
	}
}
