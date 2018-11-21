package test.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8VStreem {

	public static void main(String[] args) {
		// filter
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(1);
		al.add(14);
		al.add(2);
		al.add(10);
		//System.out.println(al);
		List<Integer> ll1=al.stream().filter(x-> x%2==0).collect(Collectors.toList());
		//System.out.println(ll1);
		
		//map
		ArrayList<Integer> am=new ArrayList<>();
		am.add(12);
		am.add(1);
		am.add(14);
		am.add(2);
		am.add(10);
		//Collections.sort(am);
	List<Integer> lm = am.stream().map(i ->i+5).collect(Collectors.toList());
	
	List<Integer> ll =am.stream().sorted().collect(Collectors.toList());	// Default sorting order will follow
	
	List<Integer> ll2 =am.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());	// Default sorting order in another way will follow
	
	List<Integer> l3 =am.stream().sorted((i1,i2)-> i1<i2?1:i1>i2?-1:0).collect(Collectors.toList());	// reversing Default sorting order with help of follow
	
	List<Integer> l4 =am.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());	//reversing with help of '-' Default sorting order will follow
	// here in place of '-' we can do reveres the order like i2.compareTo(i1) it will also give reveres order

	// here ll and ll2 is gives same o/p		l3 and l4 gives same o/p
	
	long lc = am.stream().filter(i ->i<10).count();	
//	System.out.println(ll);
//	System.out.println(lm);
//	System.out.println(lc);
	
	
	
	
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);

		// sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		// using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		// using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel-=" + p));

		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));
	}
	

}
