package in.java.oops;

interface I1{
	void test();
}
interface I2{
	 abstract void test();
}
public class InterfaceTest implements I1,I2 {
	public InterfaceTest() {
		System.out.println("defaoult cons");
	}
@Override
public void test() {
	System.out.println("hi");
	
}
{
	System.out.println("instance 1");
}


public static void main(String[] args) {
	InterfaceTest t=new InterfaceTest();
	t.test();
	System.out.println(t instanceof I2);
}
{
	System.out.println("instance 2");
}
}
