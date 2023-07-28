import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		System.out.println(Math.random());

		Random rand = new Random();
		int k = rand.nextInt(100);
		System.out.println(k);

	}

}
