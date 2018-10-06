package in.java.string;

public class WordsOccurence {
	public static void main(String[] args) {
		String s = "mani mani kv is very good good is kavala";
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		String sarr[] = s.split(" ");
		int count = 0;
		for (int i = 0; i <= sarr.length - 1; i++) {
			for (int j = i+1; j <= sarr.length - 1; j++) {
				if (sarr[i].equals(sarr[j])) {	 
					//count++;
					//if (count == 1)
						sb.append(sarr[i]+" ");
				}
			}
		}
		System.out.println(sb);
		System.out.println(sb1);
	}
}
/*
 * if(s.contains(sarr[i])){ count++; if(count==1){ sb.append(sarr[i]); }else {
 * System.out.println(sarr[i]); }
 * 
 * System.out.print(sarr[i]+" "); System.out.println(sb); }
 */