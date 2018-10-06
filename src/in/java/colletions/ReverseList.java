package in.java.colletions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ReverseList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("mani");
		al.add("kanta");
		al.add("k");
		al.add("v");
		
		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			String ss = (String) i.next();
			if (ss.equals("mani")) {
				i.remove();
			}
			System.out.println(ss);
		}
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}
}
