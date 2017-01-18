package text;

import text.manipulation.ISentence;
import text.manipulation.IWord;

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
		return this.sentence;
	}
	
	@Override
	public void perform() {
		SentenceTokenizer tokenizer = new SentenceTokenizer(sentence);
		StringBuilder verdreherSatz = new StringBuilder();
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextElement();
			if (tokenizer.isWord()) {
				algorithm.setWord(token);
				algorithm.perform();
				token = algorithm.getWord();
			}
			verdreherSatz.append(token);
		}
		sentence = verdreherSatz.toString();		
	}
}
