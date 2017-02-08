package text.manipulation.word;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import text.manipulation.word.BuchstabenToKyrillisch;

public class TestBuchstabenToKyrillisch {

	BuchstabenToKyrillisch buchstabenToKyrillischSUT;
	
	@Before
	public void setUp() {
		buchstabenToKyrillischSUT = new BuchstabenToKyrillisch();
	}

	@Test
	public void testHalloWelt() {
		buchstabenToKyrillischSUT.setWord("HALLO WELT");
		
		System.out.println(buchstabenToKyrillischSUT.getWord());			
	}
	
	@Test
	public void testB() {
		buchstabenToKyrillischSUT.setWord("B");
		
		System.out.println(buchstabenToKyrillischSUT.getWord());	
	}

	@Test
	public void testA() {
		buchstabenToKyrillischSUT.setWord("A");
		
		Assert.assertEquals("А", buchstabenToKyrillischSUT.getWord());
	}
}
