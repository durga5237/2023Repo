
public class java02 {

	public static void main(String[] args) {

		for (int i = 5; i >= 0; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("*" + "\t");

			}
			System.out.println(" ");
		}

	}

}
