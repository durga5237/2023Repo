import java.util.Scanner;

public class LargeThreeNumbers {

	public static void main(String[] args) {
         System.out.println("start");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter the first value" + a);
		int b = sc.nextInt();
		System.out.println("enter the first value" + b);
		int c = sc.nextInt();
		System.out.println("enter the first value" + c);

		if (a > b && a > c) {
			System.out.println("this is the largest number =" + a);
		} else if (b > a && b > c) {
			System.out.println("this is the largest number =" + b);
		} else if (c > a && c > b) {
			System.out.println("this is the largest number =" + c);
		}

	}

}
