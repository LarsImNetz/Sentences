package text.manipulation.word;

import org.junit.Assert;
import org.junit.Test;

public class TestBuchstabenToOpf {
	BuchstabenToOpf opf = new BuchstabenToOpf();
	
	@Test
	public void testSetWord_with0() {
		opf.setWord("0");
		Assert.assertEquals("&#120792;", opf.getWord());
	}

	@Test
	public void testSetWord_with123456789() {
		opf.setWord("123456789");
		Assert.assertEquals("&#120793;&#120794;&#120795;&#120796;&#120797;&#120798;&#120799;&#120800;&#120801;", opf.getWord());
	}

	@Test
	public void testSetWord_Fox() {
		opf.setWord("The quick brown fox jumps over the lazy dog");
		Assert.assertEquals("&Topf;&hopf;&eopf; &qopf;&uopf;&iopf;&copf;&kopf; &bopf;&ropf;&oopf;&wopf;&nopf; &fopf;&oopf;&xopf; &jopf;&uopf;&mopf;&popf;&sopf; &oopf;&vopf;&eopf;&ropf; &topf;&hopf;&eopf; &lopf;&aopf;&zopf;&yopf; &dopf;&oopf;&gopf;", opf.getWord());
	}

	@Test
	public void testSetWord_UppercaseFox() {
		opf.setWord("The quick brown fox jumps over the lazy dog".toUpperCase());
		Assert.assertEquals("&Topf;&Hopf;&Eopf; &Qopf;&Uopf;&Iopf;&Copf;&Kopf; &Bopf;&Ropf;&Oopf;&Wopf;&Nopf; &Fopf;&Oopf;&Xopf; &Jopf;&Uopf;&Mopf;&Popf;&Sopf; &Oopf;&Vopf;&Eopf;&Ropf; &Topf;&Hopf;&Eopf; &Lopf;&#120120;&Zopf;&Yopf; &Dopf;&Oopf;&Gopf;", opf.getWord());
	}

}
