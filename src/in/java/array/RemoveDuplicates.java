package in.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// int arr[]=new int[]{1,2,5,3,3,4,5,5,6,1,2,3,5,4,3,2,1,1};
		String s = "manik1antaa 111111mnanmaa11nmamamaaa1a1";
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = (char) temp[i];
			System.out.print(arr[i] + " ");
		}

	//	int arr1[] = { 1, 2, 1, 3, 2, 1, 12, 34, 11, 0, 2, 2, 1, 4, 1, 2,0 };
	//	int len = arr.length;
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			al.add(arr1[i]);
		}*/

		/*List<int[]> al = Arrays.asList(arr1);
		Object obj[] = al.toArray();
		for (Object i : obj) {
			if (al.indexOf(i) != al.lastIndexOf(i)) {
				al.remove(al.lastIndexOf(i));
			}
		}
		for (int[] i1 : al) {
			System.out.print(i1 + ",");
		}*/

	}
}