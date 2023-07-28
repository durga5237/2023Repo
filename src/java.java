import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.TreeSet;

import com.google.common.hash.HashCode;

class MyException extends Exception {
	MyException() {
		System.out.println("this is  a invalid input");
	}

	MyException(String input) {
		super(input);

	}

}

public class java extends Exception {

	public static void main(String[] args) throws Exception {

		/*
		 * * String d = "30"; System.out.println(d.hashCode()); d = "60";
		 * System.out.println(d.hashCode());
		 * 
		 * StringBuffer stb = new StringBuffer("durga prasad katakatla");
		 * System.out.println(stb.hashCode()); stb.append("hear we go");
		 * System.out.println(stb.hashCode());
		 * 
		 * int x = 12; int y = 20; System.out.println(x); System.out.println(y); x = x +
		 * y; y = x - y; x = x - y; System.out.println(x); System.out.println(y);
		 * 
		 * int a = 10; int b = 15; int c; System.out.println("before Swapping a value" +
		 * a + "b value" + b); c = a; System.out.println("c value" + c); a = b;
		 * System.out.println("a value" + a); b = c; System.out.println("b value" + b);
		 * System.out.println("after Swapping a value" + a + "b value" + b);
		 */

		/*
		 * HashSet<String> obj = new HashSet<String>(); obj.add("durga");
		 * obj.add("prasad"); obj.add("durga"); obj.add("prasad");
		 * 
		 * Iterator<String> s = obj.iterator(); while (s.hasNext()) { String print =
		 * s.next(); System.out.println(print); }
		 * 
		 * TreeSet<String> ob = new TreeSet<String>(); ob.add("durga");
		 * ob.add("ableto"); System.out.println(ob);
		 * 
		 * Stack<String> o = new Stack<String>(); o.push("harish"); o.push("mahesh");
		 * System.out.println(o); System.out.println(o.peek());
		 * 
		 * LinkedHashMap<String, Integer> hs = new LinkedHashMap<String, Integer>();
		 * hs.put("rakesh number", 23); hs.put("pravven num", 24); hs.put("visahal n",
		 * 25); hs.put("pravven ", 24); System.out.println(hs);
		 * System.out.println(hs.keySet()); System.out.println(hs.entrySet());
		 */

		/*
		 * int p = 20; try { System.out.println(p / 2); System.out.println(p / 0);
		 * System.out.println(p / 2);
		 * 
		 * } catch (Exception e) { System.out.println("this is not divided by zero");
		 * 
		 * } finally { System.out.println(p / 3);
		 * 
		 * }
		 * 
		 * int age = 30; try { if (age <= 28) { throw new MyException(); } } catch
		 * (Exception e) { System.out.println("please enter valid input");
		 * 
		 * }
		 */
		// with using thiered vweriable
		int i = 10;
		int j = 15;
		System.out.println("before Swapping i value" + i + "j value" + j);
		// with using thiered vweriable
		/*
		 * int e = i; i = j; j = e;
		 */
		// without using thired veruable&add+sub
		/*
		 * i=i+j; j=i-j; i=i-j;
		 */
		// without using thired veruable with using multiplication and devision
		/*
		 * i = i * j; j = i / j; i = i / j;
		 */
		j = i + j - (i = j);

		System.out.println("before Swapping i value" + i + "j value" + j);

	}
}