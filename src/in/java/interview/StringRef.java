package in.java.interview;

public class StringRef {
public static void main(String[] args) {
	String a1="mani";
	String a2=new String("mani");
	
	a2="world";
	System.out.println(a1+" "+a2);
}
}
