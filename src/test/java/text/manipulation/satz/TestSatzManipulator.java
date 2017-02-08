package text.manipulation.satz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.NixBuchstabenManipulator;

public class TestSatzManipulator {

	private SatzManipulator satzManipulatorSUT;
	
	@Before
	public void setUp() {
		satzManipulatorSUT = new SatzManipulator(new NixBuchstabenManipulator());
	}
	
	@Test
	public void testSentenceHalloWelt() {
		satzManipulatorSUT.setSentence("Hallo Welt");
		Assert.assertEquals("Hallo Welt", satzManipulatorSUT.getSentence());
	}

	@Test
	public void testSentenceLong() {
		satzManipulatorSUT.setSentence("Lieber 5 Minuten feige, als das ganze Leben tot.");
		Assert.assertEquals("Lieber 5 Minuten feige, als das ganze Leben tot.", satzManipulatorSUT.getSentence());
	}
}
