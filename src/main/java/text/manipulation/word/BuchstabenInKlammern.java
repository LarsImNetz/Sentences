package text.manipulation.word;

import com.google.common.base.Preconditions;

/**
 * Wandelt Buchstaben Groß, Klein und Zahlen in Buchstaben im Kreis um
 */
public class BuchstabenInKlammern implements IWord {

	private String word;

	public BuchstabenInKlammern() {
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
		if (n < 1 || n >= 10) {
			return character;
		}
		n += 9331;
		
		return "&#" + n + ";";
	}
        
	private String convertOnlyUppercase(String character) {
		String neu = "";
		switch (character) {
		case "A":
			neu = "&#9398;"; // "&Aopf;"; // Aoopf
			break;
		case "B":
			neu = "&#9399;";
			break;
		case "C":
			neu = "&#9400;";
			break;
		case "D":
			neu = "&#9401;";
			break;
		case "E":
			neu = "&#9402;";
			break;
		case "F":
			neu = "&#9403;";
			break;
		case "G":
			neu = "&#9404;";
			break;
		case "H":
			neu = "&#9405;";
			break;
		case "I":
			neu = "&#9406;";
			break;
		case "J":
			neu = "&#9407;";
			break;
		case "K":
			neu = "&#9408;";
			break;
		case "L":
			neu = "&#9409;";
			break;
		case "M":
			neu = "&#9410;";
			break;
		case "N":
			neu = "&#9411;";
			break;
		case "O":
			neu = "&#9412;";
			break;
		case "P":
			neu = "&#9413;";
			break;
		case "Q":
			neu = "&#9414;";
			break;
		case "R":
			neu = "&#9415;";
			break;
		case "S":
			neu = "&#9416;";
			break;
		case "T":
			neu = "&#9417;";
			break;
		case "U":
			neu = "&#9418;";
			break;
		case "V":
			neu = "&#9419;";
			break;
		case "W":
			neu = "&#9420;";
			break;
		case "X":
			neu = "&#9421;";
			break;
		case "Y":
			neu = "&#9422;";
			break;
		case "Z":
			neu = "&#9423;";
			break;
		default:
            neu = character;
		}
		return neu;
	}

	private String convertOnlyLowercase(String character) {
		int n = character.codePointAt(0) - 'a';
		if (n < 0 || n >= 26) {
			return character;
		}
		n += 9372;
		
		return "&#" + n + ";";
	}

}
