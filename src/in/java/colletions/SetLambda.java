package in.java.colletions;

import java.util.Comparator;
import java.util.TreeSet;

public class SetLambda {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(1);
		t.add(4);
		t.add(6);
		t.add(8);
		t.add(4);
		System.out.println(t);
	}
}

class MyComparator implements Comparator<Integer>{

	public int compare(Integer i1, Integer i2) {
//		if (i1 < i2) {
//			return +1;
//		} else if (i1 > i2) {
//			return -1;
//		} else {
//			return 0;
//		}
return (i1<i2)?1:(i1>i2)?-1:0;
	}

}
