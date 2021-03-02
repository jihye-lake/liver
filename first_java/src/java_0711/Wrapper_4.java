package java_0711;

public class Wrapper_4 {
	public static void main(String[] args) {
		
		int abc = new Integer("789").intValue();  //기본타입이 int 라는 뜻 intValue() 를 안 써도 되지만 형을 맞춰주기 위해서 써준 것 뿐
		int bcd = Integer.parseInt("678");  //int java.lang.Integer.parseInt(String s) throws NumberFormatException
		Integer cde = Integer.valueOf("567"); //Integer java.lang.Integer.valueOf(String s) throws NumberFormatException
		
		int int_1 = Integer.parseInt("100", 2); //2진수 100을 10진수인 정수로 표현하면
		int int_2 = Integer.parseInt("100", 8); //
		int int_3 = Integer.parseInt("100", 16);
//		int int_4 = Integer.parseInt("FF"); //그냥 적어주면 10진수이기 때문에 16으로 적어줘야 16진수 임을 알 수 있음
		int int_4 = Integer.parseInt("FF", 16);
		
		Integer integer_1 = Integer.valueOf("100", 2);
		Integer integer_2 = Integer.valueOf("100", 8);
		Integer integer_3 = Integer.valueOf("100", 16);
//		Integer integer_4 = Integer.valueOf("FF");
		Integer integer_4 = Integer.valueOf("FF", 16);
		
		System.out.println(abc);
		System.out.println(bcd);
		System.out.println(cde);
		
		System.out.println("\n100(2) : " + int_1);
		System.out.println("100(8) : " + int_2);
		System.out.println("100(16) : " + int_3);
		System.out.println("FF(16) : " + int_4);
		
		System.out.println("\n100(2) : " + integer_1);
		System.out.println("100(8) : " + integer_2);
		System.out.println("100(16) : " + integer_3);
		System.out.println("FF(16) : " + integer_4);
		
		
		
	}

}
