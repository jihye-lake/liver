package java_0816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddress_3 { // ��� ������, InetAddress_2_1 �� ��������.
// �Ը� ū ����Ʈ(daum, google ��)�� IP�� �ϳ��� ���� ���� �ʴ�. ��� �ϸ� ���� ���� ������ �� ����.
	public static void main(String[] args) throws Exception {

		String url = null;

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������Ʈ �̸��� �Է��Ͻÿ�. ");
		url = read.readLine();

		InetAddress[] addr = InetAddress.getAllByName(url);  // ���� ���� �迭�ӿ� �� ���ٴ� ��.

		System.out.println("==============================");

		System.out.println(url + "�� " + addr.length + "���� IP �ּҸ� ���� �ֽ��ϴ�.");

		for (int i = 0; i < addr.length; i++) {
			System.out.println((i + 1) + "�� IP ��ȣ : " + addr[i].getHostAddress());
			// goggle �̳� oracle ���� ����Ʈ�� IP �ּҰ� �ϳ��� �߰Բ� ���Ƴ��� ���
		}
	}

}
