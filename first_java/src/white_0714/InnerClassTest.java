package white_0714;

class OuterClass {
	private int value = 10;
	
	class InnerClass {
		public void myMethod() {
			System.out.println("�ܺ� Ŭ������ private ���� �� : " + value);
		}
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		
		
	}

}
