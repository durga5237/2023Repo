package javatpoint;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrayList {

	final int durga = 10;

	void demo() {
		int durga = 120;
		System.out.println(durga);
	}

	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("durga");
		ob.add("durgaprasad");
		ob.add("durgakatakatla");
		ob.add("durganaidu");
		ob.add("ganesh");
		int count = 0;
		for (int f = 0; f < ob.size(); f++) {

			if (ob.get(f) != null) {

				count++;
			}

		}
		System.out.println(count);
		long c = ob.stream().filter(s -> s.startsWith("d")).count();
		System.out.println(c);

		long d = Stream.of("durga", "prasad", "katakatla").filter(s -> s.startsWith("d")).count();
		System.out.println(d);
		ob.stream().filter(e -> e.length() > 6).forEach(e -> System.out.println(e));
		List<String> f = ob.stream().filter(e -> e.length() > 6).collect(Collectors.toList());
		System.out.println(f);
		List<String> g = ob.stream().filter(e -> e.length() > 6).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(g);
		List<String> x = ob.stream().sorted().collect(Collectors.toList());
		System.out.println(x);

	}

}
