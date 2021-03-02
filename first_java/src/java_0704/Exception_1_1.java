package java_0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//import java.io.*; //java.io ��Ű���� �ִ� ��� Ŭ������ input �ϰڴٴ� ����(�޸� ����� �̾��� �� ������ ����)

public class Exception_1_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			try {   //�ϳ��� try ���� ������ catch �� �� �� �ִ�(���ܴ� ���� �� �߻��� �� �ֱ� ������)
			System.out.println("ù ��° ���� �Է��Ͻÿ�.");
			int num1 = Integer.parseInt(input.readLine());

			System.out.println("�� ��° ���� �Է��Ͻÿ�.");
			int num2 = Integer.parseInt(input.readLine());
			
				
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
			} catch(NumberFormatException aa) {  //������ �¾ƾ� ����ó���� ����� �ȴ�. API ���� Ʈ���� Ȯ��.
																	//java.lang => Exception => tree ���� ���� ��������
																	//Exception �� �� �������� �;� �Ѵ�.
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				//aa.printStackTrace(); �� ��° ���ο��� ������ ���� �� �����ش�.
				System.out.println(aa.getMessage());
				
			} catch (ArithmeticException bb) {  //bb�� ������ �����̱� ������ � ���̵� ���� �� �ִ�
					System.out.println("�и𿡴� 0�� �� �� �����ϴ�.");
					bb.printStackTrace();  // => �� ���ָ� � ������ �߻��ϴ� �� �˷��ش�.
					System.out.println(bb.getMessage());  // =>  getMessage �� ���� ������ �������� �����ְ�
																					 //printStackTrace �� �����ؼ� �� ��ġ�� ����
			
	    	} catch(Exception e) { //��� �� �� ��� ������ ���ʿ� ������ �ǹ̰� ����.
	 		   System.out.println("�Է� �� ����");  //���ڵ� �ƴϰ�, ���ڰ� ���� ��쿡�� ������ exception �� ���� ��
	 		   
		   } finally {  //���� �����ϱ� ������ �� ���� ����
				System.out.println("������ ������� ����� ����");
			}
			
			// ����/0 => �Ҵ�, 0/0 => ����
		}
		
		
	}

}
