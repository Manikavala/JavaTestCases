
package in.java.string;

public class StringFormat {

	public static void main(String[] args) {

		String s = "1122334455667788";

		int len = s.length();

		char[] ch = new char[len];

		for (int i = 0; i < len; i++) {
			if (i < len - 4) {
				ch[i] = 'X';
			} else {
				ch[i] = s.charAt(i);
			}
		}
		System.out.println(ch);
	}

}
