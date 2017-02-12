package text.manipulation.word;

import com.google.common.base.Preconditions;

public class BuchstabenToOpf implements IWord {

	private String word;

	public BuchstabenToOpf() {
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
		String neu = "";
 		switch (character) {
		case "0":
			neu = "&#120792;";
			break;
		case "1":
			neu = "&#120793;";
			break;
		case "2":
			neu = "&#120794;";
			break;
		case "3":
			neu = "&#120795;";
			break;
		case "4":
			neu = "&#120796;";
			break;
		case "5":
			neu = "&#120797;";
			break;
		case "6":
			neu = "&#120798;";
			break;
		case "7":
			neu = "&#120799;";
			break;
		case "8":
			neu = "&#120800;";
			break;
		case "9":
			neu = "&#120801;";
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
			neu = "&#120120;"; // "&Aopf;"; // Aoopf
			break;
		case "B":
			neu = "&Bopf;";
			break;
		case "C":
			neu = "&Copf;";
			break;
		case "D":
			neu = "&Dopf;";
			break;
		case "E":
			neu = "&Eopf;";
			break;
		case "F":
			neu = "&Fopf;";
			break;
		case "G":
			neu = "&Gopf;";
			break;
		case "H":
			neu = "&Hopf;";
			break;
		case "I":
			neu = "&Iopf;";
			break;
		case "J":
			neu = "&Jopf;";
			break;
		case "K":
			neu = "&Kopf;";
			break;
		case "L":
			neu = "&Lopf;";
			break;
		case "M":
			neu = "&Mopf;";
			break;
		case "N":
			neu = "&Nopf;";
			break;
		case "O":
			neu = "&Oopf;";
			break;
		case "P":
			neu = "&Popf;";
			break;
		case "Q":
			neu = "&Qopf;";
			break;
		case "R":
			neu = "&Ropf;";
			break;
		case "S":
			neu = "&Sopf;";
			break;
		case "T":
			neu = "&Topf;";
			break;
		case "U":
			neu = "&Uopf;";
			break;
		case "V":
			neu = "&Vopf;";
			break;
		case "W":
			neu = "&Wopf;";
			break;
		case "X":
			neu = "&Xopf;";
			break;
		case "Y":
			neu = "&Yopf;";
			break;
		case "Z":
			neu = "&Zopf;";
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
			neu = "&aopf;"; // Aoopf
			break;
		case "b":
			neu = "&bopf;";
			break;
		case "c":
			neu = "&copf;";
			break;
		case "d":
			neu = "&dopf;";
			break;
		case "e":
			neu = "&eopf;";
			break;
		case "f":
			neu = "&fopf;";
			break;
		case "g":
			neu = "&gopf;";
			break;
		case "h":
			neu = "&hopf;";
			break;
		case "i":
			neu = "&iopf;";
			break;
		case "j":
			neu = "&jopf;";
			break;
		case "k":
			neu = "&kopf;";
			break;
		case "l":
			neu = "&lopf;";
			break;
		case "m":
			neu = "&mopf;";
			break;
		case "n":
			neu = "&nopf;";
			break;
		case "o":
			neu = "&oopf;";
			break;
		case "p":
			neu = "&popf;";
			break;
		case "q":
			neu = "&qopf;";
			break;
		case "r":
			neu = "&ropf;";
			break;
		case "s":
			neu = "&sopf;";
			break;
		case "t":
			neu = "&topf;";
			break;
		case "u":
			neu = "&uopf;";
			break;
		case "v":
			neu = "&vopf;";
			break;
		case "w":
			neu = "&wopf;";
			break;
		case "x":
			neu = "&xopf;";
			break;
		case "y":
			neu = "&yopf;";
			break;
		case "z":
			neu = "&zopf;";
			break;
		default:
            neu = character;
		}
		return neu;
	}

}
