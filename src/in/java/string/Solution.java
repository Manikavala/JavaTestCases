package in.java.string;

public class Solution {
public static void main(String args[] ) throws Exception {
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String s1="opentext internship program";
        String sArr[]=s1.split(" ");

        for(String s:sArr){
            int len=s.length();
            if(len%2==0){
                char ch[]=s.toCharArray();
                int half=len/2;
                String firstHalf=s.substring(0,half-1);
                String secHalf=s.substring(half);
                System.out.println(secHalf+firstHalf);
            }else{

            }
        }
}
}