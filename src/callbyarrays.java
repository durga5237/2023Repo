
public class callbyarrays {

	void toPrintArray(int array[]) {
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		int i[] = { 1, 2, 3, 4, 5 };
		// TODO Auto-generated method stub
		callbyarrays c = new callbyarrays();
		c.toPrintArray(i);

	}

}
