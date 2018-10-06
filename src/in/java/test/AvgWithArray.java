package in.java.test;

public class AvgWithArray {

	public static void main(String []args){
		/*int[] arr={2,2,2,2};
		int len=arr.length;
		int avg=0;
		for(int i=0;i<len;i++){
			
			avg=avg+arr[i];
			
		}
		System.out.println(avg/len); */
		String s=new String("mani");
		s=s.intern();
		String s1="mani";
		String s2=new String("mani");
		s2=s2.intern();
		System.out.println(s1.equals(s));
		System.out.println(s1==s);
		System.out.println(s1==s2);
	}
}
