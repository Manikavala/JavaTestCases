package in.java.colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
public static void main(String[] args) {
	int a=10;
	int b=20;
	float c=1/2;  
	System.out.println(c);
	b=(a+b)-(a=b);
	System.out.println(a+"-------"+b);
	
	int ar[]={1,3,5,2,0};
	Arrays.sort(ar);
	
	//diff way
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value:"+a +" b value :"+b);
	
}
}
