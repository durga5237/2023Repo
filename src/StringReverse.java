import java.util.Scanner;



public class StringReverse {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String yourName = sc.next();
		System.out.println("hello" + yourName + "how are you sir/medam");
		StringBuffer sb = new StringBuffer();
		sb.append(yourName);
		System.out.println("your reverse name is" + sb.reverse());

	}
}
