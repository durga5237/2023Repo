import io.github.bonigarcia.wdm.WebDriverManager;

public class MissingNumberInArray {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		int firstTotal = 0;
		int a[] = { 1, 2, 4, 5 };
		for (int one : a) {

			firstTotal = firstTotal + one;

		}
		System.out.println(firstTotal);
		int SecondTotal = 0;
		int b = 5;
		for (int i = 1; i <= b; i++) {

			SecondTotal = SecondTotal + i;

		}
		System.out.println(SecondTotal);
		System.out.println("missing number " + (SecondTotal - firstTotal));
	}

}
