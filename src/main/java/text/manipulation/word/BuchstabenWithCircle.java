package text.manipulation.word;

import com.google.common.base.Preconditions;

/**
 * Wandelt Buchstaben Groß, Klein und Zahlen in Buchstaben im Kreis um
 */
public class BuchstabenWithCircle implements IWord {

	private String word;

	public BuchstabenWithCircle() {
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
		for (char buchstabe : word.toCharArray()) {
			String charAsString = String.valueOf(buchstabe);
			buffer.append(convertOnlyUppercase(convertOnlyLowercase(convertOnlyDigits(charAsString))));
		}
		return buffer.toString();
	}

	private String convertOnlyDigits(String character) {
		String neu = "";
		switch (character) {
			case "0":
				neu = "&#9450;";
				break;
			case "1":
				neu = "&#9312;";
				break;
			case "2":
				neu = "&#9313;";
				break;
			case "3":
				neu = "&#9314;";
				break;
			case "4":
				neu = "&#9315;";
				break;
			case "5":
				neu = "&#9316;";
				break;
			case "6":
				neu = "&#9317;";
				break;
			case "7":
				neu = "&#9318;";
				break;
			case "8":
				neu = "&#9319;";
				break;
			case "9":
				neu = "&#9320;";
				break;
			default:
				neu = character;
		}
		return neu;
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
		String neu = "";
		switch (character) {
			case "a":
				neu = "&#9424;";
				break;
			case "b":
				neu = "&#9425;";
				break;
			case "c":
				neu = "&#9426;";
				break;
			case "d":
				neu = "&#9427;";
				break;
			case "e":
				neu = "&#9428;";
				break;
			case "f":
				neu = "&#9429;";
				break;
			case "g":
				neu = "&#9430;";
				break;
			case "h":
				neu = "&#9431;";
				break;
			case "i":
				neu = "&#9432;";
				break;
			case "j":
				neu = "&#9433;";
				break;
			case "k":
				neu = "&#9434;";
				break;
			case "l":
				neu = "&#9435;";
				break;
			case "m":
				neu = "&#9436;";
				break;
			case "n":
				neu = "&#9437;";
				break;
			case "o":
				neu = "&#9438;";
				break;
			case "p":
				neu = "&#9439;";
				break;
			case "q":
				neu = "&#9440;";
				break;
			case "r":
				neu = "&#9441;";
				break;
			case "s":
				neu = "&#9442;";
				break;
			case "t":
				neu = "&#9443;";
				break;
			case "u":
				neu = "&#9444;";
				break;
			case "v":
				neu = "&#9445;";
				break;
			case "w":
				neu = "&#9446;";
				break;
			case "x":
				neu = "&#9447;";
				break;
			case "y":
				neu = "&#9448;";
				break;
			case "z":
				neu = "&#9449;";
				break;
			default:
				neu = character;
		}
		return neu;
	}

}
