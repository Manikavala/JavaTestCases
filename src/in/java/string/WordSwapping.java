package in.java.string;

public class WordSwapping {
public static void main(String args[] ) throws Exception {
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	
        String s1="opentext internship program";
        String sArr[]=s1.split(" ");

        
        for(String s:sArr){
            int len=s.length();
            if(len%2==0){
                char ch[]=s.toCharArray();
                int half=len/2;
                String firstHalf=s.substring(0,half);
                String secHalf=s.substring(half);
                System.out.println(secHalf+firstHalf);
            }else{
            	  char ch[]=s.toCharArray();
                  int half=len/2;
                  char c=s.charAt(half);
                  String firstHalf=s.substring(0,half);
                  String secHalf=s.substring(half+1);
                  System.out.println(secHalf+c+firstHalf);
            }
        }
}
}