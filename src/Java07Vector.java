import java.util.Vector;

public class Java07Vector {

	public static void main(String[] args) {
		// same as ArrayList
		// Syncronised-one thread run at the time only

		//
		Vector<String> vc = new Vector<String>();
		vc.add("durga");
		System.out.println(vc);
		System.out.println(vc.capacity());

	}

}
