package java_0708;

public class Exception_0701_3 {
	public static void main(String[] args) {
		
		try {
			method_1();
		} catch (Exception e) {
			System.out.println("main() �޼ҵ忡�� ���� ó��!");  //System.err.println ���� ���Ƿ� ������ ǥ�����ִ� ��.
			e.printStackTrace();
		}
	}
	
		static void method_1() throws Exception{
			
//			try {
				throw new Exception();
//			} catch (Exception e) {
//				System.out.println("method_1() �޼ҵ忡�� ���� ó��!");
//				e.printStackTrace();
//			}
		
	}

}
