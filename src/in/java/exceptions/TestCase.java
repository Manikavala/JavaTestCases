package in.java.exceptions;

public class TestCase {

	void display()throws ArithmeticException{
		System.out.println("Pink");
	}
	public static void main(String[] args) {
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmm");
		TestCase tc=new B();
		B b=new B();
		b.display();
		tc.display();
	}
	
}
class B extends TestCase{
	void display(){
		System.out.println("Reg");
	}
	
}