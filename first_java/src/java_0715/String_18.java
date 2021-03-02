package java_0715;

public class String_18 {
	public static void main(String[] args) {
		
		String str_1 = new String();
		String str_2 = new String("KOREA");
		
		java.util.Date  today = new java.util.Date();  //import 안 하고 그냥 이렇게 적어줘도 됨
		//KST = Korea Standard 의 약자
		
		
		System.out.println(str_1);
		System.out.println(str_1.toString());
				
		System.out.println(str_2);
		System.out.println(str_2.toString());

		System.out.println(today);
		System.out.println(today.toString());

	}

}
