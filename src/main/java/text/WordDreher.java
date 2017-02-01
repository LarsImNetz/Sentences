package text;

import com.google.common.base.Preconditions;

import text.manipulation.BuchstabenManipulator;

/*
 * Buchstabendreher
 * Verdreht und Vertauscht Buchstaben in einer beliebigen Reihenfolge
 */
public class WordDreher {

	private final BuchstabenManipulator manipulator;
	
	public WordDreher() {		
		// TODO: per injection
		manipulator = new BuchstabenManipulator();
	}

	public void setWord(String word) {
		Preconditions.checkNotNull(word, "Bitte ein Wort angeben.");
		Preconditions.checkArgument(word.indexOf(" ") == -1, "Bitte nur einzelne Wörter angeben!");
		this.manipulator.setWord(word);
	}
	
	public String getWord() {
		return manipulator.getWord();
	}
	
	public WordDreher verdrehen() {
		manipulator.perform();
		return this;
	}	
}
