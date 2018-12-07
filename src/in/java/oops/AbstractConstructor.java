package in.java.oops;

abstract class Parent{
	static int i=12;
	Parent(){
		this(i);
		System.out.println("defalut constructor");
	}
	
	Parent(int i){
		this.i=i;
		i+=i;
		System.out.println("data"+i);
	}
	abstract void test();
	void test1(){
		System.out.println("normal method");
	}
}

class Child extends Parent{
	
	void test(){
		System.out.println("abstract implumented ");
	}
}

public class AbstractConstructor {
public static void main(String[] args) {
	Child c=new Child();
//	Parent c1=new Child();
	c.test();
	c.test1();
}
}