package in.java.colletions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapSyncronization {
    public static void main(String args[]) {
    	HashMap<Integer, String> hmap= new HashMap<Integer, String>();
         hmap.put(2, "Anil");
         hmap.put(44, "Ajit");
         hmap.put(1, "Brad");
         hmap.put(4, "Sachin");
         hmap.put(88, "Xyz");

         Map<Integer, String> map= Collections.synchronizedMap(hmap);
         /*synchronized(map){
             Iterator i = map.entrySet().iterator();
             while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.println(me.getKey() + ": "+me.getValue());*/
                
                Iterator<Integer> i = map.keySet().iterator();
                while(i.hasNext()) {
                   int me = i.next();
                   System.out.println(me + ": "+map.get(me));
             }
         }
    
	/*public static void main(String args[]) {
        List<String> hmap= new ArrayList<String>();
        hmap.add("Anil");
        hmap.add("Ajit");
        hmap.add("Brad");
        hmap.add("Sachin");

       List<String> l= Collections.synchronizedList(hmap);
       
       synchronized (l) {
		Iterator<String> i=l.iterator();
		while(i.hasNext()){
			String s=(String)i.next();
			System.out.println(s);
		}	
	}
   
}
	*/
}