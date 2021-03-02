package java_0813;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWriter_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		
		Date date = new Date();
		
		str = "File Write Time \n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �̸��� �Է��Ͻÿ�.");
		file = read.readLine();
		
		System.out.print("������ ���ڿ��� �Է��Ͻÿ�.");
		str += read.readLine();
		
		char[] ch_str = new char[str.length()];
		
		str.getChars(0, str.length(), ch_str, 0);  // str �� ����ִ� ���ڿ�(String)�� ���̸�ŭ ĳ���� �迭���ٰ� 0���� ��ġ���� ���������� ��
							// ���� ��ü�� ���� ���� ������ �Ϻθ� ���� ���� ����
		FileWriter fww = new FileWriter(file);
		
		fww.write(ch_str);  // char �� �迭�� ã�� ������ �̷��� ����ִ� ����
		fww.close();
		
		System.out.println(file + "������ ���������� �����Ͽ����ϴ�.");
		
	}

}
