package in.java.string;

import java.util.Arrays;
import java.util.HashMap;

class StringCharOccurence {
	public static void main(String[] args) {
		String s = "mananakaniaianakn";
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		int count = 0;
		int len = ch.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (ch[i] == ch[j]) {
					count = count + 1;
				}
				System.out.println(ch[i] + " " +count);
				break;
			}
			
		//	System.out.println(ch[i] + " " + count);
		}

		/*
		 * for(char c:ch){ if(c=='a'){ count++; } } System.out.println(count);
		 */
	}
}