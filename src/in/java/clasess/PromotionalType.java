package in.java.clasess;

public class PromotionalType {
	public static void main(String[] args) {

		String s="manikanta";
		char[] temp=new char[s.length()];
		int j=0;
		char []ch=s.toCharArray();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='a'|c=='i'){
				
			}else {
				temp[j++]=c;
			}
		}
		System.out.println(temp);
		
	}
}
