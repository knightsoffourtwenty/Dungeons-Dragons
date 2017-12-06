package twenty.four.of.knights.Dice_Roller;

import java.util.Random;

public class D6 {
	private static final int D6 = 6;
	private int rolled;
	private static final int randModifier = 1;
	private Random rand = new Random();
	public D6(int rolled) {
		roller(rolled);
	}
	public int roller(int roller) {
		rolled = rand.nextInt(D6) + randModifier;
		return rolled;
	}
}
