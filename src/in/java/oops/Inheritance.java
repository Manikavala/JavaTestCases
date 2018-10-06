package in.java.oops;

	class A {
		public void animal() {
			System.out.println("animal");
		}
	}	
	class B extends A{
		void dog(){
			System.out.println("dog");
		}
	}
	class C extends B{
		void cat(){
			System.out.println("cat");
		}
	}
	public class Inheritance{  
		public static void main(String args[]){  
		C d=new C();  
		d.cat();  
		d.animal();
		d.dog();
		}
		}

