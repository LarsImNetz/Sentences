package text.manipulation.word;

import org.junit.Test;

import text.manipulation.word.BuchstabenManipulator;

import org.junit.Assert;

public class TestBuchstabenManipulator {

	@Test(expected = IllegalArgumentException.class)
	public void testBuchstabenNachbarnTauschen_null() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord(null);
	}

	@Test
	public void testBuchstabenNachbarnTauschen_empty() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("");
		Assert.assertEquals("", manipulator.getWord());
	}

	@Test
	public void testBuchstabenNachbarnTauschen_abcd() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("abcd");
		Assert.assertEquals("acbd", manipulator.getWord());
	}

	@Test
	public void testBuchstabenZweitenMitLetztemTauschen_abc() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("abc");
		Assert.assertEquals("abc", manipulator.getWord());
	}

	@Test
	public void testBuchstabenZweitenMitLetztemTauschen_abcd() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("abcd");
		Assert.assertEquals("acbd", manipulator.getWord());
	}
	
	@Test
	public void testPerformWith4Chars() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("abcd");
		Assert.assertEquals("acbd", manipulator.getWord());		
	}

	@Test
	public void testPerformWith5Chars() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("abcde");
		Assert.assertEquals("acbde", manipulator.getWord());		
	}

	@Test
	public void testPerformWith6Chars() {
		BuchstabenManipulator manipulator = new BuchstabenManipulator();
		manipulator.setWord("abcdef");
		Assert.assertEquals("acbedf", manipulator.getWord());		
	}
}
