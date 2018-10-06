package in.java.string;

public class MoveHeepToPool {

	public static void main(String []args){
		String s=new String("mani");
		s=s.intern();	//this is used to move string heap to pool...
		String s1="mani";
		String s2=new String("mani");
		s2=s2.intern();
		System.out.println(s1.equals(s));
		System.out.println(s1==s);
		System.out.println(s1==s2);
	}
}
