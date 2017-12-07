package twenty.four.of.knights.Dice_Roller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import twenty.four.of.knights.Dice.*;

class DiceRollerTest {
	@Before
	public void DiceRoller() {
		D2 d2 = new D2(2);
		D4 d4 = new D4(4);
		D6 d6 = new D6(6);
		D8 d8 = new D8(8);
		D12 d12 = new D12(12);
		D20 d20 = new D20(20);
		D100 d100 = new D100(100);
	}
	
	/**
	 * Tests the rolling function of the D2.
	 */
	@Test
	void testRollD2() {
		DiceRoller roller = new DiceRoller();
		roller.rollD2();
		String x = "";
		x += roller.rollD2();
		System.out.println(x);
	}

}
