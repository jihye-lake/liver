package java_0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exception_9_1 {
	public static void main(String[] args) throws NumberFormatException,ArithmeticException,IOException {
		
		//try {
		input();
		
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("�и� 0�� �� �� �����ϴ�.");
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("����� ������ �ֽ��ϴ�.");
//			
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("���ڰ� �ʿ��մϴ�.");
//		}
		}
		
		static void input() throws ArithmeticException,IOException,NumberFormatException {
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.print("ù ��° ���� �Է��Ͻÿ�.");
				int num1 = Integer.parseInt(input.readLine());
				
				System.out.print("�� ��° ���� �Է��Ͻÿ�.");
				int num2 = Integer.parseInt(input.readLine());
				
				dividing(num1,num2);
			}
		}
		
		static void  dividing(int num1, int num2) throws ArithmeticException {
			
			System.out.println("��� : " + num1 + "/" + num2 + "=" + (num1/num2));
		}
		
	}
