package java_0704;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
	public static void main(String[] args) {
		
		
		while(true) {
			try {
				Scanner input = new Scanner(System.in);  //Scanner �� BufferedReader ó�� �Է��ؾ� ������ 
				// throws Exception �� ���� �ʿ䰡 ����. ��ü������ ����� ���� �־.
				
			System.out.println("ù ��° ���� �Է��Ͻÿ�.");
			int num1 = input.nextInt();
	
			System.out.println("�� ��° ���� �Է��Ͻÿ�.");
			int num2 = input.nextInt();
			
			System.out.println(" ��� : " +num1+ " / " +num2+ "=" +(num1/num2));
			
			} catch(InputMismatchException e) {
				System.out.println("���ڴ� �Է��� �� �����ϴ�.");
				
			} catch(ArithmeticException e) {
				System.out.println("�и𿡴� 0�� �Է��� �� �����ϴ�.");
				
			} catch(Exception e) {
				System.out.println("�Է� �� ����");
			}
			
			finally {
				System.out.println("\n�������� ���� ���Դϴ�.\n");
			}
			
			
		}
				
	}

}
