package java_0812;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		String a;
		char ch;

		System.out.print("���� �� ���� �Է��Ͻÿ�. >>");
		Scanner input = new Scanner(System.in);
		a = input.next();

		ch = a.trim().charAt(0);

		if ((65 <= (int) ch && (int) ch <= 90) || (97 <= (int) ch && (int) ch <= 122)) {

			System.out.println("���ĺ��̴�.");

		}
	}

}
