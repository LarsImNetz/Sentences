package text.manipulation.satz;

import com.google.common.base.Preconditions;

import text.manipulation.word.BuchstabenManipulator;

/**
 * SatzDreher verdreht in einem gegebenen Satz nur die Wörter, nicht aber die Satzzeichen und die Wortreihenfolge. 
 *
 * @deprecated use SatzManipulator(new BuchstabenManipulator()) instead 
 */
@Deprecated
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
		return manipulator.getSentence();
	}
}
