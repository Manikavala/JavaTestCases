package in.java.threads;

public class DeadLock {
	static String str1 = "Java";
	static String str2 = "UNIX";

	public static void main(String a[]) {

		Thread trd1 = new Thread() {
			public void run() {
				while (true) {
					synchronized (str1) {
						synchronized (str2) {
							System.out.println(str1 + str2);
						}
					}
				}
			}
		};

		Thread trd2 = new Thread() {
			public void run() {
				while (true) {
					synchronized (str2) {
						synchronized (str1) {
							System.out.println(str2 + str1);
						}
					}
				}
			}
		};

		trd1.start();
		trd2.start();
		// System.exit(0);
	}
}