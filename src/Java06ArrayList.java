import java.util.ArrayList;
import java.util.ListIterator;

public class Java06ArrayList {

	public static void main(String[] args) {
		ArrayList<String> ub = new ArrayList<String>();
		// getfirst and getlast not avialable
		// to get size
		// is empty
		// to inserting the element
		
		//Strong and retriving
		
		ub.add("durga prasad");
		ub.add("durga prasad01");
		ub.add("durga prasad02");
		ub.add("durga prasad03");
		ub.add("durga prasad04");
		ListIterator<String> one = ub.listIterator();
		while (one.hasNext()) {
			String oneByOne = one.next();
			System.out.println(oneByOne + " " + "Welcome");
		}

	}

}
