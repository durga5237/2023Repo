package javatpoint;

//ass Durga1 {
//	static String name;
//	int age;
//
//	void firstPersonD//cletails(int r,int l) {
//		System.out.println("first person name:" + name);
//		System.out.println(name + " age is:" + age);
//	}
//
//	void firstPersonDetails() {
//		System.out.println("first person name:" + name);
//		System.out.println(name + " age is:" + age);
//	}
//
//}

public class JavaC {
	public static void main(String[] args) {

//		Durga1 first = new Durga1();
//		first.name = "suresh";
//		first.age = 22;
//		first.firstPersonDetails();
//		Durga1 second = new Durga1();
//		second.name = "ramesh";
//		second.age = 25;
//		second.firstPersonDetails(10,20);
//		int a=10;
//		int b=-20;
//		int c=a-b;
//		
//        System.out.println("C Value"+c);
//		for (int i = 0; i < 100; i++)
//			if (i % 2 == 1) {
//				System.out.println(i);
//				break;
//			}
//		int e = 10;
//
//		do {
//			System.out.println("durgaprasad");
//			e++;
//		} while (e < 15);
//		int l=0;
//		while(l<20) {
//			System.out.println("prasad No: "+l);
//			l++;
//		}
//		int[] durga = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
//		for (int i = 0; i < durga.length; i++) {
//			System.out.print(durga[i] + " ");
//			if (durga[i] == 30) {
//				System.out.println();
//			}
//		}

//		int[][][] d = { { { 10, 20, 30, 40 }, { 25, 35, 45, 55, }, { 29, 39, 49, 59 } },
//				{ { 10, 20, 30, 40 }, { 25, 35, 45, 55, }, { 29, 39, 49, 59 } },
//				{ { 10, 20, 30, 40 }, { 25, 35, 45, 55, }, { 29, 39, 49, 59 } } };
//
//		for (int l = 0; l < 3; l++) {
//			for (int i = 0; i < 3; i++) {
//				for (int j = 0; j < 4; j++) {
//					System.out.print(d[l][i][j] + " ");
//				}
//				System.out.println(" ");
//
//			}
//
//		}
//		StringBuffer f = new StringBuffer("durgaprasad");
//		System.out.println(f);
//		f.append("katakatla");
//		System.out.println(f);
//		System.out.println(f.hashCode());
//		System.out.println(f.length());
//		f.replace(0, 11, "manibabu");
//		System.out.println(f);
//		System.out.println(f.hashCode());
//		 int k=10;
//		System.out.println(k);
//		k=12;
		try {
			System.out.println(10 + 2);
			System.out.println(10 * 2);
			System.out.println(10 / 0);
			System.out.println(10 - 2);

		} catch (Exception d) {
			System.out.println("it cannot devided my zero");

		} finally {
			System.out.println(10 - 2);

		}
		String n = new String("durga");
		System.out.println(n.indexOf('r'));
	}
}
