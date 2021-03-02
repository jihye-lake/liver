package java_0710;

class ATM {
	private int total;  //�ݾ��� ���� ���� total
	public ATM(int total) {
		this.total = total;
	}
	
	void deposit(int amount, String name) {
		
		total += amount; //�Ա��� ����� ���� ���忡 ��ڴٴ� ��
		System.out.println(name + " ���� �Ա� �ݾ� : " + amount + "��");		
	}
	
	void withdraw(int amount, String name) {
		if ((total - amount) > 0 ) { //���忡 �ִ� �ݾ��� ���� ����Ϸ��� �ݾ׺��� ũ�ٸ� ��� ����
			total -= amount;
			System.out.println(name + " ���� ��� �ݾ� " + amount + "��");		
		}
		else {
			System.out.println(name + " ���� �ܾ��� �����Ͽ� ����� �� �����ϴ�.\n");		
		}
	}
	
	public void getTotal() {
		System.out.println("\n ���� ������ �ݾ� : " + total +"\n");
	}
}

class ATM_USER extends Thread { //������ ���� ATM�����
	boolean flag = false; // ������� Ŭ�� �ϳ��� ����
	
	ATM obj;
	
	public ATM_USER(ATM obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
					sleep(1000);  //1�� �������� ������� �ݺ��Ѵ�.
								
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
public class MyATM {
	public static void main(String[] args) {
		ATM atm = new ATM(10000);  //10000���� ����ִ� ���°� ������

		ATM_USER user1 = new ATM_USER(atm, "������");
		ATM_USER user2 = new ATM_USER(atm, "������"); //���¸� �� ����� ������
		ATM_USER user3 = new ATM_USER(atm, "������");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}
