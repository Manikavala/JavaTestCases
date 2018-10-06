package in.java.interview;

/*if 456 is the number, then 456%10 = 6 and 456/10 = 45. We use these two techniques to 
 find the sum of all digits of a given number.*/

public class SumOfAlldigits {
public static void main(String[] args) {
	int n=12342, sum=0;
	while(n!=0){
		int lastNum=n%10;
		sum=sum+lastNum;
		n=n/10;
	}
	System.out.println(sum);
}
}
