package in.java.interview;

import java.util.Base64;

public class Base64Demo {
public static void main(String[] args) {
	byte byt[]={1,2};
	
	Base64.Encoder encoder=Base64.getEncoder();
	String b=encoder.encodeToString("mani".getBytes());
	byte[] b1=encoder.encode(byt);
	System.out.println(b);
	System.out.println(b1.toString());
	
	Base64.Decoder decoder = Base64.getDecoder();
	String ss=new String(decoder.decode(b));
	
	System.out.println(ss);
	

}
}
