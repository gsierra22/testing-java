import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		
		Random newRandom = new Random();
		int x = newRandom.nextInt(6) + 1;
		
		System.out.println("You rolled " + x);
	}

}
