package text.manipulation.decorator;

import org.junit.Assert;
import org.junit.Test;

import text.manipulation.word.NixBuchstabenManipulator;

public class TestNoUmlautDecorator {

	private NoUmlautDecorator decoratorSUT;
	
	@Test
	public void testNoUmlautDecorator() {
		decoratorSUT = new NoUmlautDecorator(new NixBuchstabenManipulator());
		decoratorSUT.setWord("Word öh");
		String newWord = decoratorSUT.getWord();
		Assert.assertEquals("Word oeh", newWord);
	}
}
