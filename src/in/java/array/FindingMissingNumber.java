package in.java.array;

public class FindingMissingNumber {
	
	public static void main(String[] args) {

		int[] arr = new int[] { 1,2,3,5 };
		// sum of total series
		int n = arr.length + 1;
		
		int sum = n * ((n + 1) / 2);
		// sum of array values
		int arr_sum = 0;
		for (int i : arr) {
			arr_sum += i;
		}
		
		System.out.println("series :"+n+" "+sum);
		System.out.println("array :"+arr_sum);
		System.out.print(sum - arr_sum);
		
	}
}
