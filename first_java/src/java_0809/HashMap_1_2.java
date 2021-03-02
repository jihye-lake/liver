package java_0809;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1_2 { 	// HashMap �� Ű �ߺ���� X, Value �ߺ����O
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(1234, "korea");
		map.put(1111, "asdf");
		map.put(4567, "asdf");  // �ߺ��� ������ �����Ƿ� ���� �н����� 1111�� ����� 4567�� ���
		map.put(7890, "seoul");

		Scanner ss = new Scanner(System.in);

		while (true) {
			System.out.println("id�� password�� �Է��� �ּ���!!");
			System.out.print("id : ");
			int id = ss.nextInt();

			System.out.print("password : ");
			String password = ss.next().trim();  // trim �� �¿쿡 ������ ���ְڴٴ� ����
			//								nextLine �� ���� Line �� ������ ���� ����Ű�� ������ �׳� ���� �Ѿ
			
			System.out.println();
			
			if (!map.containsKey(id)) {  // map �� �Է��� ���̵� ���ԵǾ� ���� ������? ���ԵǾ� �ִٸ� else ��
				System.out.println(" �Է��Ͻ� " + id +  " �� �������� �ʽ��ϴ�. �ٽ� �Է��� �ּ���");
				continue;
			} else {
				if (!(map.get(id)).equals(password)) {  // Value ���� password �� ���ϰڴٴ� ��
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");					
				} else {
					System.out.println("�α��� �Ϸ�");
					break;
				}
			}

		}

	}

}