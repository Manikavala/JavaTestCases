package in.java.test;

public class WithOutMain {
	public static void main(String args[]) {
	
		try{
			int a=1/0;
		}finally {
			System.out.println();
		}
		System.out.println("hello");
	}
}
