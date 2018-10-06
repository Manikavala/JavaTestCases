package in.java.lambdaExpressions;

interface inferfA{
	void m1();
}

class Demo implements inferfA{
	public void m1() {
		System.out.println("calling m1");
	}
}
public class AaTestWithOutLambdaExp {

	public static void main(String[] args) {
		Demo i = new Demo();
		inferfA i1 = new Demo();
		i.m1();
		i1.m1();
	}

}
