package in.java.array;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
	
	int num=29;
	
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	
	for(int i=2;i<num;i++){
		boolean flag=true;
		for(int j=2;j<Math.sqrt(i);j++){
			if(i%j==0){
				flag=false;
			}
		}
		if(flag){
			System.out.print(i+" ");
		}
	}
	}
}