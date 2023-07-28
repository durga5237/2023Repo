
public class Swapping {

	public static void main(String[] args) {

		int r = 10;
		int k = 12;
		System.out.println(" Before sawpping r and k values are " + r + " and " + k);
		int t = r;
		r = k;
		k = t;
		System.out.println(" After swapping r and k values are " + r + " and " + k);

		int s = 15;
		int f = 50;
		System.out.println(" Before sawpping r and k values are " + s + " and " + f);
		s = s + f;
		f = s - f;
		s = s - f;
		System.out.println(" After  sawpping r and k values are " + s + " and " + f);
		
		int x=10;
		int y=30;
		System.out.println(" Before sawpping r and k values are " + x + " and " + y);
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println(" After  sawpping r and k values are " + x + " and " + y);
		
		
		
	}

}
