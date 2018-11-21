package test.java.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaV8ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> am=new ArrayList<>();
		am.add(12);
		am.add(1);
		am.add(14);
		am.add(2);
		am.add(10);
		
		am.forEach( i -> {
			//System.out.println("suare :"+i*i);
		});
		Integer[] arr=	am.toArray(new Integer[am.size()]);		// list to array using normal way
		Integer i[]= am.stream().toArray(Integer[]::new);	// list to Array using stream
		for (Integer integer : i) {
		//System.out.println(integer);
		}
		//i.stream // wont work so we go for
 
				Stream.of(i).forEach(System.out::println);	// forEach with array...

				//	Stream<Integer>s=Stream.of(2,3,6,8,9,6,22); 
				//	s.forEach(System.out::println);
		
	}

}
