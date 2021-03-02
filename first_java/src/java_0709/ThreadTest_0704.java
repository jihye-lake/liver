package java_0709;

public class ThreadTest_0704 {
	public static void main(String[] args) {
		
		ThreadTest_3 obj_1 = new ThreadTest_3();
		ThreadTest_4 obj_2 = new ThreadTest_4();
		ThreadTest_5 obj_3 = new ThreadTest_5();
		
		obj_1.start();
		
		try {
			obj_1.join();  //join �� ���ָ� �ش� �����尡 ������ ����ĥ ������ ��ٷȴٰ� �ٸ� �����尡 ������ �Ѵٴ� ���̴�.
							   //�ٸ� �����忡 join �� ������ �ʴ´ٸ� join�� �� �� �����带 �����ϰ�� ���׹��� Thread ������ ���´�.
							   //1�� �����尡 �ƴ϶� �ٸ� �����带 join �����ַ��� 1���� ��ġ�� �ٲ��־�� �Ѵ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		obj_2.start();
		obj_3.start();
		
	}

}

class ThreadTest_3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			
		}
	}
}

class ThreadTest_4 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

class ThreadTest_5 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("%");
		}
	}
}