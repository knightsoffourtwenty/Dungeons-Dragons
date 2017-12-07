package twenty.four.of.knights.Dice;

import java.util.Random;
/**
 * Creates a new D10 object that will be used for the rolling of character
 * stats as well as being used in the Dice Roller tab of the UI.
 * @author Knight Paladin One Chainzz
 *
 */
public class D10 {
	/** The max number that a D10 can be rolled to. */ 
	private static final int D10 = 10;
	/** The rolled value of the D10 */
	private int rolled;
	/** The modifier for the random value to prevent a zero roll. */
	private static final int randModifier = 1;
	/** The random number generator for the Dice rolls. */
	private Random rand = new Random();
	/** 
	 * Constructor for the D10 class. The constructor takes in the rolled value and 
	 * sets it using the roller method to ensure randomness.
	 * @param rolled The value of the D10 after the roll.
	 */
	public D10(int rolled) {
		roller(rolled);
	}
	/**
	 * Rolls the D10 and returns the value of the roll.
	 * @param rolled The value of the D10 after the roll.
	 * @return The value of the D10.
	 */
	public int roller(int rolled) {
		rolled = 0;
		rolled = rand.nextInt(D10) + randModifier;
		return rolled;
	}
	/**
	 * Gets and returns the rolled value of the D10.
	 * @return The rolled value of the D10.
	 */
	public int getRolled() {
		return rolled;
	}
	/**
	 * Sets the value of roll for the D10.
	 * @param rolled The value of the rolled D10.
	 */
	public void setRolled(int rolled) {
		this.rolled = roller(rolled);
	}
}
