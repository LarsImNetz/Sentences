package text.manipulation.word;

import com.google.common.base.Preconditions;

public class BuchstabenToKyrillisch implements IWord {

	private char[] buchstaben;

	public BuchstabenToKyrillisch() {
	}

	@Override
	public void setWord(String word) {
		Preconditions.checkArgument(word != null);
		this.buchstaben = word.toCharArray();
	}

	@Override
	public String getWord() {
		perform();
		return new String(this.buchstaben);
	}

	private void perform() {
		for (int position = 0; position < buchstaben.length; position++) {
			buchstaben[position] = convert(buchstaben[position]);
		}
	}

	private char convert(char character) {
		char neu = character;
		switch (character) {
		case 'A':
			neu = 0x410; // 'А'; // 0x410
			break;
		case 'B':
			neu = 0x412;
			break;
		case 'C':
			neu = 0x421;
			break;
		case 'D':
			neu = 'D';
			break;
		case 'E':
			neu = 0x42D; // 0x415; // 'E'
			break;
		case 'F':
			neu = 'F';
			break;
		case 'G':
			neu = 'G';
			break;
		case 'H':
			neu = 0x41d;
			break;
		case 'I':
			neu = 'І'; // 0x406
			break;
		case 'J':
			neu = 'Ј'; // 0x408
			break;
		case 'K':
			neu = 0x41A;
			break;
		case 'L':
			neu = 0x413; // 'Г';
			break;
		case 'M':
			neu = 0x41c;
			break;
		case 'N':
			neu = 0x418; // 'И'
			break;
		case 'O':
			neu = 0x41e;
			break;
		case 'P':
			neu = 0x420;
			break;
		case 'Q':
			neu = 'Q';
			break;
		case 'R':
			neu = 0x42f; // 'Я'
			break;
		case 'S':
			neu = 'Ѕ'; // 0x405
			break;
		case 'T':
			neu = 0x422;
			break;
		case 'U':
			neu = 'U';
			break;
		case 'V':
			neu = 'V';
			break;
		case 'W':
			neu = 0x428; // 'Ш';
			break;
		case 'X':
			neu = 0x425;
			break;
		case 'Y':
			neu = 0x423;
			break;
		case 'Z':
			neu = 'Z';
			break;
		default:
		}
		return neu;
	}
}
