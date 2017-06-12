package text.manipulation.word;

import com.google.common.base.Preconditions;

/**
 * Entfernt die deutschen Umlaute aus einem String
 *
 * ä -> ae usw
 * ß -> ss
 */
public class NoUmlaut implements IWord {

	private String word;

	@Override
	public String getWord() {
		buchstabenErsetzen();
		return word;
	}

	@Override
	public void setWord(String word) {
		Preconditions.checkArgument(word != null);
		this.word = word;
	}

	void buchstabenErsetzen() {
		// PRE: Es sollte eine Menge von Buchstaben geben
		StringBuilder buffer = new StringBuilder();
		for (char buchstabe : word.toCharArray()) {
			buffer.append(convert(buchstabe));
		}
		word = buffer.toString();
	}

	// TODO: das geht bestimmt besser
	private String convert(char buchstabe) {
		String buchstaben = "";
		switch (buchstabe) {
			case 'ä':
				buchstaben = "ae";
				break;
			case 'ö':
				buchstaben = "oe";
				break;
			case 'ü':
				buchstaben = "ue";
				break;
			case 'ß':
				buchstaben = "ss";
				break;
			case 'Ä':
				buchstaben = "Ae";
				break;
			case 'Ö':
				buchstaben = "Oe";
				break;
			case 'Ü':
				buchstaben = "Ue";
				break;
			default:
				buchstaben = String.valueOf(buchstabe);
		}
		return buchstaben;
	}

}
