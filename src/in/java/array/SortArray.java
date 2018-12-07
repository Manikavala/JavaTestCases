package in.java.array;

public class SortArray {

	public static void main(String[] args) {
		int temp;
		int[] input = new int[] { 11, 2, 4, 6, 7, -1, 0, 111 };
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				if (input[j] > input[j + 1]) {
					temp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = temp;
				}
			}
		}
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
}
