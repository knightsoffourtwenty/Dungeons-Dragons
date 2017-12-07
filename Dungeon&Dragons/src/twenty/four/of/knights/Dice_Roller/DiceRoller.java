package twenty.four.of.knights.Dice_Roller;

import twenty.four.of.knights.Dice.*;
/**
 * Rolls dice of the specified type. This class will be used in the 
 * function of the GUI.
 * @author Knight Paladin One Chainzz
 *
 */
public class DiceRoller {
	/** The value that will be set for the rolling of the die. */
	private int rolled;
	/** Creates a new D2. */
	private D2 d2;
	/** Creates a new D4. */
	private D4 d4;
	/** Creates a new D6. */
	private D6 d6;
	/** Creates a new D8. */
	private D8 d8;
	/** Creates a new D12. */
	private D12 d12;
	/** Creates a new D20. */
	private D20 d20;
	/** Creates a new D100 */
	private D100 d100;
	/**
	 * Initializes the die.
	 */
	public DiceRoller() {
		d2 = new D2(rolled);
		d4 = new D4(rolled);
		d6 = new D6(rolled);
		d8 = new D8(rolled);
		d12 = new D12(rolled);
		d20 = new D20(rolled);
		d100 = new D100(rolled);
	}
	/**
	 * Rolls a D2.
	 * @return The value of the roll of the D2.
	 */
	public int rollD2() {
		d2.roller(6);
		return d2.getRolled();
	}
	/**
	 * Rolls a D4.
	 * @return The value of the roll of the D4.
	 */
	public int rollD4() {
		
		return 0;
	}
	/**
	 * Rolls a D6.
	 * @return The value of the roll of the D6.
	 */
	public int rollD6() {
		return 0;
	}
	/**
	 * Rolls a D8.
	 * @return The value of the roll of the D8.
	 */
	public int rollD8() {
		return 0;
	}
	/**
	 * Rolls a D10.
	 * @return The value of the roll of the D10.
	 */
	public int rollD10() {
		return 0;
	}
	/**
	 * Rolls a D12.
	 * @return The value of the roll of the D12.
	 */
	public int rollD12() {
		return 0;
	}
	/**
	 * Rolls a D20.
	 * @return The value of the roll of the D20.
	 */
	public int rollD20() {
		return 0;
	}
	/**
	 * Rolls a D100.
	 * @return The value of the roll of the D100.
	 */
	public int rollD100() {
		return 0;
	}
}
