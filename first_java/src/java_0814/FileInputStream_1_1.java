package java_0814;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileInputStream_1_1 {
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�о�� ���� �̸� : ");
		file = read.readLine();
		
		System.out.println(file + "���� ���� \r\n");
//		FileInputStream fis = new FileInputStream(file); 
		// 8bit �� �ѱ��� �⺻ 2byte �̱� ������ ������������
		FileReader fis = new FileReader(file); // �̷��� ���� �����ϰ� ����
		
		while ((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		// byte �̱⶧���� ����. 
		
	}

}