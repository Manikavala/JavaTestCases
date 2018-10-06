package in.java.string;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="mani",s2="imna";
	char []ch1=s1.toLowerCase().toCharArray();
	char []ch2=s2.toLowerCase().toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(s1.length()==s2.length()){
//		for(int i=0;i<s1.length();i++){
//			if(ch1[i]==ch2[i]){
		if(s1.equals(s2)) {
			System.out.println("anagram");
			}else {
				System.out.println("Not anagram in");
				//break;
			}
		
		System.out.println("Anagram");
	}else {
		System.out.println("Not anagram");
	}
}
}
