package java_0708;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class FileException_1 {
	public static void main(String[] args) {
		
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("error_1.log",false); //true ���� ��� ��� ����(�߰�)�ǰ�, false ���� override. ��, ����Ⱑ �ȴ�
					 //error_1.log ���Ͽ� ����� �غ�
			ps = new PrintStream(fos);
					//error �� ����� ȭ���� �ƴ� error_1.LOG ���Ϸ�  ����
			System.setErr(ps); //�⺻����� ȭ���� �ƴ϶� ���Ϸ� �Ѱܼ� ������ �ϰڴٴ� ��.
			System.setOut(ps); //���Ϸ� �Ѱܼ� ������ �ϴ� �� ������, ������ �ƴ϶� �� ������ ���´�.
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); //���ܹ߻�
			System.out.println(4);
			
		} catch (Exception e) {
			System.out.println(5);
			
			System.err.println("=========================================");
			System.err.println("���ܹ߻� �ð� : " + new Date());  //���� �ð�
			e.printStackTrace();
			System.err.println("���ܸ޽��� : " + e.getMessage());
			System.err.println("=========================================");
		} 
		System.out.println(6);
	}

}
