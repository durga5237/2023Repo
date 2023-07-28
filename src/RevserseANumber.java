import java.util.Scanner;

public class RevserseANumber {

	public static void main(String[] args) {

		System.out.println("please enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		sb.append(num);
		StringBuffer Reverse = sb.reverse();
		System.out.println("reverse the number is :" + Reverse);

//		System.out.println("please enter the number: ");
//		Scanner sc1 = new Scanner(System.in);
//		int num1 = sc.nextInt();
		int num1 = 1234;
		StringBuffer sb1 = new StringBuffer(String.valueOf(num1));
		StringBuffer reversesecondnumber = sb1.reverse();
		System.out.println(reversesecondnumber);

	}

}
