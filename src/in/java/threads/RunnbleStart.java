package in.java.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RunnbleStart {
	

public static void main(String[] args) {
	
HashMap<Integer, String> hm=new HashMap<>();
hm.put(1, "mani");

HashMap<Integer, Object> hm1=new HashMap<>();
hm.put(2, hm.get(hm));

List<HashMap<Integer, HashMap<Integer,String>>> l=new ArrayList<>();
l.add((HashMap<Integer, HashMap<Integer, String>>) hm1.get(hm1));
System.out.println(l.get((int) hm1.get(hm.get(hm))));

}
}
