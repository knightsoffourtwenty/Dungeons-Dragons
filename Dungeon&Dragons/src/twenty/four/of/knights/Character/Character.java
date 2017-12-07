package twenty.four.of.knights.Character;

import twenty.four.of.knights.Dice.*;
/**
 * Creates a new Character Creator for use in creating new characters from random 
 * numbers as the stats.
 * @author Knight Paladin One Chainzz
 *
 */
public class Character {
	/** The strength of the character. */
	private int STR;
	/** The dexterity of the character. */
	private int DEX;
	/** The constitution of the character. */
	private int CON;
	/** The wisdom of the character. */
	private int WIS;
	/** The intelligence of the character. */
	private int INT;
	/** The charisma of the character. */
	private int CHA;
	/**
	 * Constructor of the Character. Mainly used for testing purposes.
	 * @param STR The strength of the character.
	 * @param DEX The dexterity of the character.
	 * @param CON The constitution of the character.
	 * @param WIS The wisdom of the character.
	 * @param INT The intelligence of the character.
	 * @param CHA The charisma of the character.
	 */
	public Character(int STR, int DEX, int CON, int WIS, int INT, int CHA) {
		this.STR = STR;
		this.DEX = DEX;
		this.CON = CON;
		this.WIS = WIS;
		this.INT = INT;
		this.CHA = CHA;
	}
	/**
	 * The constructor for a Character. This constructor is used for 
	 * the creation of a new Character, and will be used in the main 
	 * implementation of the GUI.
	 */
	public Character() {
		setStrength();
		setDexterity();
		setConstitution();
		setWisdom();
		setIntelligence();
		setCharisma();
	}
	/**
	 * Gets, and returns, the value of the strength stat of the character.
	 * @return The strength stat.
	 */
	public int getStrength() {
		return STR;
	}
	/**
	 * Sets the strength stat based on three rolls of a D6. The D6 cannot reach
	 * a value below three, so a check is in place for the value goes below four.
	 * If the value of the rolled D6 goes below four, the value is set to 3. This
	 * ensures that the value of the stat cannot go below nine.
	 * @param STR The value of the strength stat for the character.
	 */
	public void setStrength() {
		STR = 0;
		D6 rolls = new D6(6);
		int a = rolls.roller(6);
		if (a < 4)
			a = 3;
		int b = rolls.roller(6);
		if (b < 4)
			b = 3;
		int c = rolls.roller(6);
		if (c < 4)
			c = 3;
		STR = a + b + c;
	}
	/**
	 * Gets, and returns, the value of the dexterity stat of the character.
	 * @return The dexterity stat.
	 */
	public int getDexterity() {
		return DEX;
	}
	/**
	 * Sets the dexterity stat based on three rolls of a D6. The D6 cannot reach
	 * a value below three, so a check is in place for the value goes below four.
	 * If the value of the rolled D6 goes below four, the value is set to 3. This
	 * ensures that the value of the stat cannot go below nine.
	 * @param DEX The value of the dexterity stat for the character.
	 */
	public void setDexterity() {
		DEX = 0;
		D6 rolls = new D6(6);
		int a = rolls.roller(6);
		if (a < 4)
			a = 3;
		int b = rolls.roller(6);
		if (b < 4)
			b = 3;
		int c = rolls.roller(6);
		if (c < 4)
			c = 3;
		DEX = a + b + c;
	}
	/**
	 * Gets, and returns, the value of the constitution stat of the character.
	 * @return The constitution stat.
	 */
	public int getConstitution() {
		return CON;
	}
	/**
	 * Sets the constitution stat based on three rolls of a D6. The D6 cannot reach
	 * a value below three, so a check is in place for the value goes below four.
	 * If the value of the rolled D6 goes below four, the value is set to 3. This
	 * ensures that the value of the stat cannot go below nine.
	 * @param CON The value of the constitution stat for the character.
	 */
	public void setConstitution() {
		CON = 0;
		D6 rolls = new D6(6);
		int a = rolls.roller(6);
		if (a < 4)
			a = 3;
		int b = rolls.roller(6);
		if (b < 4)
			b = 3;
		int c = rolls.roller(6);
		if (c < 4)
			c = 3;
		CON = a + b + c;
	}
	/**
	 * Gets, and returns, the value of the wisdom stat of the character.
	 * @return The wisdom stat.
	 */
	public int getWisdom() {
		return WIS;
	}
	/**
	 * Sets the wisdom stat based on three rolls of a D6. The D6 cannot reach
	 * a value below three, so a check is in place for the value goes below four.
	 * If the value of the rolled D6 goes below four, the value is set to 3. This
	 * ensures that the value of the stat cannot go below nine.
	 * @param WIS The value of the wisdom stat for the character.
	 */ 
	public void setWisdom() {
		WIS = 0;
		D6 rolls = new D6(6);
		int a = rolls.roller(6);
		if (a < 4)
			a = 3;
		int b = rolls.roller(6);
		if (b < 4)
			b = 3;
		int c = rolls.roller(6);
		if (c < 4)
			c = 3;
		WIS = a + b + c;
	}
	/**
	 * Gets, and returns, the value of the intelligence stat of the character.
	 * @return The intelligence stat.
	 */
	public int getIntelligence() {
		return INT;
	}
	/**
	 * Sets the intelligence stat based on three rolls of a D6. The D6 cannot reach
	 * a value below three, so a check is in place for the value goes below four.
	 * If the value of the rolled D6 goes below four, the value is set to 3. This
	 * ensures that the value of the stat cannot go below nine.
	 * @param INT The value of the intelligence stat for the character.
	 */
	public void setIntelligence() {
		INT = 0;
		D6 rolls = new D6(6);
		int a = rolls.roller(6);
		if (a < 4)
			a = 3;
		int b = rolls.roller(6);
		if (b < 4)
			b = 3;
		int c = rolls.roller(6);
		if (c < 4)
			c = 3;
		INT = a + b + c;
	}
	/**
	 * Gets, and returns, the value of the charisma stat of the character.
	 * @return The charisma stat.
	 */
	public int getCharisma() {
		return CHA;
	}
	/**
	 * Sets the charisma stat based on three rolls of a D6. The D6 cannot reach
	 * a value below three, so a check is in place for the value goes below four.
	 * If the value of the rolled D6 goes below four, the value is set to 3. This
	 * ensures that the value of the stat cannot go below nine.
	 * @param CHA The value of the charisma stat for the character.
	 */
	public void setCharisma() {
		CHA = 0;
		D6 rolls = new D6(6);
		int a = rolls.roller(6);
		if (a < 4)
			a = 3;
		int b = rolls.roller(6);
		if (b < 4)
			b = 3;
		int c = rolls.roller(6);
		if (c < 4)
			c = 3;
		CHA = a + b + c;
	}
	/**
	 * Creates a String representation of the Character's stats.
	 */
	public String toString() {
		String builder = "";
		builder += getStrength() + " " + getDexterity() + " " + getConstitution() + " " + getWisdom() + " " + getIntelligence() + " " + getCharisma();
		return builder;
	}
}
