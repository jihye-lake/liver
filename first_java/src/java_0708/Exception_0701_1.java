package java_0708;

public class Exception_0701_1 {
	public static void main(String[] args) {
		
			method_1();
	}
	
		static void method_1() {
			
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("method_1() �޼ҵ忡�� ���� ó��!");
				e.printStackTrace();
			} finally {
				System.out.println("������� ���ɴϴ�.");
			}
		
	}

}
