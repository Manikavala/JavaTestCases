package in.java.system;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIp {
	public static void main(String args[]) throws UnknownHostException{
		InetAddress myip= InetAddress.getLocalHost();
		System.out.println(myip.getHostAddress());
		System.out.println(myip.getHostName());
		System.out.println(myip.hashCode());
	}

}
