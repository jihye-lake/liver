package java_0809;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1_3 { 	// HashMap �� Ű �ߺ���� X, Value �ߺ����O
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(1234, 0000);
		map.put(1111, 2222);
		map.put(4567, 3333);  // �ߺ��� ������ �����Ƿ� ���� �н����� 1111�� ����� 4567�� ���
		map.put(7890, 4444);

		Scanner ss = new Scanner(System.in);

		while (true) {
			System.out.println(" Enter ID and PassWord ");
			System.out.print("id : ");
			int id = Integer.parseInt(ss.nextLine());

			System.out.print("password : ");
			int password = ss.nextInt();
//			int password = Integer.parseInt(ss.nextLine());
			
			System.out.println();
			
			if (!map.containsKey(id)) {  // map �� �Է��� ���̵� ���ԵǾ� ���� ������? ���ԵǾ� �ִٸ� else ��
				System.out.println(" �Է��Ͻ� " + id +  " �� �������� �ʽ��ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				continue;
			} else {
				if (!((int)map.get(id) == password)) {  // Value ���� password �� ���ϰڴٴ� ��
//					equals �� ������̰� == �� �� ���̱� ������ int �� ���� �ǵ����̸� == ����
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				} else {
					System.out.println("�α��� �Ϸ�");
					break;
				}
			}

		}

	}

}