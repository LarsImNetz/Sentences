package text.manipulation;

/**
 * Manipuliert nichts, implementiert nur das Interface IWord
 * eigentlich für Tests implementiert 
 */
public class NixBuchstabenManipulator implements IWord {

	private String word;
	
	@Override
	public void perform() {
	}

	@Override
	public String getWord() {
		return this.word;
	}

	@Override
	public void setWord(String word) {
		this.word = word;
	}

}
