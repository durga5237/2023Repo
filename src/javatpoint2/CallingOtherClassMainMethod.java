package javatpoint2;

import java.util.Scanner;


class FirstProg1 {
	public static void main(String[] args) {
		System.out.println("This is FristProg main method");
		for(String s:args) {
			System.out.println(s);
		}
	}	
    public int m1() {
    	System.out.println("This is m1 method of FirstProg");
    	System.out.println("This is m1 method of FirstProg");
    	System.out.println("This is m1 method of FirstProg");
    	System.out.println("This is m1 method of FirstProg");
    	return 10;
    }
}
public class CallingOtherClassMainMethod {
	public static void main(String[] args) {
		FirstProg1 fp = new FirstProg1();
		fp.m1();
		String raju[] = {"HYD","MUM","DEL"};
		fp.main(raju);
	}
}
