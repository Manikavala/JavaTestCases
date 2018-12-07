 package in.java.oops;

 class Boy {
	public void walk() {
		System.out.println("Human walks");
	}
}

public class StaticBinding extends Boy {
		
	public void walk() {
			System.out.println("Boy walks");
		}

	public static void main(String args[]) {
		System.out.println("fnvofnv");
		Boy obj = new StaticBinding();
		Boy obj2 = new Boy();
		obj.walk();
		obj2.walk();
	}
}
