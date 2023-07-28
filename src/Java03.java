
class Durga {
	void firstMethod(int a, int b) {
		System.out.println("A Value"+a+ "B value"+b);
	}
}

class Child extends Durga {
	void message() {
	String durga = "durga prasad katakatla";
	System.out.println(durga);
}
}

public class Java03 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.firstMethod(5,10);
		obj.message();


	}

}
