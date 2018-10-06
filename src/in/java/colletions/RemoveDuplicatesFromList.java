package in.java.colletions;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("ABC");
		lst.add("ABC");
		lst.add("ABCD");
		lst.add("mani");
		lst.add("ABCD");
		lst.add("ABCE");

		System.out.println("Duplicates List " + lst);
		Object[] obj = lst.toArray();

		for (Object o : obj) {
		//	System.out.print(o + ",");
		//	System.out.print(lst.lastIndexOf(o)+ ",");
			if (lst.indexOf(o) != lst.lastIndexOf(o)) {
				lst.remove(lst.lastIndexOf(o));
			}
		}

		System.out.println("Distinct List " + lst);

		//////////////
		/*
		 * HashSet<String> s=new HashSet<String>(); s.addAll(lst); lst.clear();
		 * lst.addAll(s); System.out.println(lst);
		 */
	}
}
