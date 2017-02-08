package text.manipulation.word;

import org.junit.Assert;
import org.junit.Test;

public class TestNoUmlaut {

	@Test
	public void testNoUmlaut() {
		NoUmlaut noUmlaut = new NoUmlaut();
		noUmlaut.setWord("äöüßÄÖÜ jetzt ohne Umlaute");
		String noUmlaute = noUmlaut.getWord();
		
		Assert.assertEquals("aeoeuessAeOeUe jetzt ohne Umlaute", noUmlaute);
	}
}
