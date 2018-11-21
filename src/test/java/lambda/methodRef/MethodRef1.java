package test.java.lambda.methodRef;

interface MyInterface{
	void display();
}

class MyClass{
	 void myMethod(){
		System.out.println("My method.....");
	}

	
}
public class MethodRef1 {

	public static void main(String[] args) {
		MyClass obj= new MyClass();
		MyInterface m= obj::myMethod;
		m.display();
	}

}
