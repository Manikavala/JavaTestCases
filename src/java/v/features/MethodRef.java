package java.v.features;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		List<String> l= new ArrayList<>();
		l.add("mani");
		l.add("kv");
		l.add("arman");
		l.add("siddu");
		
		l.forEach(System.out::println);
		

	}

}
