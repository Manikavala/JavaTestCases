package in.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicates {
	
	/*public static void main(String[] args) {
		String s="aabaccacbczznmm";
		char ch[]=s.toCharArray();
		int len=ch.length;
		int x=0;
		char temp[]=new char[len];
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len-1;j++){
				if(ch[i]!=ch[j]){
					temp[x++]=ch[i];
				}else{
					
				}
			}
		}
for(char c:temp){
	System.out.print(c+",");
}
	}*/
	
	
	
	
	
	//public static void main(String[] args) {
		
		/*String ss="manikanta veera";
		char arr[]=ss.toCharArray();
		int n=arr.length;
		 char[] temp = new char[n];  
	     int j = 0;  
	     for (int i=0; i<n-1; i++){  
	         if (arr[i] != arr[i+1]){  
	             temp[j++] = arr[i];  
	         }  
	      }
	     temp[j++] = arr[n-1]; 
		for(char c:temp){
			System.out.print(c+",");
		}
	}*/
	
	
	 
	  /*public static void main(String[] args) {
	   String[] data = { "E", "C", "B", "E", "A", "B", "E", "D", "B", "A" };
	 
	 List<String> list = Arrays.asList(data);
	 Set s=new HashSet();
	 s.addAll(list);
	 System.out.println(s);
	/*--------------------------------------------------------------------------------------------*/
	 /* Set<String> set = new HashSet<String>(list);
	 
	  System.out.print("After removing duplicates: ");
	  String[] resarray= new String[set.size()];
	   set.toArray(resarray);
	 
	 for (String ele: resarray) {
	 
	 System.out.print(ele + ", ");
	 
	 }*/
	/*--------------------------------------------------------------------------------------------*/
	   /*	List l=new ArrayList<>();
		l.add("m");
		l.add("n");
		l.add("m");
		
		Set s=new HashSet<>();
		s.addAll(l);
		l.clear();
		l.addAll(s);
		System.out.println(l);*/
	public static void main(String[] args) {
		String s="dsdkjsssdhsdajdh";
char ch[]=s.toCharArray();
HashMap<Character, Integer> hm=new HashMap<>();
for(char c:ch){
	if(hm.containsKey(c)){
		hm.put(c, hm.get(c)+1);
	}else {
		hm.put(c, 1);
	}
}
System.out.println(hm);
		int len=ch.length;
		Arrays.sort(ch);
		String temp="";
for(int i=0;i<len-1;i++){
	if(ch[i]!=ch[i+1]){
		temp=temp+ch[i];
	}
}

System.out.println(temp+ch[ch.length-1]);
	}
	
	}


