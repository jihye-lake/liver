package java_0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//import java.io.*; //java.io ��Ű���� �ִ� ��� Ŭ������ input �ϰڴٴ� ����(�޸� ����� �̾��� �� ������ ����)

public class Exception_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); //�̷��԰� �ƴ϶� try-catch�� �����൵ ��
		
		while(true)
		{
			try {   //�ϳ��� try ���� ������ catch �� �� �� �ִ�(���ܴ� ���� �� �߻��� �� �ֱ� ������) - keyword �� �ҹ��ڷ�
			System.out.println("ù ��° ���� �Է��Ͻÿ�.");
			int num1 = Integer.parseInt(input.readLine());

			System.out.println("�� ��° ���� �Է��Ͻÿ�.");
			int num2 = Integer.parseInt(input.readLine());
			
				
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
			} catch(NumberFormatException e) {  //������ �¾ƾ� ����ó���� ����� �ȴ�. API ���� Ʈ���� Ȯ��.
																	//java.lang => Exception => tree ���� ���� ��������
																	//Exception �� �� �������� �;� �Ѵ�.
				System.out.println("���ڸ� �Է��Ͻÿ�.");
			
	    	} catch(Exception e) {
	 		   System.out.println("�и𿡴� 0�� �� �� �����ϴ�.");
		   }
			
			// ����/0 => �Ҵ�, 0/0 => ����
		}
		
		
	}

}
