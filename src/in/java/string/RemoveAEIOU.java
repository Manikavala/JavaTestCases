package in.java.string;

import java.util.ArrayList;
import java.util.List;

public class RemoveAEIOU {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";
		List<Character> list = new ArrayList<Character>();
		list.add('A');		list.add('E');		list.add('I');		list.add('O');		list.add('U');
		list.add('a');		list.add('e');		list.add('i');		list.add('o');		list.add('u');

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!list.contains(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString()); 
	}
}