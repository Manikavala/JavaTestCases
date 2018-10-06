package in.java.interview;


public class LeveleOfExecution {
	{
		System.out.println("instance up");
	}
	static {
		System.out.println("Static");
	}

	public LeveleOfExecution() {
		System.out.println("contructor");
	}

	{
		System.out.println("intrance ....");
	}

	void valid() {
		System.out.println("valid");
	}

	public static void main(String[] args) {

		
		LeveleOfExecution l = new LeveleOfExecution();
		l.valid();
		{
			System.out.println("instance");
		}
	}
}
