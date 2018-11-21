package test.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*class MyComparator implements Comparator{

	@Override
	public int compare(Object i1, Object i2) {
		Integer o1=(Integer) i1;
		Integer o2=(Integer) i2;
		if(o1<o2){
			return +1;
		}else if (o1>o2) {
			return -1;
		}else {
			return 0;
		}
		
	//	return o1<o2?1:o1>o2?-1:0;
	}
	 
}*/
public class JavaComparator {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("mani..");
		ls.add("kv");
		ls.add("mkk");
		ls.add("ssss");
		//Collections.sort(ls,(i1,i2)-> -i1.compareTo(i2));
		
		//sorting with length
		Comparator<String> c= (s1,s2) ->{
			int i1= s1.length();
			int i2= s2.length();
			return i1<i2?1:i1>i2?-1:s1.compareTo(s2);
			//return i1<i2?1:i1>i2?-1:0;
		};

		Collections.sort(ls,c);
		System.out.println(ls);
		
		List<Integer> l= new ArrayList<>();
		l.add(100);
		l.add(1);
		l.add(10);
		l.add(11);
		l.add(51);
		
		//Collections.reverse(l);
//		System.out.println(l);
//		Collections.sort(l);
//		System.out.println(l);
//		Collections.sort(l,(i1,i2)->i1<i2?1:i1>i2?-1:0);
//		System.out.println(l);
		
		//Set<Integer> s= new TreeSet<>(new MyComparator());
		Set<Integer> s= new TreeSet<>((i1,i2) -> i1<i2?1:i1>i2?-1:0); //lambda expression comparator method compare implementation
		s.add(1);
		s.add(11);
		s.add(15);
		s.add(10);
		s.add(11);
	//	System.out.println(s);
		
	Map<Integer, String> m= new TreeMap<>((i1,i2) -> i1<i2?1:i1>i2?-1:0);
	m.put(1, "ljf");
	m.put(21, "Man");
	m.put(3, "Mani");
	m.put(3, "Mani");
	m.put(10, "Mani");
	/*m.put("a",1);
	m.put("x", 21);
	m.put("s", 6);*/
	//System.out.println(m);
	
	
	
	//___________________User Defined Object__________________________
	class Employee {
		private String name;
		private int empNo;
		
		public Employee(int empNo,String name) {
			this.empNo=empNo;
			this.name=name;
		}
		public String toString(){
			return empNo+":"+name;
		}
		
	}

	/*Employee e1 =new Employee(100, "Mani");
	Employee e2= new Employee(111, "oneoneone");
	System.out.println(e1);
	System.out.println(e2);*/
	
	
	ArrayList<Employee> al = new ArrayList<>();
	al.add(new Employee(11, "asd"));
	al.add(new Employee(3, "mani"));
	al.add(new Employee(6, "siva"));
	al.add(new Employee(11, "kv"));
	 Collections.sort(al,(i1,i2)->i1.empNo<i2.empNo?1:i1.empNo>i2.empNo?-1:0);
//	System.out.println(al);
	}

}
