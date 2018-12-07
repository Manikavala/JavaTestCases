package in.java.interview;

public class MultipleInterface {
public static void main(String[] args) {
	String s="mani";
	String s1=new String("mani");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	s1="kkkkkkk";
	String ss="kkkkkkk";
	System.out.println(s1==ss);
}
class Test implements I1,I2{
	public void hello(){
		System.out.println();
	}
}
interface I1{
	void hello();
}

interface I2{
	void hello();
}


}
