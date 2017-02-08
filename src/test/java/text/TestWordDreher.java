package text;

import org.junit.Assert;
import org.junit.Test;

public class TestWordDreher {

	@Test
	public void testVerdrehen_ein() throws Exception {
		WordDreher word = new WordDreher();
		word.setWord("ein");
		Assert.assertEquals("ein", word.getWord());
	}

	@Test
	public void testVerdrehen_zwei() throws Exception {
		WordDreher word = new WordDreher();
		word.setWord("zwei");
		Assert.assertEquals("zewi", word.getWord());
	}

	// Word verdrehen mit ungerader Anzahl Buchstaben
	@Test
	public void testVerdrehen_gehen() throws Exception {
		WordDreher word = new WordDreher();
		word.setWord("gehen");
		Assert.assertEquals("gheen", word.getWord());
	}

	// Word mit 6 Buchstaben verdrehen
	@Test
	public void testVerdrehen_laufen() throws Exception {
		WordDreher word = new WordDreher();
		word.setWord("laufen");
		Assert.assertEquals("luaefn", word.getWord());
	}

	// Word mit 6 Buchstaben verdrehen
	@Test
	public void testVerdrehen_vergleich() throws Exception {
		WordDreher word = new WordDreher();
		word.setWord("vergleich");
		Assert.assertEquals("vrelgiech", word.getWord());
	}
}
