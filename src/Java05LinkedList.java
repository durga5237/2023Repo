import java.util.LinkedList;

public class Java05LinkedList {

	public static void main(String[] args) {
		// its allows both directions-advantage
		// forward and backward direction is possible
		// its allows duplicates also
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("durga");
		obj.add("mani");
		obj.add(0, "surya"); // inserting the element at the middle of index
		System.out.println(obj);
		obj.addLast("rockey");
		System.out.println(obj);

		// output:[surya, durga, mani]
		// [surya, durga, mani, rockey]
		for (String one : obj) {
			System.out.println(one + " " + "welcome");

		}
	}

}
