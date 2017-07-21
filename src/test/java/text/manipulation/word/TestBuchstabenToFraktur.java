package text.manipulation.word;

import org.junit.Assert;
import org.junit.Test;

public class TestBuchstabenToFraktur {

	BuchstabenToFraktur fraktur = new BuchstabenToFraktur();
	
	@Test
	public void testSetWord_with0() {
		fraktur.setWord("0");
		Assert.assertEquals("&0fr;", fraktur.getWord());
	}

	@Test
	public void testSetWord_with123456789() {
		fraktur.setWord("123456789");
		Assert.assertEquals("&1fr;&2fr;&3fr;&4fr;&5fr;&6fr;&7fr;&8fr;&9fr;", fraktur.getWord());
	}

	@Test
	public void testSetWord_Fox() {
		fraktur.setWord("The quick brown fox jumps over the lazy dog");
		Assert.assertEquals("&Tfr;&hfr;&efr; &qfr;&ufr;&ifr;&cfr;&kfr; &bfr;&rfr;&ofr;&wfr;&nfr; &ffr;&ofr;&xfr; &jfr;&ufr;&mfr;&pfr;&sfr; &ofr;&vfr;&efr;&rfr; &tfr;&hfr;&efr; &lfr;&afr;&zfr;&yfr; &dfr;&ofr;&gfr;", fraktur.getWord());
	}

	@Test
	public void testSetWord_UppercaseFox() {
		fraktur.setWord("The quick brown fox jumps over the lazy dog".toUpperCase());
		Assert.assertEquals("&Tfr;&Hfr;&Efr; &Qfr;&Ufr;&Ifr;&Cfr;&Kfr; &Bfr;&Rfr;&Ofr;&Wfr;&Nfr; &Ffr;&Ofr;&Xfr; &Jfr;&Ufr;&Mfr;&Pfr;&Sfr; &Ofr;&Vfr;&Efr;&Rfr; &Tfr;&Hfr;&Efr; &Lfr;&Afr;&Zfr;&Yfr; &Dfr;&Ofr;&Gfr;", fraktur.getWord());
	}

}
