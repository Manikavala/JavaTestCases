package in.java.lambdaExpressions;

class Myrunnable implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
		}
	}
}

public class ThreadDemoWithOutLambda {

	public static void main(String[] args) {
		Myrunnable r = new Myrunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i= 0; i<10; i++) {
			System.out.println("main thread");
		}

	}

}
