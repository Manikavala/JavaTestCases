package in.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

		
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5};
		ArrayList<int[]> aa=new ArrayList<>(Arrays.asList(arr));
		System.out.println(" aaaa"+aa);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(2);
		System.out.println("sdfhj"+al);
		Integer[] a= al.toArray(new Integer[al.size()]);	
	System.out.println(a);	
	for(int d:a){
		System.out.println(d);
	}
	
	ArrayList<Integer> x=new ArrayList<Integer>();
	for(int s:a){
		x.add(s);
	}
	System.out.println(x);
	}

}
