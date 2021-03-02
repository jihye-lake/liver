package java_0809;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1_3 { 	// HashMap 은 키 중복허용 X, Value 중복허용O
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(1234, 0000);
		map.put(1111, 2222);
		map.put(4567, 3333);  // 중복이 허용되지 않으므로 앞의 패스워드 1111은 사라짐 4567만 허용
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
			
			if (!map.containsKey(id)) {  // map 에 입력한 아이디가 포함되어 있지 않은가? 포함되어 있다면 else 로
				System.out.println(" 입력하신 " + id +  " 는 존재하지 않습니다. 다시 입력해 주십시오.");
				continue;
			} else {
				if (!((int)map.get(id) == password)) {  // Value 값과 password 를 비교하겠다는 뜻
//					equals 는 내용비교이고 == 은 값 비교이기 때문에 int 일 때는 되도록이면 == 쓰기
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주십시오.");
				} else {
					System.out.println("로그인 완료");
					break;
				}
			}

		}

	}

}