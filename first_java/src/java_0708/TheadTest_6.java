package java_0708;

import javax.swing.JOptionPane;

public class TheadTest_6 {
	public static void main(String[] args) {
		
		String input =JOptionPane.showInputDialog("�ƹ����̳� �Է�");
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
		
		for(int i = 10; i >0; i--) {
			System.out.println("\n\n" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
