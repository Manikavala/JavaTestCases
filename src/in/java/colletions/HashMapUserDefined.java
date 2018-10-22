package in.java.colletions;

import java.util.HashMap;
// Accenturre
public class HashMapUserDefined {
public static void main(String[] args) {
	HashMap<Person, String> hm=new HashMap<>();
	Person p1=new Person("1","Apple");
	Person p2=new Person("1","Samsung");
	
	hm.put(p1, "Apple");
	hm.put(p2, "Samsung");
	
	p1.setName("Samsung");
	
	System.out.println(hm.get(p1));
}
}
class Person {
	private String id;
	private String name;
	public Person(String string, String string2) {
	this.id=string;
	this.name=string2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}