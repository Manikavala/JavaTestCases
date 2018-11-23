package in.java.oops;

public class Converting {
public static void main(String[] args) {
	/*String s="123221112";
	
	int i=Integer.valueOf(s);
	System.out.println(i);
	
	int k=Integer.parseInt(s);
	System.out.println(k);
	*/
	/*String ss="mani kanta k v";
	
	int len=ss.length();
	String rev="";
	for(int i1=len-1;i1>=0;i1--){
		rev=rev+ss.charAt(i1);
		
		//System.out.print(ss.charAt(i1));
	}
	System.out.println(rev.equals(ss));*/
	
	/*String ss="mani kanta k v";
	char ch[]=ss.toCharArray();
	
	char  tempS[]=new char[ss.length()];
//	String temp="";
	int len=ss.length();
	for(int i=0;i<=len-1;i++){
		
		if(ss.charAt(i)==' '){
			if(len==i){
				
			}else {
				char tt=ss.charAt(i+1);
				
				ch[i+1]='X';
			}
			
		}else {
			//ch[i]=ch[i];
		}
		
	//	System.out.println(ss.contains(" "));
	}
	System.out.println(ch);*/
	
	String s="2323749343423";
	char ch[]=s.toCharArray();
	int len=s.length();
	
	for(int i=0;i<len;i++){
		
		if(i<(len-4)){
		ch[i]=s.charAt(i);
		}else {
		ch[i]='X';
		}
		
	}
	System.out.println(ch);
}
}




















