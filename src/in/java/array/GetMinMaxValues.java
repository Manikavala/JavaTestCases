package in.java.array;

public class GetMinMaxValues {
public static void main(String[] args) {
	int arr[]=new int[]{1,1,3,2,5,11,3,2};
	
	int max =getMaxValue(arr);
	System.out.println("Max_value :"+max);
	int min =getMinValue(arr);
	System.out.println("Min_Value :"+min);
}
	 static int getMaxValue(int[] input){
		int maxvalue =input[0];
				for(int i=0;i<input.length;i++){
					if(input[i]>maxvalue){
						maxvalue=input[i];
					}
				}
		 return maxvalue;
	}
	
	 static int getMinValue(int[] input){
		 int minvalue=input[0];
		 for(int i=0;i<input.length;i++){
			 if(input[i]<minvalue){
				 minvalue=input[i];
			 }
		 }
		 return minvalue;
	 }
}

