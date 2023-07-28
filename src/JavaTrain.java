
public class JavaTrain {

	public static void main(String[] args) {
		int k[] = { 10, 12, 13, 14, 15 };
		for (int f = 0; f < k.length; f++) {
			System.out.println(k[f]);

		}

		int total[] = { 10, 12, 13, 14, 15 };
		for (int single : total) {
			System.out.println(single);

		}
		int arr[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		for (int v = 0; v < arr.length; v++) {
			for (int x = 0; x < arr[v].length; x++) {
				System.out.println(arr[v][x]);

			}

		}

		String g = "durga"; 
		System.out.println(g.length());
		String o = "durga prasad katakatla";
		String p = "laxman kumar ";
		System.out.println(p + o);

	}
}
