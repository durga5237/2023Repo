
public class FindTheOddAndEvenNumbers {

	public static void main(String[] args) {
		int s[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int even = 0;

		for (int oneByone : s) {
			if (oneByone % 2 == 0) {
				System.out.println("even number="+oneByone);
			}else {
				System.out.println("odd number="+oneByone);
			}
		}

	}

}
