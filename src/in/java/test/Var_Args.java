package in.java.test;

class Var_Args {
	static {
		System.out.println("I am Static");
	}

	int[] sum(int... a) {
		for (int b : a) {
			System.out.print(b + " ");
		}
		return a;

	}

	public static void main(String[] args) {
		Var_Args v = new Var_Args();
		v.sum();
		v.sum(10);
		v.sum(10, 20);
		v.sum(10, 20, 30);

	}

}
