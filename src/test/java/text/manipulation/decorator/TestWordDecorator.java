package text.manipulation.decorator;

import org.junit.Assert;
import org.junit.Test;

import text.manipulation.word.BuchstabenManipulator;
import text.manipulation.word.NixBuchstabenManipulator;

public class TestWordDecorator {

	@Test
	public void testWordDecoratorNixBuchstabenManipulator() {
		WordDecorator nix = new WordDecorator(new NixBuchstabenManipulator());
		nix.setWord("Word");
		String newWord = nix.getWord();
		Assert.assertEquals("Word", newWord);
	}
	
	@Test
	public void testWordDecoratorBuchstabenManipulator() {
		WordDecorator verdrehen = new WordDecorator(new BuchstabenManipulator());
		verdrehen.setWord("abcd");
		
		Assert.assertEquals("acbd", verdrehen.getWord());		
	}
}
