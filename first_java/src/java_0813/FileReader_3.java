package java_0813;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader_3 {
	public static void main(String[] args) {
		try {
			// ���� ��ü ����
			File file = new File("C:\\temp_1\\Exception_1.java");
			// ��ĳ�ʷ� ���� �б�
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			// System.out.println(scan.useDelimiter("\\z").next());
		} catch (FileNotFoundException e) {
		}
	}

}
