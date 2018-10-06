package in.java.oops;

public class FinalKey {
	int cube(final int n){  
		  // n=n+2;//can't be changed as n is final  
		  return n*n*n;  
		 
		  }  
	public static void main(String[] args) {
		
			    FinalKey b=new FinalKey();  
			    System.out.println(b.cube(5));
			     
			    
			 }  
	}

