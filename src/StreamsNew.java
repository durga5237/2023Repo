import java.util.Arrays;

import org.testng.annotations.Test;

public class StreamsNew {

	// can you write the identify the 22 May 2024 date dynamically?

	@Test
	public void dateOfJourney() {

		long[] numbers = { 1, 2, 3, 4, 5 };

		long sum = Arrays.stream(numbers).sum();

		System.out.println("Sum of elements: " + sum);

	}

}
