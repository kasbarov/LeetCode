package Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt_13 {

	static Map<Character, Integer> romanMap = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {

		int i = 0;

		int result = 0;

		while (i < s.length()) {
			System.out.println("I:" + i);
			System.out.println("length:" + s.length());
			
			char letter = s.charAt(i);

			// IV && IX
			if (letter == 'I' && i + 1 < s.length()) {

				// IV
				if (s.charAt(i + 1) == 'V') {
					result += 4;
					i += 2;
					continue;

					// IX
				} else if (s.charAt(i + 1) == 'X') {
					result += 9;
					i += 2;
					continue;
				}
			}

			// XL && XC
			if (letter == 'X' && i + 1 < s.length()) {

				// IV
				if (s.charAt(i + 1) == 'L') {
					result += 40;
					i += 2;
					continue;

					// IX
				} else if (s.charAt(i + 1) == 'C') {
					result += 90;
					i += 2;
					continue;
				}
			}

			// CD && CM
			if (letter == 'C' && i + 1 < s.length()) {

				// IV
				if (s.charAt(i + 1) == 'D') {
					result += 400;
					i += 2;
					continue;

					// IX
				} else if (s.charAt(i + 1) == 'M') {
					result += 900;
					i += 2;
					continue;
				}
			}

			result+=romanMap.get(letter);
			i++;
		}

		return result;
	}

}
