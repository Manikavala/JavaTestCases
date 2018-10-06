package in.java.validations;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePatters {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Value:");
	String ss=s.nextLine();
	//System.out.println(ss);
	boolean b=Pattern.matches("[0-9]{10}", ss);
	//System.out.println(b);
	if(b==false){
		System.out.println("Enter 10 Digit only");
	}
	if(b==true){
		System.out.println("successful");
	}
}
}
