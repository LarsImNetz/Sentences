package text;

import java.util.function.Consumer;

import org.junit.Ignore;
import org.junit.Test;

public class TestLambda {

	@Ignore("unverständlich!")
	@Test
	public void test() {
		String abc = "abc";
		abc.chars().forEach(c -> System.out.println((char)c));
	}

	@Test
	public void testConsum() {
		Consumer<String> out = s -> convert(s);
		out.accept("Test");
	}
	
	private static String convert(String s) {
		return s;
	}
	
}
