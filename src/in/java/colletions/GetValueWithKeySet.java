package in.java.colletions;

import java.util.HashMap;
import java.util.Iterator;

public class GetValueWithKeySet {

	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();

		hash.put(1, "abc");
		hash.put(2, "123");
		hash.put(3, "qwe");
		hash.put(4, "mnb");
		hash.put(5, "abc");

		Iterator<Integer> i = hash.keySet().iterator();
		while (i.hasNext()) {
			int key = i.next();
			System.out.println(key + " value :" + hash.get(key));
		}
	}
}