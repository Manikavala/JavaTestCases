package in.java.threads;
// Case 1

//public class ThreadInnerClass {
//
//	public static void main(String[] args) {
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i <= 10; i++) {
//					System.out.println("child class");
//				}
//
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Main class");
//		}
//	}
//
//}

//Case 2 
//public class ThreadInnerClass {
//
//	public static void main(String[] args) {
//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i <= 10; i++) {
//					System.out.println("child class");
//				}
//			}
//		});
//		t.start();
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Main class");
//		}
//	}
//
//}

// Case 3	with Lambda
public class ThreadInnerClass {

	public static void main(String[] args) {
		Thread t = new Thread(	
				() -> { //it is like implementing run method in runnable interface
			for (int i = 0; i <= 10; i++) {
				System.out.println("child class");
			}
		});
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main class");
		}
	}

}