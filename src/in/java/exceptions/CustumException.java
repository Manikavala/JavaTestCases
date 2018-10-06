package in.java.exceptions;

class InvalidAgeException extends Exception{
	  InvalidAgeException(String s) {
		
			 super(s);
		}
	}
public class CustumException {
		public static void valid(int age)throws InvalidAgeException,ArithmeticException{
		if(age<18)
			throw new InvalidAgeException("Not Valid");
		else
			System.out.println("welcome");
		}
		public static void main(String[] args) {
		try{
		valid(2);
		System.out.println("normal flow");
		}catch (Exception e) {
			System.out.println("catch"+e);
		}
		}
		}

