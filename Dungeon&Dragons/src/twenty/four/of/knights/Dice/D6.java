package twenty.four.of.knights.Dice;

import java.util.Random;
/**
 * Creates a new D6 object that will be used for the rolling of character
 * stats as well as being used in the Dice Roller tab of the UI.
 * @author Knight Paladin One Chainzz
 *
 */
public class D6 {
	/** The max number that a D6 can be rolled to. */ 
	private static final int D6 = 6;
	/** The rolled value of the D6 */
	private int rolled;
	/** The modifier for the random value to prevent a zero roll. */
	private static final int randModifier = 1;
	/** The random number generator for the Dice rolls. */
	private Random rand = new Random();
	/** 
	 * Constructor for the D6 class. The constructor takes in the rolled value and 
	 * sets it using the roller method to ensure randomness.
	 * @param rolled The value of the D6 after the roll.
	 */
	public D6(int rolled) {
		roller(rolled);
	}
	/**
	 * Rolls the D6 and returns the value of the roll.
	 * @param rolled The value of the D6 after the roll.
	 * @return The value of the D6.
	 */
	public int roller(int rolled) {
		rolled = 0;
		rolled = rand.nextInt(D6) + randModifier;
		return rolled;
	}
}
