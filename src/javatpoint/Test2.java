package javatpoint;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Addition of 2 numbers"+c);
		
		
		int d=20;
		int e=30;
		int f=d+e;
		System.out.println(f);
	}

}
