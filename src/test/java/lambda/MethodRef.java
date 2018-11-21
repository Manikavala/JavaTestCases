package test.java.lambda;

interface Left{
	default void m1(){
		System.out.println("i am from left");
	}
}
interface Right{
	default void m2(){
		System.out.println("i am from M2 right");
	}
	default void m1(){
		System.out.println("i am from right");
	}
}
public class MethodRef implements Left,Right{

	
	public void m1() {
		System.out.println("main method");
		Left.super.m1();
		
	}
	
	public static void main(String[] args) {
		
MethodRef  m = new MethodRef();
m.m1();
m.m2(); 
	}

}
