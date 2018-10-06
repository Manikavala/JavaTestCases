package in.java.exceptions;

import java.util.Scanner;

public class InputMismatchException1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Value");
	int i=s.nextInt();
	System.out.println(i);
	
}
}
