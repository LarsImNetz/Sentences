package text.manipulation.satz;

import text.manipulation.word.IWord;

public class SatzManipulator implements ISentence {

	private final IWord algorithm;
	
	private String sentence;
	
	public SatzManipulator(IWord algorithm) {
		this.algorithm = algorithm;
	}
	
	@Override
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	@Override
	public String getSentence() {
		perform();
		return this.sentence;
	}
	
	private void perform() {
		SentenceTokenizer tokenizer = new SentenceTokenizer(sentence);
		StringBuilder verdreherSatz = new StringBuilder();
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextElement();
			if (tokenizer.isWord() || tokenizer.isNumber()) {
				algorithm.setWord(token);
				token = algorithm.getWord();
			}
			verdreherSatz.append(token);
		}
		sentence = verdreherSatz.toString();		
	}
}
