package java_0712;

public class String_7 {
	public static void main(String[] args) {
		
		String str = "몇 개의 단어가 포함되어 있나요!";
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==' ') {  // ' ' 사이에 스페이스바 하나 주기 Space Bar = 32 ASCII Code 의 공백은 32번이다
				count ++;
				
			}
			
		}
		
		System.out.println("단어의 개수 : " + (count + 1) + " 개");  //여기서의 단어는 글자가 붙어있는 기준
		
	}

}
