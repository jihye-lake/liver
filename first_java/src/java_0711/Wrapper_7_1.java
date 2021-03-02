package java_0711;

public class Wrapper_7_1 {
	public static void main(String[] args) {
		
		char[] obj = new char[args[0].length()+5];
		
		args[0].getChars(0, args[0].length(), obj, 5); 
																// 여기에 숫자를 넣으면 넣은만큼 공백이 생기고(건너뛰고) 그 다음부터 나오게 된다
		//args[0] 에 있는 String 중에서 하나의 글자를 가져와라 어디까지? 0번부터 끝까지
		//그 다음에 obj 에 0번부터 집어넣어라
		//들어있는 문자열에서 글자를 하나씩 빼서 쓸 때 사용함
		
		for (int i = 0; i < obj.length; i++) { //0번부터 13번까지 돈다
			
			System.out.println("\t 입력된 문자 : [" + obj[i] + "]");
			
			if (Character.isDefined(obj[i])) {
				System.out.println("\t 유니코드 입니다.");
				}
			
			if (Character.isLetter(obj[i])) {
				System.out.println("\t 문자 입니다.");
			}
			
			if (Character.isDigit(obj[i])) {
				System.out.println("\t 수수숫자 입니다.");
			}
			
			
		}
	}

}