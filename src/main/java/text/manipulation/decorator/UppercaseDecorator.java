package text.manipulation.decorator;

import text.manipulation.word.IWord;

public class UppercaseDecorator implements IWord {
	private IWord wordManipulator;

	public UppercaseDecorator(IWord wordManipulator) {
		this.wordManipulator = wordManipulator;
	}

	@Override
	public String getWord() {
		return wordManipulator.getWord();
	}

	@Override
	public void setWord(String word) {
		wordManipulator.setWord(word.toUpperCase());	
	}
}
