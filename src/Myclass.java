
class MainMethod {
	void demo() {
		System.out.println("durga prasad katakatla");

	}

	void demo(int d) {
		System.out.println("durga  katakatla  " + d);

	}

	void demo(String s) {
		System.out.println("prasad katakatla  " + s);

	}

}

public class Myclass {
	public static void main(String[] args) {
		MainMethod obj = new MainMethod();
		obj.demo();
		obj.demo(25);

		obj.demo("typring Hxhdxh");

	}

}