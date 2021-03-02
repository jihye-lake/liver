package java_0710;

class ATM_1 {
	private int total;  //�ݾ��� ���� ���� total
	public ATM_1(int total) {
		this.total = total;
	}
	 
	synchronized void deposit(int amount, String name) {  //���� ������ ���� ���ؼ� synchronized keyword �� ��
		//synchronized �� ó���ϸ� -�� ������ ����
		
		total += amount; //�Ա��� ����� ���� ���忡 ��ڴٴ� ��
		System.out.println(name + " ���� �Ա� �ݾ� : " + amount + "��");		
	}
	
	synchronized void withdraw(int amount, String name) {
		if ((total - amount) > 0 ) { //���忡 �ִ� �ݾ��� ���� ����Ϸ��� �ݾ׺��� ũ�ٸ� ��� ����
			total -= amount;
			System.out.println(name + " ���� ��� �ݾ� " + amount + "��");		
		}
		else {
			System.out.println(name + " ���� �ܾ��� �����Ͽ� ����� �� �����ϴ�.");		
		}
	}
	
	public void getTotal() {
		System.out.println("\n ���� ������ �ݾ� : " + total +"\n");
	}
}

class ATM_USER_1 extends Thread { //������ ���� ATM�����
	boolean flag = false; // ������� Ŭ�� �ϳ��� ����
	
	ATM_1 obj;
	
	public ATM_USER_1(ATM_1 obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
					sleep(1000);
								
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		if(flag) {
			obj.deposit((int)(Math.random()*10000), getName());
			obj.getTotal();
		}
		else {
			obj.withdraw((int)(Math.random()*10000),getName());
			obj.getTotal();
		}
		
		flag = !flag;
	}
}
}
public class MyATM_1 {
	public static void main(String[] args) {
		ATM_1 atm = new ATM_1(10000);  //���¿� 10000�� ��� ����

		ATM_USER_1 user1 = new ATM_USER_1(atm, "������");
		ATM_USER_1 user2 = new ATM_USER_1(atm, "������");
		ATM_USER_1 user3 = new ATM_USER_1(atm, "������");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}


