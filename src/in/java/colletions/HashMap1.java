package in.java.colletions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "mm");
		hm.put(2, "mm");
		hm.put(5, "mm");
		hm.put(3, "mm");
		hm.put(4, "mm");
		System.out.println(hm);
Iterator<Integer>i=hm.keySet().iterator();
while(i.hasNext()){
	int k=i.next();
	if(k==3){
		i.remove();
	}
}
System.out.println(hm);
	}
}
