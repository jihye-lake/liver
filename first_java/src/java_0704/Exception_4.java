package java_0704;

public class Exception_4 {
	public static void main(String[] args) {
		
		
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(34/0); //���⼭ ������ ���� ������ 4���� �������� �ʰ�, catch 5�� ����.
			System.out.println(4);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(5);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(6);
		}
		
		finally {
			System.out.println("�������� ���ɴϴ�.");
			System.out.println(7);
			System.out.println(8);
		}
		
		
	}

}
