package in.java.oops;
class Example{
	/*Example() {
		// TODO Auto-generated constructor stub
	}*/
   Example(int i, int j){
      System.out.print("parameterized constructor");
   }
   Example(int i, int j, int k){
      System.out.print("parameterized constructor");
   }
   public static void main(String args[]){
      Example obj = new Example();
   }
}

//	in this case if we create parm constructor the compailer wont create defalult constructor then we can get compaile time error.