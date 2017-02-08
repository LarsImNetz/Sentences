package text.manipulation.decorator;

import text.manipulation.word.IWord;
import text.manipulation.word.NoUmlaut;

public class NoUmlautDecorator implements IWord {
	private IWord wordManipulator;

	public NoUmlautDecorator(IWord wordManipulator) {
		this.wordManipulator = wordManipulator;
	}

	@Override
	public String getWord() {
		return wordManipulator.getWord();
	}

	@Override
	public void setWord(String word) {
		NoUmlaut noUmlaut = new NoUmlaut();
		noUmlaut.setWord(word);
		wordManipulator.setWord(noUmlaut.getWord());	
	}
}
