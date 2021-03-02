package java_0712;

public class String_4 {
	public static void main(String[] args) {
		
		int i;
		
		String str = "2019 WorldCup Korea";
		
		System.out.println("정상 문자열 : " + str);
		System.out.print("문자열 뒤집기 : ");
		
		for (int j = str.length()-1; j >= 0; j--) {  //index 는 0번부터 시작하니까 마지막에 -1 해주기
			
			System.out.print(str.charAt(j));	 //charAt 중요한 메소드임!0
		}
		
		System.out.print("\n 짝수 문자열 : ");
		
		for (int j = 0; j < str.length(); j++) {
			
			if (j % 2 != 0) {  // != 판정이 더 정확하게 나오기 때문에 많이 쓴다.
				
				System.out.print(str.charAt(j));
				
			} else {
				System.out.print(" ");
				
			}
			
		}
		
	}

}
