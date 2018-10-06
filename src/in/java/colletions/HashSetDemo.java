package in.java.colletions;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {

public static void main(String[] args) {
	
	HashSet<Integer> hs=new HashSet<Integer>();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(1);
	System.out.println(hs);
	
	
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(1, "Mani");
	hm.put(2, "two");
	hm.put(3, "three");
	hm.put(1, "four");
	
	System.out.println(hm);
}
}
