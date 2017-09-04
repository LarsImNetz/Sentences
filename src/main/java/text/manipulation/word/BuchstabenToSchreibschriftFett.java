package text.manipulation.word;

import com.google.common.base.Preconditions;

/**
 * Wandelt Buchstaben Groß, Klein und Zahlen in SchreibschriftBuchstaben fett um
 */
public class BuchstabenToSchreibschriftFett implements IWord {

	private String word;

	public BuchstabenToSchreibschriftFett() {
	}

	@Override
	public void setWord(String word) {
		Preconditions.checkArgument(word != null);
		this.word = word;
	}

	@Override
	public String getWord() {
		return perform();
	}

	private String perform() {
        StringBuilder buffer = new StringBuilder();
		for (char buchstabe: word.toCharArray()) {
            String charAsString = String.valueOf(buchstabe);
			buffer.append(convertOnlyUppercase(convertOnlyLowercase(convertOnlyDigits(charAsString))));
		}
        return buffer.toString();
	}

	private String convertOnlyDigits(String character) {
		int n = character.codePointAt(0) - '0';
		if (n < 0 || n >= 10) {
			return character;
		}
		n += 120812;
		
		return "&#" + n + ";";
	}
        
	private String convertOnlyUppercase(String character) {
		int n = character.codePointAt(0) - 'A';
		if (n < 0 || n >= 26) {
			return character;
		}
		n += 120016;
		
		return "&#" + n + ";";
	}

	private String convertOnlyLowercase(String character) {
		int n = character.codePointAt(0) - 'a';
		if (n < 0 || n >= 26) {
			return character;
		}
		n += 120016+26;
		
		return "&#" + n + ";";
	}

}
