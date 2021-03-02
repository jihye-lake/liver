package java_0709;

public class ThreadTest_0703 extends Thread {
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		ThreadTest_0703 obj = new ThreadTest_0703();
		
		obj.setDaemon(true);  //���� ������ : �� ������(���⼭�� main) �۾��� ���� ������ �ϴ� ������. 
										 //�� �����尡 ����Ǹ� ���� ������� ���������� �����.
									 	 //�� ������ �� �������� ���� ������ �����ϹǷ�
									   	 //�� �����尡 ����Ǹ� ���� �������� ���� ������ �������� �����̴�
										 //setDaemon(true) �� start() ȣ������ ����
										 //�۾� ������ ����Ǿ����ϴ� => �� ��� ���´�. ���ѷ����� ����
		
		obj.start();
		
		for (int i = 0; i <= 20; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println();
			}
			
			System.out.println(i);
			
			if (i == 5) {  //5�� ���� �� true�� �ٲٰ� 3�ʸ��� ������ ��
				
				autoSave = true;
				
			}
			
		}
		
		System.out.println(" ���α׷� ���� ");
		
	}
	
	@Override
	public void run() {
		
		while (true) {
			
			try {
				Thread.sleep(3*1000); //3�ʸ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (autoSave) {
				autoSave();
			}
		
		}
		
	}

	private void autoSave() {
		System.out.println("�۾� ������ ���� �Ǿ����ϴ�.");
		
	}

}
