package in.java.lambdaExpressions;

interface interf{
	void m1();
}
public class Test {

	public static void main(String[] args) {
		interf i = () -> System.out.println("calling m1");
		
		i.m1();

	}

}
