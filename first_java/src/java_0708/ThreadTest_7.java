package java_0708;

import javax.swing.JOptionPane;

public class ThreadTest_7 {
	public static void main(String[] args) throws Exception{
		
		MyThread_7 thread_1 = new MyThread_7();
		thread_1.start();
		
		String input = JOptionPane.showInputDialog("어쩌고저쩌고");
		System.out.println("입력한 값은 " + input + " 입니다."); //중간에 입력 가능
		
	}

}

class MyThread_7 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >0; i--) {
			
			System.out.println("\t\t" + i);
			
			try {
				sleep(1000); //이미 상속을 받았기 때문에 (위에 Thread) Thread 를 앞에 안 적어줘도 됨
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}
	}
}