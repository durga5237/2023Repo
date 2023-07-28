
public class EvenAndOddDegits {

	public static void main(String[] args) {

		int d = 123456789;
		int odd = 0;
		int even = 0;

		while (d > 0) {
			int value = d % 10;

			if (value % 2 == 0) {
				even++;
			
				

			} else {
				odd++;

			}
			d = d / 10;

		}
		System.out.println(odd);
		System.out.println(even);

	}

}
