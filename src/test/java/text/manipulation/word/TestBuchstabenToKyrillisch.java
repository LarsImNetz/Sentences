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
	
	@Test
	public void testA2Z() {
		buchstabenToKyrillischSUT.setWord("The quick brown fox jumps over the lazy dog".toUpperCase());
		Assert.assertNotNull(buchstabenToKyrillischSUT.getWord());
	}
	
	@Test
	public void testSetWord_with0() {
		buchstabenToKyrillischSUT.setWord("0");
		Assert.assertEquals("0", buchstabenToKyrillischSUT.getWord());
	}

	@Test
	public void testSetWord_with123456789() {
		buchstabenToKyrillischSUT.setWord("123456789");
		Assert.assertEquals("123456789", buchstabenToKyrillischSUT.getWord());
	}

	@Test
	public void testSetWord_Fox() {
		buchstabenToKyrillischSUT.setWord("The quick brown fox jumps over the lazy dog");
		Assert.assertEquals("Тhe quick brown fox jumps over the lazy dog", buchstabenToKyrillischSUT.getWord());
	}

	@Test
	public void testSetWord_UppercaseFox() {
		buchstabenToKyrillischSUT.setWord("The quick brown fox jumps over the lazy dog".toUpperCase());
		Assert.assertEquals("ТНЭ QUІСК ВЯОШИ FОХ ЈUМРЅ ОVЭЯ ТНЭ ГАZУ DОG", buchstabenToKyrillischSUT.getWord());
	}

}
