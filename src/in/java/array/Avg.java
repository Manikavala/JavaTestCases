package in.java.array;

public class Avg {
	public static void main(String[] args) {
	int arr[]=new int[]{1,2,3,4,5};
	int len=arr.length;
	int total=0;
	for(int i=0;i<len;i++){
		 total=total+arr[i];
	}
	System.out.println(total);
	System.out.println(total/len);
	}
}
