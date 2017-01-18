package text;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import text.manipulation.NixBuchstabenManipulator;

public class TestSatzManipulator {

	private SatzManipulator satzManipulatorSUT;
	
	@Before
	public void setUp() {
		satzManipulatorSUT = new SatzManipulator(new NixBuchstabenManipulator());
	}
	
	@Test
	public void testSentenceHalloWelt() {
		satzManipulatorSUT.setSentence("Hallo Welt");
		satzManipulatorSUT.perform();
		Assert.assertEquals("Hallo Welt", satzManipulatorSUT.getSentence());
	}

	@Test
	public void testSentenceLong() {
		satzManipulatorSUT.setSentence("Lieber 5 Minuten feige, als das ganze Leben tot.");
		satzManipulatorSUT.perform();
		Assert.assertEquals("Lieber 5 Minuten feige, als das ganze Leben tot.", satzManipulatorSUT.getSentence());
	}
}
