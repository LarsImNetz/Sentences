package text;

import com.google.common.base.Preconditions;

import text.manipulation.BuchstabenManipulator;

/**
 * SatzDreher verdreht in einem gegebenen Satz nur die Wörter, nicht aber die Satzzeichen und die Wortreihenfolge. 
 *
 */
public class SatzDreher {

	private final String satz;
	
	public SatzDreher(String satz) {
		// Guava Preconditions
		// @see https://github.com/google/guava/wiki/PreconditionsExplained
		Preconditions.checkNotNull(satz);

		this.satz = satz;
	}
	
	public String getSatz() {
		return satz;
	}
	
	public String getVerdrehtenSatz() {
		SatzManipulator manipulator = new SatzManipulator(new BuchstabenManipulator());
		manipulator.setSentence(satz);
		manipulator.perform();
		return manipulator.getSentence();
	}
}
