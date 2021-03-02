package java_0809;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1_2 { 	// HashMap 은 키 중복허용 X, Value 중복허용O
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(1234, "korea");
		map.put(1111, "asdf");
		map.put(4567, "asdf");  // 중복이 허용되지 않으므로 앞의 패스워드 1111은 사라짐 4567만 허용
		map.put(7890, "seoul");

		Scanner ss = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해 주세요!!");
			System.out.print("id : ");
			int id = ss.nextInt();

			System.out.print("password : ");
			String password = ss.next().trim();  // trim 은 좌우에 공백을 없애겠다는 뜻임
			//								nextLine 을 쓰면 Line 에 개행이 들어가서 엔터키를 받으면 그냥 줄이 넘어감
			
			System.out.println();
			
			if (!map.containsKey(id)) {  // map 에 입력한 아이디가 포함되어 있지 않은가? 포함되어 있다면 else 로
				System.out.println(" 입력하신 " + id +  " 는 존재하지 않습니다. 다시 입력해 주세요");
				continue;
			} else {
				if (!(map.get(id)).equals(password)) {  // Value 값과 password 를 비교하겠다는 뜻
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");					
				} else {
					System.out.println("로그인 완료");
					break;
				}
			}

		}

	}

}