
package in.java.array;

public class RemoveAEIOU {
public static void main(String[] args) {
	String s ="helloworld";
	char cc[]=new char[s.length()];
	String str="";
	int j=0;
	for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			
		}else {
			cc[j++]=c;
			str=str+c;
		}
	}
	System.out.println(cc);
	System.out.println(str);
}
}
