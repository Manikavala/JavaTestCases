package in.java.lambdaExpressions;

interface Info{
	public int square(int n);
}
public class Square {

	public static void main(String[] args) {
		Info i = n -> n*n;
		
		Info i1 = n -> {
			return n*n;
		};
		
/*		test cases  :
			Interface I = n -> n*n;		//valid
			Interface I = (n) -> n*n;	//valid
			Interface I = n -> return n*n;		//not valid	- bcz here return we have to use in braces 
			Interface I = n -> {	return n*n; }	// not valid 	- bcz here ending not correct we have to end with ;
			Interface I = n -> {	return n*n; }; // valid 
			Interface I = n -> {	return n*n; };
*/
		
		System.out.println("value :"+ i.square(3));
		
		System.out.println(i1.square(5));

	}

}
