package java_0704;

public class Exception_4 {
	public static void main(String[] args) {
		
		
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(34/0); //여기서 오류가 났기 때문에 4번은 수행하지 않고, catch 5로 간다.
			System.out.println(4);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(5);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(6);
		}
		
		finally {
			System.out.println("언제든지 나옵니다.");
			System.out.println(7);
			System.out.println(8);
		}
		
		
	}

}
