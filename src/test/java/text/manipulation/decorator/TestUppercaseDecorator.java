package text.manipulation.decorator;

import org.junit.Assert;
import org.junit.Test;

import text.manipulation.word.NixBuchstabenManipulator;

public class TestUppercaseDecorator {
	@Test
	public void testWordDecoratorNixBuchstabenManipulator() {
		WordDecorator nix = new WordDecorator(new UppercaseDecorator(new NixBuchstabenManipulator()));
		nix.setWord("Word öh");
		String newWord = nix.getWord();
		Assert.assertEquals("WORD ÖH", newWord);
	}
	

}
