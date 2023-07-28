
public class Practice {
	int x;
	int y;
	int z;

	void Firstperson(int value) {
		System.out.println("durga roll number is=" + x);

	}

	void SecondPerson(double value) {
		System.out.println("suresh roll number is=" + y);

	}

	void Thirdperson(float value) {
		System.out.println("varun roll number is=" + z);

	}

	public static void main(String[] args) {

		Practice p = new Practice();
		p.x = 12;
		p.Firstperson(3);
		p.y = 20;
		p.SecondPerson(2.3);
		p.z = 25;
		p.Thirdperson(5.6f);

	}

}
