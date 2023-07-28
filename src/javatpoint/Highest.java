package javatpoint;

import java.util.List;

public class Highest {

	public static void main(String[] args) {
		String s = "KataKatla DurGa PraSAd";
		int upperCase = 0;
		int lowerCase = 0;

		char[] all = s.toCharArray();

		for (char one : all) {
			if (one >= 'A' && one <= 'Z') {
				upperCase++;
			} else {
				if (one >= 'a' && one <= 'b')
					lowerCase++;
			}
		}
		System.out.println("total upper cases  = " + upperCase);
		System.out.println("total lower cases  = " + lowerCase);

		String d = "katakatladurgaprasad";

		int vowels = 0;
		int consonent = 0;

		char[] all1 = d.toCharArray();

		for (char one1 : all1) {
			if (one1 == 'a' || one1 == 'e' || one1 == 'i' || one1 == 'o' || one1 == 'u') {

				vowels++;
			} else {
				consonent++;
			}

		}
		System.out.println("vowels  =" + vowels);
		System.out.println("consonent  =" + consonent);

		String g = "kataktaladurgaprasad ";
		for (int i = g.length() - 1; i >= 0; i--) {
			System.out.println(g.charAt(i));
		}

		String a = "durgaprasad";
		int vowels1 = 0;
		int consonents1 = 0;
		char[] allLetters = a.toCharArray();

		for (char oneLetter : allLetters) {
			if (a.matches(".*[aeiou].*")) {
				vowels1++;
			} else {
				consonents1++;
			}

		}
		System.out.println("vowels  =" + vowels1);
		System.out.println("consonent  =" + consonents1);
		int sum = 0;
		int[] allInOne = { 1, 2, 3, 4, 5 };
		for (int ones : allInOne) {
			
			
			sum+=ones;

		}
		System.out.println(sum);

	}
}
