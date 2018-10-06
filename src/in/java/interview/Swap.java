package in.java.interview;

public class Swap {
public static void main(String[] args) {
	
	// String Swapping
	String a,b;
	a="mani";
	b="Kv";
	System.out.println("A value :"+a+"---B value:"+b);
	a=a+b;
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("A value :"+a+"---B value:"+b);
	
	// Integer values Swapping
	int c=10,d=20;
	System.out.println("C value :"+c+"---D value:"+d);
	d=(c+d)-(c=d);
	System.out.println(c+" "+d);
}
}
