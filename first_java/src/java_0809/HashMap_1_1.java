package java_0809;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1_1 { 	// HashMap �� Ű �ߺ���� X, Value �ߺ����O
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put("korea", 1234);  // String String, String Integer, String class �̷��� �پ��ϰ� �� �� ����
		map.put("asdf", 1111);	// String Ÿ���� �ƴ϶� Int Ÿ������ ���ļ� ������ �����
		map.put("asdf", 4567);  // �ߺ��� ������ �����Ƿ� ���� �н����� 1111�� ����� 4567�� ���
		map.put("seoul", 7890);

		Scanner ss = new Scanner(System.in);

		while (true) {
			System.out.println("id�� password�� �Է��� �ּ���!!");
			System.out.print("id : ");
			String id = ss.nextLine().trim();

			System.out.print("password : ");
//			String password = ss.nextLine().trim();  // trim �� �¿쿡 ������ ���ְڴٴ� ����
			int password = Integer.parseInt(ss.nextLine());  // String Ÿ���� �ƴ� Integer Ÿ������ ������ �̷��� �ٲٱ�
			// ���ڿ����� trim �� �ǹ̰� ����. ������ ���� �ǹ̰� �ֱ� ������ trim �� ����� �Է��� �� int �� �޵��� �ٲپ���
			
			System.out.println();
			
			if (!map.containsKey(id)) {  // map �� �Է��� ���̵� ���ԵǾ� ���� ������? ���ԵǾ� �ִٸ� else ��
				System.out.println(" �Է��Ͻ� " + id +  " �� �������� �ʽ��ϴ�. �ٽ� �Է��� �ּ���");
				continue;  // �� �ݺ����� ���� �Ʒ��� ���ٰ� ���ƿ���� ��
			} else {
				if (!((int)map.get(id) == password)) {  // Value ���� password �� ���ϰڴٴ� ��
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");					
				} else {
					System.out.println("�����մϴ�. �α��ο� �����ϼ̽��ϴ�.");
					break;  // �� �ݺ����� ������ ��
				}
			}

		}

	}

}
