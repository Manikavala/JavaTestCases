package in.java.interview;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	  int num=1254444;
      int reversenum =0;
      /*System.out.println("Input your number and press enter: ");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      num = in.nextInt();
      //While Loop: Logic to find out the reverse number
      *//*while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);*/
      
      String s="mani";
      String rev="";
      int len=s.length();
      System.out.println(len);
      for(int i=len-1;i>=0;i--){
    	  rev=rev+s.charAt(i);
      }
      System.out.println(rev);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
