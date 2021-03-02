package java_0705;

public class Exception_10_1 {
	public static void main(String[] args) {
		
		try {
			exceptionRun11();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	static void exceptionRun11() throws Exception {
		
		exceptionTest();
	}
	
	static void exceptionTest() throws Exception {
		
		exceptionTest22();
	}
		
		static void exceptionTest22() throws Exception {
		
		throw new Exception("내가 만든 두 번째 Errorrrrrrr");
	}

}
