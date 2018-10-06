package in.java.string;

public class StringFormatChar {

	public static void main(String[] args) {
		String s="11223fhhg348";
		int len=s.length();	//16
		char[] ch=s.toCharArray(); //string to char Array
		
		for(int i=0;i<len;i++){
			if(i<len-4){
				ch[i]='X';
			}
		}
		System.out.println(ch);
	}

}
