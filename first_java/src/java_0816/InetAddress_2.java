package java_0816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddress_2 {
	public static void main(String[] args) throws Exception {
		
		String url = null;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������Ʈ �̸��� �Է��Ͻÿ�. ");
		url = read.readLine();
		
		InetAddress addr = InetAddress.getByName(url);
		
		System.out.println("=============================");
		System.out.println(url + " => " + addr.getHostAddress());
	}

}
