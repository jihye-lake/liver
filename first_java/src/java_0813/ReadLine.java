package java_0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) throws IOException {
		
		String name = null;
		String addr = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader Ŭ������ ��ü reader �� �����մϴ�,
		// System.in.read() �� �ѹ��ھ� ����Ʈ�� �Է¹ޱ� ������ ���ڿ��� �����ؾ� �մϴ�.
		// InputStreamReader Ŭ������ ����Ʈ ���� �Է� ��Ʈ���� ���ڴ��� �Է½�Ʈ������ �����մϴ�.
		// ���ڿ��� ȿ�������� ó���ϱ����� BufferedReader Ŭ������ ��ü�� �̿��ϸ� ����ڰ� �Է��� ���ڿ��� ���� �Է¹��� �� �ֽ��ϴ�.
		// ���ڿ��� �Է� �ޱ� ���� BufferedReader Ŭ������ ����մϴ�.
		
		System.out.print("�̸��� �Է��Ͻÿ�. ");
		
		name = reader.readLine();
		
		System.out.print("�ּҸ� �Է��Ͻÿ�. ");
		
		addr = reader.readLine();
		
		System.out.println(name+ "�� ȯ���մϴ�. ����� " + addr + "�� ��� �ֱ���.");
		
	}

}
