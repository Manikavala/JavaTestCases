package in.java.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
public static void main(String[] args) {
		
	
	
	List<String> l=new ArrayList<String>(); //Type Inerance
	l.add("mani");
	l.add("mani1");
	l.add("mani2");
	System.out.println(l);
	
	List<String> list=Collections.unmodifiableList(l);
	list.add("mma");
	
	
	
	
/*	
	
	List<String> modifiable = new ArrayList<>();
	modifiable.add("Java");
	modifiable.add("is");

	// Here we are creating a new array list
	 List<String> unmodifiable = Collections.unmodifiableList(new ArrayList<>(modifiable));
	System.out.println("Before modification: " + unmodifiable);

	modifiable.add("the");
	modifiable.add("best");

	System.out.println("After modification: " + unmodifiable);
	
*/
}
}
