import java.util.Scanner;

import org.testng.Assert;

public class NewConcepts {

	public static void main(String[] args) {

		String values[] = { "java", "prasad", "chinna", "java" };

		for (int s = 0; s < values.length; s++) {

			for (int l = 0; l < values.length; l++) {

				if (values[s] == values[l]) {

					System.out.println(values[s]);
					break;

				}

			}

		}

	}

}
