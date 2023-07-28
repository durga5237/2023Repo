import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("dur");
		lst.add("anirudhD");
		lst.add("ahushan");
		lst.add("flaxd");
		// COUNT
		long k = lst.stream().filter(s -> s.startsWith("d")).count();
		System.out.println(k);

		// WITHOUT ARRAY
		long d = Stream.of("durga", "prasad", "laxman").filter(s -> s.startsWith("d")).count();
		System.out.println(d);
		// LIMIT 4 AND COLLECT
		List<String> g = lst.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println(g);
		// FOR Each
		lst.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		// UPPER CASE
		List<String> e = lst.stream().filter(s -> s.endsWith("d")).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(e);
		// SORTED ORDER FOR ALPHABETIC ORDER
		List<String> y = lst.stream().sorted().collect(Collectors.toList());
		System.out.println(y);

		List<String> x = Stream.of("prasad", "laxman", "pavan", "jyo").filter(s -> s.startsWith("p"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(x);

		int i = 0;
		for (i = 0; i < 10; i++) {
			System.out.println(i);

		}
		IntStream.range(1, 20).forEach(s -> System.out.println(s));
		IntStream.rangeClosed(1, 20).forEach(System.out::println);

		IntStream.range(1, 20).filter(u -> u % 2 != 0).forEach(System.out::println);

	}
}