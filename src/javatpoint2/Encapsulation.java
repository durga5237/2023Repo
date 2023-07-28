package javatpoint2;

import static org.testng.Assert.assertTrue;

public class Encapsulation {

	public static void main(String[] args) {
		int k;
		k = 15;
		int d = 10;
		System.out.println(k + d);
		System.out.println(k - d);
		System.out.println(k * d);
		System.out.println(k % d);
		System.out.println(k / d);
		System.out.println(k + "durga");
		int o = 10;
		int p = 14;
		System.out.println(o < p && o != p);
		System.out.println(o > p && o == p);
		System.out.println(o < p || o != p);
		System.out.println(o > p || o == p);
		String durga = "`thurputallu,naraspuram,west godavari";
		for (int i = durga.length() - 1; i > 0; i--) {
			System.out.println(durga.charAt(i));

		}

		StringBuffer obj = new StringBuffer("durgaprasad");

		StringBuffer y = obj.reverse();
		
		int m = 10;
		int n = 20;
		
		do {
			System.out.println("iam the hero no:"+m);
			m++;
		} while (m <=n);
		
		
		assert.assertTrue(10<15);

}
