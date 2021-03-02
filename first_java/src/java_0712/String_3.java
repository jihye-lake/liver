package java_0712;

public class String_3 {
	public static void main(String[] args) {
		
		char[] char_str = new char[15];
		
		String  str = "오늘 날씨는 참 시원합니다.";
		
		System.out.println("str 문자 : " +str);
		System.out.println("str 문자 수 : " +str.length()); //String 의 문자열의 길이를 구할 때는 length라는 메소드 사용		
		str.getChars(3, 10, char_str, 0);
		
		System.out.println("char_str 문자 : " + char_str.length); //String 의 배열의 길이를 구할 때는 length 라는 필드를 사용한다.
		
		for (int i = 0; i < char_str.length; i++) { //3부터 10앞까지니까 "날씨는 참 시" 임
			System.out.print(char_str[i]);
			
		}
	}

}
