package in.java.threads;

public class RunTwice implements Runnable{
	 
	 public void run(){  
		   System.out.println("running...");  
		 } 	
	 public static void main(String args[]){  

		// RunTwice t1=new RunTwice();  
		  
		 RunTwice t=new RunTwice();
		 Thread r=new Thread(t); 
		 r.start();
		
	  //t1.start();
	 }  
	}  