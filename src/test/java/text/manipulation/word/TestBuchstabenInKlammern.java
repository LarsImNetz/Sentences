package text.manipulation.word;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestBuchstabenInKlammern {
	BuchstabenInKlammern inKlammern = new BuchstabenInKlammern();
	
//	@Test
//	public void testSetWord_with0() {
//		inKlammern.setWord("0");
//		Assert.assertEquals("&#9450;", inKlammern.getWord());
//	}

	@Test
	public void testSetWord_with123456789() {
		inKlammern.setWord("123456789");
		Assert.assertEquals("&#9332;&#9333;&#9334;&#9335;&#9336;&#9337;&#9338;&#9339;&#9340;", inKlammern.getWord());
	}

	@Test
	public void testSetWord_witha() {
		inKlammern.setWord("ab");
		Assert.assertEquals("&#9372;&#9373;", inKlammern.getWord());
	}

//	@Test
//	public void testSetWord_Fox() {
//		circle.setWord("The quick brown fox jumps over the lazy dog");
//		Assert.assertEquals("&#9417;&#9431;&#9428; &#9440;&#9444;&#9432;&#9426;&#9434; &#9425;&#9441;&#9438;&#9446;&#9437; &#9429;&#9438;&#9447; &#9433;&#9444;&#9436;&#9439;&#9442; &#9438;&#9445;&#9428;&#9441; &#9443;&#9431;&#9428; &#9435;&#9424;&#9449;&#9448; &#9427;&#9438;&#9430;", circle.getWord());
//	}
//
//	@Test
//	public void testSetWord_UppercaseFox() {
//		circle.setWord("The quick brown fox jumps over the lazy dog".toUpperCase());
//		Assert.assertEquals("&#9417;&#9405;&#9402; &#9414;&#9418;&#9406;&#9400;&#9408; &#9399;&#9415;&#9412;&#9420;&#9411; &#9403;&#9412;&#9421; &#9407;&#9418;&#9410;&#9413;&#9416; &#9412;&#9419;&#9402;&#9415; &#9417;&#9405;&#9402; &#9409;&#9398;&#9423;&#9422; &#9401;&#9412;&#9404;", circle.getWord());
//	}
}
