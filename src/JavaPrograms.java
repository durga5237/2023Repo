import java.util.Scanner;

public class JavaPrograms {

	public static void main(String[] args) {

		int a = 10;
		int b = -10;
		System.out.println(~a);
		System.out.println(~b);

		int g = 15;
		int h = 20;
		System.out.println((g < h) ? "yes" : "no");
		String s = "durga prasad katakatla";

		for (int i = 1; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		String s1 = ("durga prasad katakatla");
		for (char j : s1.toCharArray()) {
			System.out.println(j);

		}

		String j = ("durga prasad katakatla");
		int k = 0;
		while (k > 20) {
			System.out.println(k);
			k++;
		}
		int w = 0;
		do {
			System.out.println("laxman");
			w++;

		} while (w > 15);

		for (int m = 0; m <= 20; m++) {

			if (m == 15)

				continue;
			System.out.println(m);

		}

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter first input value");
		String firstInput = sc.next();
		System.out.println("please enter second input value");
		String secondInput = sc.next();
		String total = firstInput + secondInput;
		System.out.println(total);

		int[][] values = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

		for (int i = 0; i < 3; i++) {
			for (int j1 = 0; j1 < 5; j1++) {

				System.out.print(values[i][j1] + "\t");

			}
			System.out.println();
		}

		int[][][] values1 = { { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } },
				{ { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } },
				{ { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } }, };

		for (int m = 0; m < 3; m++) {
			for (int n = 0; n < 3; n++) {
				for (int o = 0; o < 5; o++) {
					System.out.print(values1[m][n][o] + "\t");

				}
				System.out.println();

			}
		}

		String v = "welcome to";
		String v3 = "welcome to";

		String v2 = "selenium ";
		String d = v.concat(v2);
		System.out.println(d);
		char i = v.charAt(2);
		System.out.println();
		System.out.println(v.equalsIgnoreCase(v2));
		System.out.println(v.equalsIgnoreCase(v3));
		System.out.println(v.replace("wel", "eee"));

		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.hashCode());
		sb.append(" prasad");
		System.out.println(sb.hashCode());

		String f = "durga prasad";
		System.out.println(f.hashCode());
		f = "prasad";
		System.out.println(f.hashCode());

	}
}
