package in.java.string;

public class FindNumberOfWords {
	public static void main(String args[])
	{ 
		String s = "welcome to candid   n     java tutorial";
/*		int count=0;
		String s1[]=s.split(" ");
		for(String ss:s1){
			count++;
			int len=ss.length();
		for(int i=len-1;i>=0;i--){
			System.out.print(ss.charAt(i));
		}
			}
		System.out.println(" "+count);*/
		
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}
