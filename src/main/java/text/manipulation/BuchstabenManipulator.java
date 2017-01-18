package text.manipulation;

import com.google.common.base.Preconditions;

/**
 * Manipuliert eine gegebene Menge von Buchstaben
 * - Es wird nicht geprüft, ob die Menge leer ist (Design by contract)
 * - Es wird nicht geprüft, ob eine gewisse Länge vorhanden ist
 *
 * Der erste und der letze Buchstaben bleiben unberührt, das Gehirn sollte das Word weiter lesen können
 * Zumindest Muttersprachler sollten das nach kurzer eingewöhnung schnell beherrschen.
 * 
 */
public class BuchstabenManipulator implements IWord {

	private char[] buchstaben;
	
	public BuchstabenManipulator() {
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
		if (buchstaben.length > 4) {
			buchstabenNachbarnTauschen();
		}
		else if (buchstaben.length > 3) {
			buchstabenZweitenMitLetztemTauschen();
		}
	}
	
	void buchstabenNachbarnTauschen() {
		// PRE: Es sollte eine Menge von Buchstaben geben

		// Immer zwei aufeinander folgende Buchstaben verdrehen
		
		for (int position = 1; position < buchstaben.length - 2; position += 2) {
			swap(buchstaben, position, position + 1);
		}
	}
	
	void buchstabenZweitenMitLetztemTauschen() {
		Preconditions.checkState(buchstaben.length > 2);
		// PRE: Es sollte eine Menge von Buchstaben geben
		
		// Immer den 2 und den vor letzen Buchstaben tauschen
		int position = 1;
		swap(buchstaben, position, buchstaben.length - 2);		
	}
	
	private void swap(char[] buchstaben, int position, int nextPosition) {
		// swap
		char tmp = buchstaben[nextPosition];
		buchstaben[nextPosition] = buchstaben[position];
		buchstaben[position] = tmp;
	}
}
