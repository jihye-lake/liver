package java_0705;

import java.io.IOException;

public class Exception_8 {
	public static void main(String[] args) {
		
		Exception_8.finally_1(); //class �� �ڱ� �ڽ��̱� ������ Exception_8�� ������ �����ϴ�
		System.out.println("finally_1() ������ ��ġ�� main() ���� ���ƿ�");
		
		//��������� �� ����� ���׹��� ������ �� Thread �� ���� �����̴�.
		
		
	}

	private static void finally_1() { //static �� ���� ���� class �� ������ ������ �����ϴ�.
		  try {
			  System.out.println("finally_1() �� ȣ��Ǿ����ϴ�.");
			  
			  //Exception aa = new Exception();
//			  IOException aa = new IOException();
//			  throw aa;
			  
			  throw new Exception("I made Error");
			  
			  //return;  //���� �������� �޼ҵ� ����
			  
		  } catch(IOException e) {
			  e.printStackTrace();
			  
		  } catch(Exception e) {
			  e.printStackTrace();
			  System.out.println(e);
			  
		  } finally {  //Error �� �ֵ��� ������ finally �� �����Ѵ�.
			  System.out.println("finally_1() �� finally ���� ����Ǿ����ϴ�.");
			  
			  //Thread �� ����?
		  }
	}

}
