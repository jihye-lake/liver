package java_0712;

public class String_9 {
	public static void main(String[] args) {
		
		String str_1 = "korea";
		String str_2 = "korea";
		
		System.out.println("String str_1 = \"korea\" ");
		System.out.println("String str_2 = \"korea\" ");
		
		System.out.println();

		
		if (str_1 == str_2) {  //주소비교
			System.out.println("str_1 == str_2 = true");			
		} else
			System.out.println("str_1 == str_2 = false");
		
		if (str_1.equals(str_2)) {  //내용비교(문자열 비교 할 때)
			System.out.println("str_1.equals(str_2) = true");
		} else 
			System.out.println("str_1.equals(str_2) = false");
		
		System.out.println();
		
		String str_3 = new String("seoul");  //만들 때마다 새로운 주소공간이 생겨남
		String str_4 = new String("seoul");
		
		System.out.println("String str_3 = \"seoul\" ");
		System.out.println("String str_4 = \"seoul\" ");
		
		System.out.println();

		
		if (str_3 == str_4) {
			System.out.println("str_3 == str_4 = true");			
		} else
			System.out.println("str_3 == str_4 = false");
		
		if (str_3.equals(str_4)) {
			System.out.println("str_3.equals(str_4) = true");
		} else 
			System.out.println("str_3.equals(str_4) = false");
		
		System.out.println();
		
	}

}
