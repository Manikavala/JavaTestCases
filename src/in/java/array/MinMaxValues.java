package in.java.array;

public class MinMaxValues {
	public static void main(String[] args) {
		int arr[]={1,1,3,2,5,11,3,2,0};
		int tempMin = arr[0];
		int tempmax = arr[0];
		for(int i=0;i<arr.length;i++){
			if(tempMin>arr[i]){
				tempMin=arr[i];
			}
		}
		System.out.println(tempMin);
		
		for(int i=0;i<arr.length;i++){
			if(tempmax<arr[i]){
				tempmax=arr[i];
			}
		}
		System.out.println(tempmax);
	}
}
