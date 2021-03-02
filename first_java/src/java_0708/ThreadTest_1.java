package java_0708;

class MyThread extends Thread { //Thread ��ӹ��� MyThread

	public void run() {
		
		
		try {
		for(int i = 0; i <20 ; i++) {
			
				Thread.sleep(1000);  //�������� ��밡���� �޼ҵ�(����ó�� InterruptedException ���ֱ�)
											 //1�ʿ� �ѹ��� 20���� ���ϱ�
				System.out.println(" " + i + "�� : " + i + "*" + i + "=" + (i*i));
		}	
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}


public class ThreadTest_1 {
	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start(); //run �� ���۵ȴٴ� �� start ��� run�� ���� Thread �� �ƴ�.
		
	}

}
