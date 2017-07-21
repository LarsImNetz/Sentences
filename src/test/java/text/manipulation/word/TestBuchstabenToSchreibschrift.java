package text.manipulation.word;

import org.junit.Assert;
import org.junit.Test;

public class TestBuchstabenToSchreibschrift {
	BuchstabenToSchreibschrift schreibschrift = new BuchstabenToSchreibschrift();
	
	@Test
	public void testSetWord_with0() {
		schreibschrift.setWord("0");
		Assert.assertEquals("0", schreibschrift.getWord());
	}

	@Test
	public void testSetWord_with123456789() {
		schreibschrift.setWord("123456789");
		Assert.assertEquals("123456789", schreibschrift.getWord());
	}

	@Test
	public void testSetWord_Fox() {
		schreibschrift.setWord("The quick brown fox jumps over the lazy dog");
		Assert.assertEquals("&Tscr;&hscr;&escr; &qscr;&uscr;&iscr;&cscr;&kscr; &bscr;&rscr;&oscr;&wscr;&nscr; &fscr;&oscr;&xscr; &jscr;&uscr;&mscr;&pscr;&sscr; &oscr;&vscr;&escr;&rscr; &tscr;&hscr;&escr; &lscr;&ascr;&zscr;&yscr; &dscr;&oscr;&gscr;", schreibschrift.getWord());
	}

	@Test
	public void testSetWord_UppercaseFox() {
		schreibschrift.setWord("The quick brown fox jumps over the lazy dog".toUpperCase());
		Assert.assertEquals("&Tscr;&Hscr;&Escr; &Qscr;&Uscr;&Iscr;&Cscr;&Kscr; &Bscr;&Rscr;&Oscr;&Wscr;&Nscr; &Fscr;&Oscr;&Xscr; &Jscr;&Uscr;&Mscr;&Pscr;&Sscr; &Oscr;&Vscr;&Escr;&Rscr; &Tscr;&Hscr;&Escr; &Lscr;&Ascr;&Zscr;&Yscr; &Dscr;&Oscr;&Gscr;", schreibschrift.getWord());
	}
}
