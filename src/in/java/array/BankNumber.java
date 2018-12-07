package in.java.array;

public class BankNumber {
public static void main(String[] args) {
	String s="123456789023";
	char ch[]=s.toCharArray();
	/*char temp[]=new char[s.length()];
	for(int i=0;i<s.length();i++){
		if(i<s.length()-4){
			temp[i]='x';
		}else{
			temp[i]=ch[i];
		}
	}
	System.out.println(temp);
	for(char loop:temp){
	System.out.print(loop+" ");
	}*/
	for(int i=0;i<s.length();i++){
	if(i<s.length()-4){
		ch[i]='X';
	}else {
		
	}
	
}
	System.out.println(ch);
}
}
