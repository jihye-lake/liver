package java_0708;

import javax.swing.JOptionPane;

public class ThreadTest_7 {
	public static void main(String[] args) throws Exception{
		
		MyThread_7 thread_1 = new MyThread_7();
		thread_1.start();
		
		String input = JOptionPane.showInputDialog("��¼����¼��");
		System.out.println("�Է��� ���� " + input + " �Դϴ�."); //�߰��� �Է� ����
		
	}

}

class MyThread_7 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >0; i--) {
			
			System.out.println("\t\t" + i);
			
			try {
				sleep(1000); //�̹� ����� �޾ұ� ������ (���� Thread) Thread �� �տ� �� �����൵ ��
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
	}
}