package java_0708;

public class Exception_0701_3 {
	public static void main(String[] args) {
		
		try {
			method_1();
		} catch (Exception e) {
			System.out.println("main() 메소드에서 예외 처리!");  //System.err.println 쓰면 고의로 에러를 표시해주는 것.
			e.printStackTrace();
		}
	}
	
		static void method_1() throws Exception{
			
//			try {
				throw new Exception();
//			} catch (Exception e) {
//				System.out.println("method_1() 메소드에서 예외 처리!");
//				e.printStackTrace();
//			}
		
	}

}
