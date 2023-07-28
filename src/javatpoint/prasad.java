package javatpoint;

//import java.util.Scanner;

public class prasad extends Exception {
	prasad() {
		System.out.println("only below 10 years people only");

	}

	public static void main(String[] args) throws prasad {
		// TODO Auto-generated method stub
//		Scanner d = new Scanner(System.in);
//		System.out.println("Please enter your age: ");
//
//		int age = d.nextInt();
		int age = 20;
		if (age <= 10)
			throw new prasad();

	}
}
