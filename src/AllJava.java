
public class AllJava {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before swapping a and b values are = " + a + " and " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping a and b values are = " + a + " and " + b);

		int a1 = 40;
		int b1 = 100;

		System.out.println("Before swapping a and b values are = " + a1 + " and " + b1);
		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;
		System.out.println("After swapping a and b values are = " + a1 + " and " + b1);

		int o = 558551;
		StringBuffer st = new StringBuffer(String.valueOf(o));
		StringBuffer reverseString = st.reverse();
		System.out.println(reverseString);

		int d = 751244151;
		StringBuffer st1 = new StringBuffer();
		st1.append(d);
		System.out.println(st1.reverse());

		String w = "katakatla durga prasad";
		for (int i = w.length() - 1; i >= 0; i--) {
			System.out.println(w.charAt(i));
		}

		StringBuffer at = new StringBuffer("durga prasad ");
		System.out.println(at.reverse());

	}

}
