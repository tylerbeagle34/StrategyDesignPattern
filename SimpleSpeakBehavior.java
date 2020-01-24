/**
 * Child Class of Talk Behavior: Bark Behavior
 * Implements the TalkBehavior Interface
 * Imports java.util.* to use Random
 * @author Warren Beagle
 */
import java.util.*;

public class SimpleSpeakBehavior implements TalkBehavior{
	
	/**
	 * Unique talk method from the parent class
	 * Gets a random int r that is between 0-4
	 * Pulls a string from an array using that random int
	 * @return string statement
	 */
	public String talk() {
		Random r = new Random();
		String[] possibleSimpleSpeak = {"Wall-E", "EVA!", "Pop", "Eva?", "Eee-va?"};
		return possibleSimpleSpeak[r.nextInt(5)];
	}

}
