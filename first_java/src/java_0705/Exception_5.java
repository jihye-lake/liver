package java_0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
			while(true) {
				try {
				System.out.println("ù ��° ���� �Է��Ͻÿ�.");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.println("�� ��° ���� �Է��Ͻÿ�.");
				int num2 = Integer.parseInt(input.readLine());
				
				System.out.println(num1 + "/" + num2 + "=" + (num1/num2));

//				System.out.println("�� ��° ���� �Է��Ͻÿ�.");
//				int num3 = Integer.parseInt(input.readLine());
//				
//				System.out.println(num1 + "/" + num2 + "*" + num3 + "=" + (num1/num2*num3));
				
			} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("���ڴ� �Է��� �� �����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("�и𿡴� 0�� �� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ �ֽ��ϴ�.");
		} finally {
			System.out.println("\n������ ������� ���ɴϴ�.\n");
		}
		}
	}

}
