package java_0809;

import javax.swing.*;

public class Rensyu 
{
	public static void main(String[] args) 
	{

		int answer = (int)(Math.random() * 100) +1;  //  1 ���� 100���� ���´�. �������� ������ 0���� 99���� ����

		int input = 0;
		String temp = "";
		int count = 0;
		
		do
		{
			// count ++;  //  ���⼭ ī��Ʈ�� �����ְ� ����. ���ڸ� ���߰� ���� �� �ؿ� �õ� Ƚ���� count ���� ���� ��.
			temp = JOptionPane.showInputDialog(" 1 ~ 100 ������ ���ڸ� �Է��Ͻÿ�. " + "�������� -1�� �Է��Ͻÿ�." );  
			//  �����Ǵ� ����. �̰� '�Է�' ���� ������. �̰� ����� ���ؼ� ���� import �� ���� ��

			if (temp == null || temp.equals("-1"))  //  null �̳� -1�� ������ ������� ��.
			{
				break;  // ���Ϲ����� ������ ��.
			}
			
			System.out.println("�Է� �� : " + temp);

			input = Integer.parseInt(temp);

			count++;

			if (answer > input)
			{
				System.out.println(" �� ū ���� �Է��Ͻÿ�. ");
			}

			else if (answer < input) {
				System.out.println(" �� ���� ���� �Է��Ͻÿ�. ");

			}

			else {
				System.out.println(" ���߾����ϴ�. ");
				System.out.println(" �õ� Ƚ���� " + count + "�� �Դϴ�. ");
				break;
			}

		}
		while (true);

		System.out.println("Hello World!");
	}
}

