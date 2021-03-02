package java_0712;

public class String_5 {
	public static void main(String[] args) {
		
		String str = "나는 초보다! 자바 별 거 아니네!";
		
		boolean flag = str.startsWith("나는 고수다!");
		// startsWith 은 이 문자열이 지정된 접미어로 끝나는 지 아닌지 테스트한다.
		System.out.println(flag);
		
		flag = str.startsWith("나는");
		System.out.println(flag);
			
		flag = str.endsWith("별거 아니네.");
		System.out.println(flag);
		
		flag = str.endsWith("별 거 아니네!");
		System.out.println(flag);
		
		//String 으로 글자 판별 가능
		
		
	}

}
