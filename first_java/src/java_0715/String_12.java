package java_0715;

public class String_12 {
	public static void main(String[] args) {
		
		String str_1 = "JAVA";
		String str_2 = "java";
		
		System.out.println("문자열1 : " + str_1);
		System.out.println("문자열2 : " + str_2);
		
		//3항 연산자 : 맞으면 물음표 뒤에, 틀리면 콜론 뒤의 것을 가져옴
		System.out.println("JAVA & java : " + ((str_1.equals(str_2))? "동일임" : "틀림"));  //내용비교
		System.out.println("JAVA & java : " + ((str_1.equalsIgnoreCase(str_2))? "동일임" : "틀림"));  //대소문자 구별없이 단어만 비교
		
	}

}
