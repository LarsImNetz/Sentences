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
			buffer.append(convert(buchstabe));
		}
        return buffer.toString();
	}

	private String convert(char character) {
		String neu = "";
		switch (character) {
		case 'A':
			neu = "&Aopf;"; // Aoopf
			break;
		case 'B':
			neu = "&Bopf;";
			break;
		case 'C':
			neu = "&Copf;";
			break;
		case 'D':
			neu = "&Dopf;";
			break;
		case 'E':
			neu = "&Eopf;";
			break;
		case 'F':
			neu = "&Fopf;";
			break;
		case 'G':
			neu = "&Gopf;";
			break;
		case 'H':
			neu = "&Hopf;";
			break;
		case 'I':
			neu = "&Iopf;";
			break;
		case 'J':
			neu = "&Jopf;";
			break;
		case 'K':
			neu = "&Kopf;";
			break;
		case 'L':
			neu = "&Lopf;";
			break;
		case 'M':
			neu = "&Mopf;";
			break;
		case 'N':
			neu = "&Nopf;";
			break;
		case 'O':
			neu = "&Oopf;";
			break;
		case 'P':
			neu = "&Popf;";
			break;
		case 'Q':
			neu = "&Qopf;";
			break;
		case 'R':
			neu = "&Ropf;";
			break;
		case 'S':
			neu = "&Sopf;";
			break;
		case 'T':
			neu = "&Topf;";
			break;
		case 'U':
			neu = "&Uopf;";
			break;
		case 'V':
			neu = "&Vopf;";
			break;
		case 'W':
			neu = "&Wopf;";
			break;
		case 'X':
			neu = "&Xopf;";
			break;
		case 'Y':
			neu = "&Yopf;";
			break;
		case 'Z':
			neu = "&Zopf;";
			break;
		default:
		}
		return neu;
	}
}
