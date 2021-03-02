package java_0809;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1_1 { 	// HashMap 은 키 중복허용 X, Value 중복허용O
	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put("korea", 1234);  // String String, String Integer, String class 이렇게 다양하게 올 수 있음
		map.put("asdf", 1111);	// String 타입이 아니라 Int 타입으로 고쳐서 나오게 만들기
		map.put("asdf", 4567);  // 중복이 허용되지 않으므로 앞의 패스워드 1111은 사라짐 4567만 허용
		map.put("seoul", 7890);

		Scanner ss = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해 주세요!!");
			System.out.print("id : ");
			String id = ss.nextLine().trim();

			System.out.print("password : ");
//			String password = ss.nextLine().trim();  // trim 은 좌우에 공백을 없애겠다는 뜻임
			int password = Integer.parseInt(ss.nextLine());  // String 타입이 아닌 Integer 타입으로 쓰려면 이렇게 바꾸기
			// 숫자에서는 trim 의 의미가 없음. 문자일 때만 의미가 있기 때문에 trim 은 지우고 입력할 때 int 만 받도록 바꾸어줌
			
			System.out.println();
			
			if (!map.containsKey(id)) {  // map 에 입력한 아이디가 포함되어 있지 않은가? 포함되어 있다면 else 로
				System.out.println(" 입력하신 " + id +  " 는 존재하지 않습니다. 다시 입력해 주세요");
				continue;  // 그 반복문의 가장 아래로 갔다가 돌아오라는 뜻
			} else {
				if (!((int)map.get(id) == password)) {  // Value 값과 password 를 비교하겠다는 뜻
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");					
				} else {
					System.out.println("축하합니다. 로그인에 성공하셨습니다.");
					break;  // 그 반복문을 벗어나라는 뜻
				}
			}

		}

	}

}
