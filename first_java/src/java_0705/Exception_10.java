package java_0705;

public class Exception_10 {
	public static void main(String[] args) throws Exception {  //throws 의 역할 : 에러 상위라인으로 떠넘기기
		
			exceptionRun11();  // try catch Block 으로 감싸거나 throws Exception 으로 상위로 떠넘기기가 가능하다

	}

	private static void exceptionRun11() throws Exception {  //여기에 throws 를 쓰면서 상위에 에러가 떠넘겨졌는데 그 에러를 어떻게 할 것인지 결정하라고 에러가 뜸
		
		exceptionTest();  // 위에서 throws 로 다시 에러를 넘기기 때문에 7번에서 에러가 뜸
		
	}

	private static void exceptionTest() throws Exception { //에러 떠넘겨서 16번 으로 보내고
	
		throw new Exception("내가 만든 Errorrrrrrrrr");
	}

}
