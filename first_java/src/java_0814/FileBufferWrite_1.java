package java_0814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileBufferWrite_1 {
	public static void main(String[] args) throws Exception {
		
		String file, str;
		Date date = new Date();
		
		str = "���� ���� �ð� : \n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �̸� : " );
		file = read.readLine();
		
		System.out.println("������ ���ڿ� �Է�");
		str += read.readLine();
		
		FileWriter fww = new FileWriter(file);
		BufferedWriter bww = new BufferedWriter(fww);
		
		bww.write(str);
		bww.close();
		System.out.println(file + "���������� ����Ǿ����ϴ�.");
		
	}

}
