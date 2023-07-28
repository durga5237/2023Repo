package javatpoint;

public class Durga {

	public static void main(String[] args) {
		String s = "durgaprasadkatakatla";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		StringBuffer str = new StringBuffer("   manibabukatakatla");
		System.out.println(str.reverse());
	}
}
