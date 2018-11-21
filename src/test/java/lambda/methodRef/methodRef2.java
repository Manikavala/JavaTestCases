package test.java.lambda.methodRef;

import java.util.function.BiFunction;

class MyClass1{
	static int multiple(int a,int b){
		return a*b;
	}
}
public class methodRef2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> fn = MyClass1::multiple;
		fn.apply(2, 4);
		
	}

}
