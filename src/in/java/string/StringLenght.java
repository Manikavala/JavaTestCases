package in.java.string;

public class StringLenght {
public static void main(String[] args) {
	String s="mani";
	int count=0;
	char[] ch=s.toCharArray();
	
	for(char c:ch){
		count++;
		int i=c;
		System.out.println(i);
	}
	System.out.println(count);
	System.out.println(s.length()); 	//Other way with method

}
}
