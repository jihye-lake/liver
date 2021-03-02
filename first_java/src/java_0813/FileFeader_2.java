package java_0813;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileFeader_2 {
	public static void main(String[] args) {
		try {
			//���� ��ü ����
			File file = new File("C:\\temp_1\\Exception_1.java");
			//�Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			//�Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			//���پ� �б�
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);			
			}
			//.readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.
			bufReader.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
