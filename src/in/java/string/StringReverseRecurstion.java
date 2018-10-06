package in.java.string;

public class StringReverseRecurstion {

	static String rev = "";

	public static void main(String a[]) {
		String s = "madam";
		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println(rev + ": " + "Palendrom");
		} else {
			System.out.println(rev + ": " + "Not Palendrom");
		}
	}

	/*
	 * String reverse = "";
	 * 
	 * public String reverseString(String str){ int len=str.length(); if(len ==
	 * 1){ return str; } else { reverse
	 * +=str.charAt(len-1)+reverseString(str.substring(0,len-1)); return
	 * reverse; } }
	 * 
	 * public static void main(String a[]){ StringReverseRecurstion srr = new
	 * StringReverseRecurstion();
	 * System.out.println("Result: "+srr.reverseString("vkinam")); }
	 */

	/*
	 * public int reverseNumber(){ int number=1123; int reverse = 0;
	 * while(number != 0){ reverse = (reverse*10)+(number%10); number =
	 * number/10; } return reverse; }
	 * 
	 * public static void main(String a[]){ StringReverseRecurstion nr = new
	 * StringReverseRecurstion();
	 * System.out.println("Result: "+nr.reverseNumber()); }
	 */
}