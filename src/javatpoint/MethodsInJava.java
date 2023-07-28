package javatpoint;

import java.util.Scanner;

class phani {
//	METHODOVERLOADING
	String name;

	void durga() {
		System.out.println("durgaprasadkatakatla");

	}

	static String f;

	void durga(int k) {
		System.out.println(k);
		System.out.println("durgaprasadkatakatla123");
		System.out.println(f);

	}

	void durga(double g) {
		System.out.println(g);
		System.out.println("durgaprasadkatakatla456");

	}

	phani() {
		name = "prasad";

	}

	phani(String s) {
		name = s;
	}

}

public class MethodsInJava {
	public static void main(String[] args) {
		phani d = new phani();

		System.out.println(d.name);
		phani d1 = new phani("durga");
		System.out.println(d1.name);
//		d.f = "durga";
//		d.durga();
//		d.durga(2.5d);
//		d.durga(4);
//		String[] total = { "durgaprasad", "ghddhhdd", "hddjsjdsjm" };
//
//		for (String oneByOne : total) {
//			System.out.println(oneByOne);
//
//		}
//
//		StringBuffer s = new StringBuffer("prasad");
//		System.out.println(s);
//		System.out.println(s.hashCode());
//		s = s.replace(0, 6, "durga");
//		System.out.println(s.hashCode());
//		System.out.println(s);

	}

}
