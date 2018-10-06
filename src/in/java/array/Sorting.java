package in.java.array;

public class Sorting {
	public int[] callSort(int[] a) {
		int len = a.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String args[]) {
		int a[] = new int[] { 5, 9, 8, 2, 1, 6 };
		Sorting s = new Sorting();
		int b[] = s.callSort(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}