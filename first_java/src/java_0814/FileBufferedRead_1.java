package java_0814;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileBufferedRead_1 {
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		String file;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�о�� ���� �̸��� �Է�");
		file = read.readLine();
		
		System.out.println(file + "���� ����");
		FileReader frr = new FileReader(file);
		
		BufferedReader brr = new BufferedReader(frr);  // �� �ᵵ ������ ���� ȿ���� ���� ���ش�.
		// ���� ���� �����͸� ó���� �� ����ȭ�� �����ֱ� ������ ���� �� ����.
		
		while ((i = brr.read()) != -1) {  // ���� BufferedReader brr �� �� ������ ������ brr.read �� frr �� �����ش�.
			System.out.print((char)i);
		}
		
	}

}
