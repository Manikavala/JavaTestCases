package in.java.exceptions;

public class ArithmeticWithInfinity {

	
	public static void main(String[] args) {
		{
			System.out.println("ouer...");
		}
		/*
		 * int a=2; int b; try{ b=a/0; }catch (Exception e) {
		 * System.out.println("by zero"); }finally {
		 * System.out.println("this  is final block"); }
		 */
		try {
			int a = 1 / 0; // This condition we get a output like :"infinity"
		} 
		catch (Exception e) {
			System.out.println("exception...");
		}
		finally {
			System.out.println("final block");
		}
		}
		}
