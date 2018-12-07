package in.java.colletions;
import java.util.HashMap;
import java.util.Iterator;

public class Array1 {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "mamni");
	hm.put(2, "kv");
	hm.put(4, "hool");
	int count=0;
	System.out.println("Before: "+hm);
	Iterator<Integer> i=hm.keySet().iterator();
	while (i.hasNext()) {
		Integer num = (Integer) i.next();
		count++;
		if(count==3)
		i.remove();
		//hm.put(7, "jfj");
	}
	System.out.println("After: "+hm);
}
}
