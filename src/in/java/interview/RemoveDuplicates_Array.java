package in.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates_Array {
public static void main(String[] args) 
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2,1,1,5,1};
 Arrays.sort(my_array);
        for (int i = 0; i < my_array.length-1; i++){
        	
            for (int j = i+1; j < my_array.length; j++){
            	
                if ((my_array[i] == my_array[j]) && (i != j)){
                	
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    } 
}
