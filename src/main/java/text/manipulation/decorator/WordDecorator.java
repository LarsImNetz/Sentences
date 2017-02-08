package text.manipulation.decorator;

import text.manipulation.word.IWord;

public class WordDecorator implements IWord {

	protected IWord wordManipulator;
	
	public WordDecorator(IWord wordManipulator) {
		this.wordManipulator = wordManipulator;
	}

	@Override
	public String getWord() {
		return wordManipulator.getWord();
	}

	@Override
	public void setWord(String word) {
		wordManipulator.setWord(word);
	}
}
