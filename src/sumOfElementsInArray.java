import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class sumOfElementsInArray {

	public static void main(String[] args) {
		int count = 0;
		int[] s = { 1, 2, 3, 4, 5, 6 };
		for (int one : s) {
			count = count + one;

		}
		System.out.println(count);
	}

}
