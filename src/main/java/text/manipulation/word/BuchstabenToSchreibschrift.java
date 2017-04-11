package text.manipulation.word;

import com.google.common.base.Preconditions;

/**
 * Wandelt Buchstaben in Schreibschrift
 */
public class BuchstabenToSchreibschrift implements IWord {

	private String word;

	public BuchstabenToSchreibschrift() {
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
			buffer.append(convertOnlyUppercase(convertOnlyLowercase(charAsString)));
		}
		return buffer.toString();
	}

	private String convertOnlyUppercase(String character) {
		String neu = "";
		switch (character) {
			case "A":
				neu = "&Ascr;"; // Aoopf
				break;
			case "B":
				neu = "&Bscr;";
				break;
			case "C":
				neu = "&Cscr;";
				break;
			case "D":
				neu = "&Dscr;";
				break;
			case "E":
				neu = "&Escr;";
				break;
			case "F":
				neu = "&Fscr;";
				break;
			case "G":
				neu = "&Gscr;";
				break;
			case "H":
				neu = "&Hscr;";
				break;
			case "I":
				neu = "&Iscr;";
				break;
			case "J":
				neu = "&Jscr;";
				break;
			case "K":
				neu = "&Kscr;";
				break;
			case "L":
				neu = "&Lscr;";
				break;
			case "M":
				neu = "&Mscr;";
				break;
			case "N":
				neu = "&Nscr;";
				break;
			case "O":
				neu = "&Oscr;";
				break;
			case "P":
				neu = "&Pscr;";
				break;
			case "Q":
				neu = "&Qscr;";
				break;
			case "R":
				neu = "&Rscr;";
				break;
			case "S":
				neu = "&Sscr;";
				break;
			case "T":
				neu = "&Tscr;";
				break;
			case "U":
				neu = "&Uscr;";
				break;
			case "V":
				neu = "&Vscr;";
				break;
			case "W":
				neu = "&Wscr;";
				break;
			case "X":
				neu = "&Xscr;";
				break;
			case "Y":
				neu = "&Yscr;";
				break;
			case "Z":
				neu = "&Zscr;";
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
				neu = "&ascr;"; // Aoopf
				break;
			case "b":
				neu = "&bscr;";
				break;
			case "c":
				neu = "&cscr;";
				break;
			case "d":
				neu = "&dscr;";
				break;
			case "e":
				neu = "&escr;";
				break;
			case "f":
				neu = "&fscr;";
				break;
			case "g":
				neu = "&gscr;";
				break;
			case "h":
				neu = "&hscr;";
				break;
			case "i":
				neu = "&iscr;";
				break;
			case "j":
				neu = "&jscr;";
				break;
			case "k":
				neu = "&kscr;";
				break;
			case "l":
				neu = "&lscr;";
				break;
			case "m":
				neu = "&mscr;";
				break;
			case "n":
				neu = "&nscr;";
				break;
			case "o":
				neu = "&oscr;";
				break;
			case "p":
				neu = "&pscr;";
				break;
			case "q":
				neu = "&qscr;";
				break;
			case "r":
				neu = "&rscr;";
				break;
			case "s":
				neu = "&sscr;";
				break;
			case "t":
				neu = "&tscr;";
				break;
			case "u":
				neu = "&uscr;";
				break;
			case "v":
				neu = "&vscr;";
				break;
			case "w":
				neu = "&wscr;";
				break;
			case "x":
				neu = "&xscr;";
				break;
			case "y":
				neu = "&yscr;";
				break;
			case "z":
				neu = "&zscr;";
				break;
			default:
				neu = character;
		}
		return neu;
	}

}
