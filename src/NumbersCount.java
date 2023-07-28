
public class NumbersCount {

	public static void main(String[] args) {

		int count = 0, num = 0003452;

		while (num > 0) {
			// num = num/10
			num /= 10;
			count++;
		}

		System.out.println("Number of digits: " + count);

		int totalcount = 0;
		int num1 = 456789;
		while (num1 > 0) {

			num1 = num1 / 10;
			totalcount++;

		}
		System.out.println("Number of digits: " + totalcount);

	}

}
