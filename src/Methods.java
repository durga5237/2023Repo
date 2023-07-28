
public class Methods {

	int first;
	int second;
	int f;
	int i;

	void methodsplus(int x) {

		System.out.println(first + second);
		int first = 100;
		int second = 150;
		System.out.println(first + second);

	}

	void methodsnegitive(int f) {
		System.out.println(first - second);

	}

	void access(Methods obj) {
		obj.f = 500;
		obj.i = 600;

	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.first = 20;
		m.second = 40;
		m.methodsplus(0);
		m.methodsnegitive(0);
		Methods obj = new Methods();
		obj.f = 50;
		obj.i = 60;
		System.out.println(obj.f + obj.i);
		obj.access(obj);
		System.out.println(obj.f + obj.i);

	}

}
