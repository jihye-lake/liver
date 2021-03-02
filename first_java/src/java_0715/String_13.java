package java_0715;

public class String_13 {
	
	static String str_1;
	static String str_2 = "";
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			str_1 += i;
			str_2 += i;
			
		}
		
		System.out.println("str_1 : " + str_1);  //null 이 맨 앞에 들어가게 됨 왜? 초기화를 시키지 않았기 때문에 , null 은 상수인 키워드
		System.out.println("str_2 : " + str_2);
		
		System.out.println();
		
		System.out.println("str_1 & str_2 : " + ((str_1.equals(str_2))? "같음" : "다름"));
		System.out.println("str_1 & str_2 : " + ((str_1.equalsIgnoreCase(str_2))? "같음" : "다름"));
		//만약 str_1 변수를 초기화 시키거나, str_2 변수를 초기화 시키지 않으면 같음이 나오게 됨
		
	}

}
