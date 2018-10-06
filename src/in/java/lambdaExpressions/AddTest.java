package in.java.lambdaExpressions;


interface interf1{
	void add(int a,Float b);
//	void sub(int a,Float b);
	
	default void m1() {
		System.out.println("m1");
	}
	static void m2() {
		System.out.println("m2");
	}
}

public class AddTest {

	public static void main(String[] args) {
		interf1 i = (a,b) -> System.out.println("sum value :"+ (a+b) );
		i.add(1,2.2f);
		i.m1();
		interf1.m2();
	}

}
