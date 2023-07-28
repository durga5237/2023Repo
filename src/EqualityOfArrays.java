import org.bouncycastle.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
		int g[] = { 1, 2, 3, 4, 5 };
		int h[] = { 1, 2, 3, 4, 5 };
		boolean s = Arrays.areEqual(g, h);
		System.out.println(s);
		if (s == true) {
			System.out.println("arrays are matched");
		} else {

			System.out.println("arrays are not matched");
		}

	}
}
