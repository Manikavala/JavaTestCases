package test.java.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* class MyEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

	@Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V old = this.value;
        this.value = value;
        return old;
    }
}*/
class MyHashCode{
	int i;
	public MyHashCode(int i) {
		this.i=i;
	}
	public int hashCode(){
		return i%9;
	}
	public String toString(){
		return i+"";
	}
}
public class Test {
public static void main(String[] args) {
	Hashtable<String, String> h= new Hashtable<>();
	//h.put(new MyHashCode(10), "A");
	//h.put(new MyHashCode(10), "A");
	
	/*String[] as={"key1","key2"};
	String[] av={"mani","vmvm"};
	HashMap<String, String> entry = new HashMap<String, String>();
	List<String> l=  Arrays.asList(as);
	List<String> l2=  Arrays.asList(av);
	Map<String, String> map =new  HashMap<String, String>();
	map.put("mani", "12333");
	for (Map.Entry<String, String> entryx : map.entrySet())
	{
	    System.out.println(entryx.getKey() + "/" + entryx.getValue());
	}
	
	Set<Entry<String, String>> set = map.entrySet();
System.out.println("hhhhhhhhh"+set);
	for(int i=0;i<l.size();i++){
		entry.put(l.get(i), l2.get(i));
		
	}
	
	Iterator<String> i= entry.keySet().iterator();
	while (i.hasNext()) {
		String sx = (String) i.next();
		System.out.println(sx+" value :"+entry.get(sx));
	}*/

}
}









/*Map<Integer, String> m=new TreeMap<>();
m.put(1, "ljf");
m.put(21, "Man");
m.put(3, "Mani");
//m.put(3, "Mani");
m.put(10, "Mani");

Iterator<Integer> k =m.keySet().iterator();
while (k.hasNext()) {
	Integer i = (Integer) k.next();
	System.out.println(i+" "+m.get(i));
}*/
/*String number="12345678901";
if (number.length() < 10 || number.length()>10)
	System.out.println("\nPhone number cannot be blank or Number must be 10 digits.");
else {
System.out.println("hello"+number.length());
}*/