package twenty.four.of.knights.Character;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Tests for the Character Creator
 * @author Knight Paladin One Chainzz
 *
 */
class CharacterTest {
	/**
	 * Tests the Character creation from the Character constructor.
	 */
	@Test
	void testCharacterCreator() {
		Character test = new Character(18, 18, 18, 18, 18, 18);
		assertEquals(18, test.getStrength());
		assertEquals(18, test.getDexterity());
		assertEquals(18, test.getConstitution());
		assertEquals(18, test.getWisdom());
		assertEquals(18, test.getIntelligence());
		assertEquals(18, test.getCharisma());
	}
	/**
	 * Tests the set methods of the Character creator.
	 * Look at the console output to ensure the random number generator is working
	 * properly.
	 */
	@Test
	public void testSetMethods() {
		Character test = new Character();
		System.out.println(test.toString());
		test.setStrength();
		test.setDexterity();
		test.setConstitution();
		test.setWisdom();
		test.setIntelligence();
		test.setCharisma();
		System.out.println(test.toString());
	}
}
