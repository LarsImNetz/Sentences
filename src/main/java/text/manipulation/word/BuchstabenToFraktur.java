package text.manipulation.word;

import com.google.common.base.Preconditions;

/**
 * Wandelt Buchstaben Groß und klein in Frakturschrift
 */
public class BuchstabenToFraktur implements IWord {

	private String word;

	public BuchstabenToFraktur() {
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
		int n = character.codePointAt(0) - '0';
		if (n < 0 || n >= 10) {
			return character;
		}
		n += 120822;
		
		return "&#" + n + ";";
	}
        
	private String convertOnlyUppercase(String character) {
		String neu = "";
		switch (character) {
			case "A":
				neu = "&Afr;"; // Aoopf
				break;
			case "B":
				neu = "&Bfr;";
				break;
			case "C":
				neu = "&Cfr;";
				break;
			case "D":
				neu = "&Dfr;";
				break;
			case "E":
				neu = "&Efr;";
				break;
			case "F":
				neu = "&Ffr;";
				break;
			case "G":
				neu = "&Gfr;";
				break;
			case "H":
				neu = "&Hfr;";
				break;
			case "I":
				neu = "&Ifr;";
				break;
			case "J":
				neu = "&Jfr;";
				break;
			case "K":
				neu = "&Kfr;";
				break;
			case "L":
				neu = "&Lfr;";
				break;
			case "M":
				neu = "&Mfr;";
				break;
			case "N":
				neu = "&Nfr;";
				break;
			case "O":
				neu = "&Ofr;";
				break;
			case "P":
				neu = "&Pfr;";
				break;
			case "Q":
				neu = "&Qfr;";
				break;
			case "R":
				neu = "&Rfr;";
				break;
			case "S":
				neu = "&Sfr;";
				break;
			case "T":
				neu = "&Tfr;";
				break;
			case "U":
				neu = "&Ufr;";
				break;
			case "V":
				neu = "&Vfr;";
				break;
			case "W":
				neu = "&Wfr;";
				break;
			case "X":
				neu = "&Xfr;";
				break;
			case "Y":
				neu = "&Yfr;";
				break;
			case "Z":
				neu = "&Zfr;";
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
				neu = "&afr;"; // Aoopf
				break;
			case "b":
				neu = "&bfr;";
				break;
			case "c":
				neu = "&cfr;";
				break;
			case "d":
				neu = "&dfr;";
				break;
			case "e":
				neu = "&efr;";
				break;
			case "f":
				neu = "&ffr;";
				break;
			case "g":
				neu = "&gfr;";
				break;
			case "h":
				neu = "&hfr;";
				break;
			case "i":
				neu = "&ifr;";
				break;
			case "j":
				neu = "&jfr;";
				break;
			case "k":
				neu = "&kfr;";
				break;
			case "l":
				neu = "&lfr;";
				break;
			case "m":
				neu = "&mfr;";
				break;
			case "n":
				neu = "&nfr;";
				break;
			case "o":
				neu = "&ofr;";
				break;
			case "p":
				neu = "&pfr;";
				break;
			case "q":
				neu = "&qfr;";
				break;
			case "r":
				neu = "&rfr;";
				break;
			case "s":
				neu = "&sfr;";
				break;
			case "t":
				neu = "&tfr;";
				break;
			case "u":
				neu = "&ufr;";
				break;
			case "v":
				neu = "&vfr;";
				break;
			case "w":
				neu = "&wfr;";
				break;
			case "x":
				neu = "&xfr;";
				break;
			case "y":
				neu = "&yfr;";
				break;
			case "z":
				neu = "&zfr;";
				break;
			default:
				neu = character;
		}
		return neu;
	}

}
