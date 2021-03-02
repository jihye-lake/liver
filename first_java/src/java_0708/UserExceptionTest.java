package java_0708;

class UserException extends Exception {  //이 상속은 사용자정의에서만 쓰게 됨
	public UserException(String str) {
		super(str);
	}
}

class CJHException extends Exception {
	public CJHException(String str) {
		super(str);
	}
}

public class UserExceptionTest {
	public static void main(String[] args)  {
		
		int a = 33;
		try {
			if(a % 5 != 0) {
				throw new UserException("5의 배수가 아닙니다.");  //예외 발생 (String 이니 Line 4로 넘어가고 거기서 super(str)로 넘어가고 상속자 Exception로 간다.
			}
		} catch (UserException e) {
			e.printStackTrace();  //어디서 에러가 발생했는지 위치를 알려주기 위해 사용(eclipse의 default 값)
			System.out.println(e.getMessage()); //그 에러 메세지가 무엇인지 알려주기 위해 사용
		}
		
		int c = 22;
		
		try {
			if(c / 22 == 1) {
			throw new CJHException("c 의 값은 22입니다.");
			}
		} catch (CJHException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			
		} finally {
			System.out.println("=============================");
		}
		
	}

}
