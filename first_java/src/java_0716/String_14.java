package java_0716;

public class String_14 {
	public static void main(String[] args) {
		
		char[] cc_array = new char[3];  //배열설정 = 0
		
		String str = new String(cc_array);
		
		System.out.println("cc_array.length : " + cc_array.length);  //length 필드
		System.out.println("str.length : " + str.length());  //length 메소드
		System.out.println("$$$$$" + str  + "*****"); //배열을 0이 아닌 다른 것으로 설정해주면 str 에 그만큼 공백이 생긴다
	}

}
