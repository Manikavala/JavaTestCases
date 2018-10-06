package in.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	/*public static void main(String[] args) throws Exception { 
		
	char[] chars = new char[] {'\u0097'}; 
	System.out.println(chars); 
	String str = new String(chars);
	System.out.println(str); 
	byte[] bytes = str.getBytes();
	System.out.println(bytes); 
	System.out.println(Arrays.toString(bytes)); }*/
	public static void main(String []args){
	List<String> list = new ArrayList<String>(); 
	//add some stuff 
	list.add("android"); 
	list.add("apple"); 
	String[] a= list.toArray(new String[list.size()]);
	for(String s:a){
		System.out.println(s);
	}
	List l=new ArrayList<>();
	l=Arrays.asList(a);
	System.out.println(l);
}
}