package in.java.string;

import java.util.HashMap;

public class AllCharOccurenceHashMap {
public static void main(String[] args) {
	String s="Manikanta Kavala Veera";
	char ch[]=s.toCharArray();
	HashMap<Character, Integer> map=new HashMap<Character,Integer>();
	
	for(char c:ch){
		if(map.containsKey(c)){
			map.put(c, map.get(c)+1);
		}else {
			if(c!=' ')
			map.put(c, 1);
		}
	}
	System.out.println(map);
}
}
