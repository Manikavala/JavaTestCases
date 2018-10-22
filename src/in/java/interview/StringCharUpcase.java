package in.java.interview;

import java.util.LinkedHashMap;

public class StringCharUpcase {
//	IBM
	public static void main(String[] args) {
		String s="we are the world";  //We ArE tHe WoRlD
		String s1="this is some code"; // o/p - ThIs Is SoMe CoDe
		String temp="";
		String []sa=s1.split(" ");
		for(String _s: sa){
		String temps="";
			for(int i=0;i<_s.length();i++){
				if(i%2==0){
				char c=	Character.toUpperCase(_s.charAt(i));
				temps=temps+c;
				}else {
					temps=temps+_s.charAt(i);
				}
			}
			LinkedHashMap<Integer,String> m=new LinkedHashMap<>();
			
			
		//	System.out.println();
			temp=temp+temps+" ";
		}
		System.err.println(temp);
	}

}
