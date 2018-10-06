package in.java.string;

public class StringToInteger {
public static void main(String[] args) {

	//	String to Number
	String s="1234";
	Integer i=Integer.parseInt(s);	//Type -I
	Integer i1=Integer.valueOf(s);	//Type -II
	System.out.println(i.getClass().getSimpleName());
	System.out.println(i);
	System.out.println(i1);
	
	//	ASCII to Interger
	int asciiValue = 53;
	int numericValue = Character.getNumericValue(asciiValue);
	System.out.println(numericValue);
	}
}

