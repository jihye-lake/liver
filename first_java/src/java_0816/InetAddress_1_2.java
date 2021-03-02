package java_0816;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_1_2 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress addr1 = InetAddress.getByName("www.google.com");  // �������ּҸ� ������ IP Address �� �ڵ����� ����
		InetAddress addr2 = InetAddress.getByName("203.133.167.16");
		InetAddress addr3 = InetAddress.getLocalHost();  // ���� ��ǻ�� IP�ּҿ� �̸��� ����
		
		System.out.println("================");
		System.out.println("addr1 : " + addr1.getHostAddress());
		System.out.println("addr1 : " + addr1.getHostName());
		
		System.out.println();
		
		System.out.println("addr2 : " + addr2.getHostAddress());
		System.out.println("addr2 : " + addr2.getHostName());
		
		System.out.println();
		
		System.out.println("addr3 : " + addr3.getHostAddress());
		System.out.println("addr3 : " + addr3.getHostName());
	}

}