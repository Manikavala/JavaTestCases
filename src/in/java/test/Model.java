package in.java.test;

import java.util.List;
import java.util.Map;

public class Model {
private String Name;
private List<String> names;
private Map<Integer,String> emp;

public void setName(String s){
	this.Name=s;
}
public String getName(){
	return Name;
}
void printResult(){
	System.out.println("result:"+Name);
}
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public Map<Integer,String> getEmp() {
	return emp;
}
public void setEmp(Map<Integer,String> emp) {
	this.emp = emp;
}
}
