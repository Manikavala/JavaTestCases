package test.java.programs;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String s = "abacbdbasbdasbd";

		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i) + 1));
			} else {
				hm.put(s.charAt(i), 1);
			}

		}
		System.out.println(hm);
	}

}
