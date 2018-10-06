package in.java.exceptions;

 class Parent{
	void msg()throws ArithmeticException{
		System.out.println("Parent");
	}
}
 class Child extends Parent{
	public void msg()throws ArithmeticException{
		System.out.println("child Exception");
	}
}

public class MethodOverrriding{
public static void main(String[] args) {
	Parent p=new Child();
	try{
	p.msg();
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}

