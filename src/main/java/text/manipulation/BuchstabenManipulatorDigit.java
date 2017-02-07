package text.manipulation;

import com.google.common.base.Preconditions;

/**
 * Manipuliert eine gegebene Menge von Buchstaben
 * - Es wird nicht geprüft, ob die Menge leer ist (Design by contract)
 * - Es wird nicht geprüft, ob eine gewisse Länge vorhanden ist
 *
 * Diese Mitteilung dient als Beweis dafuer, was fuer erstaunliche Dinge unser Verstand leisten kann.
 * Beeindruckend. Am Anfang war's schon schwer, aber jetzt, in dieser Zeile, liest es dein Gehirn
 * automatisch. Ohne darueber nachzudenken. Sei Stolz drauf.
 * Also teile dieses Bild, wenn du es lesen kannst.
 * 
 */
public class BuchstabenManipulatorDigit implements IWord {

	private char[] buchstaben;
	
	public BuchstabenManipulatorDigit() {
	}

	@Override
	public void setWord(String word) {
		Preconditions.checkArgument(word != null);
		this.buchstaben = word.toCharArray();
	}
	
	@Override
	public String getWord() {
		return new String(this.buchstaben);
	}
	
	@Override
	public void perform() {
		buchstabenErsetzen();
	}
	
	void buchstabenErsetzen() {
		// PRE: Es sollte eine Menge von Buchstaben geben
		
		for (int position = 0; position < buchstaben.length; position ++) {
			buchstaben[position] = convert(this.buchstaben[position]);
		}
	}

	private char convert(char buchstabe) {

		switch(buchstabe) {
			case 'I':
				buchstabe = '1';
				break;
			case 'Z':
				buchstabe = '2';
				break;
			case 'E':
				buchstabe = '3';
				break;
			case 'A':
				buchstabe = '4';
				break;
			case 'S':
				buchstabe = '5';
				break;
//			case 'G':
//				buchstabetoUpper = '6';
//				break;
			case 'T':
				buchstabe = '7';
				break;
//			case 'B':
//				buchstabetoUpper = '8';
//				break;
//			case '':
//				buchstabetoUpper = '9';
//				break;
			case 'O':
				buchstabe = '0';
				break;
		}
		return buchstabe;
	}
}
