package in.java.exceptions;


public class Return {
	public Return() {
		
	}
	public static int text(){
			try{
				System.out.println("try");
				int a=1/0;
				return 1;
			}catch (Exception e) {
				System.out.println("catch");
				return 2;
				
			}
			finally {
				System.out.println("finally");
				return 3;
			}
	}
	
			public static void main(String[] args) {
				System.out.println(text());
				}
}

