package in.java.test;

	public class OverLoading {
	static void m(String s){
		System.out.println("String");
	}
	static void m(Object o){
		System.out.println("Object");
	}
	public static void main(String[] args) {
		m("print");
	}
	}
