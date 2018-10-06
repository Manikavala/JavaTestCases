package in.java.exceptions;

public class Exception_Return {

	static int b,a;
	static float result;
	public static float test(int i, int j) {
		
		return a/b;

	}
	public static void main(String[] args) {
		try {
			 result=test(1,0);
		} catch (Exception e) {
			System.out.println("error");
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println(result+"mmm");
	}
	
	
	
	
	
	/*static int b,a;

	 public static int division(int a,int b){
		 return a/b;
	}

	public static void main(String[] args) {
		
		int result=division(12,6);
		System.out.println(result);
	}
*/
}
