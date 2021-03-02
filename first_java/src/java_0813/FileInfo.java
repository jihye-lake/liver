package java_0813;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) throws IOException  {
		
		File file = new File(args[1]);  
		// �Ű����� ����� => Run configurations ���� Argument ���� ���� ũ�Ⱑ 1�̴ϱ� �ϳ� �ǳʶ� ���� �� �����ְ� 1�� ������
		// src �� �ִ� ���� ������ src/gong.au �̷��� �ϱ� �� ������ �� ������ src/java_0813/Dir.java �̷������� ���ֱ�
		
		System.out.println(args[1] + "���� �� ����  *");
		System.out.println("���� ��� : " + file.getAbsolutePath());
		System.out.println("ǥ�� ��� : " + file.getCanonicalPath());
		System.out.println("������ : " + new Date(file.lastModified()));
		System.out.println("���� ũ�� : " + file.length());
		System.out.println("�б� �Ӽ� : " + file.canRead());
		System.out.println("���� �Ӽ� : " + file.canWrite());
		System.out.println("���� ��� : " + file.getParent());
		System.out.println("���� ���2 : " + file.getPath());
		System.out.println("���� �Ӽ� : " + file.isHidden());
		System.out.println("���� : " + file.isFile());
	}

}
