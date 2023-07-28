import java.util.ArrayList;
import java.util.HashMap;

public class Java08Maps {

	public static void main(String[] args) {
		// every value linked with one key
		// its store the elements in key value pairs
		// keys are unique
		// Hasmap is not syncronised-multiple Thread run at a time
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("it", "durgaprasad");
		hash.put("it1", "durgaprasad");
		hash.put("it2", "durgaprasad");
		hash.put("it4", "durgaprasad56");

		System.out.println(hash);

		HashMap<String,Integer> dc = new HashMap<String,Integer>();
		dc.put("durga prasad",22);
		dc.put("durga prasad01",30);
		dc.put("durga prasad01",30);
		dc.put("durga prasad01",25);
		dc.put("durga prasad04",26);
		System.out.println( dc.entrySet());

	}

}
