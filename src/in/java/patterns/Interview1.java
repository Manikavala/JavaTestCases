package in.java.patterns;

public class Interview1 {
		public Interview1() {
		}
	public static void main(String[] args) {
		int n = 4, num = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num);
			}
			 num++;
			System.out.println();
		}
		 num--;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num);
			}
			 num--;
			System.out.println();
		}
	}
}
