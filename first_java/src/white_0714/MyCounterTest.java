package white_0714;

class MyCounter {
	int counter;
	
	MyCounter() {
		counter = 1;
	}
}

public class MyCounterTest {
	public static void main(String[] args) {
		
		MyCounter obj1 = new MyCounter();
		MyCounter obj2 = new MyCounter();
		
		System.out.println("��ü 1�� counter = " + obj1.counter);
		System.out.println("��ü 2�� counter = " + obj2.counter);
		
		
	}

}
