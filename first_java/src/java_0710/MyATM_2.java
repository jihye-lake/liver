package java_0710;

class ATM_2 {
	private int total;  //�ݾ��� ���� ���� total
	public ATM_2(int total) {
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

class ATM_USER_2 extends Thread { //������ ���� ATM�����
	boolean flag = false; // ������� Ŭ�� �ϳ��� ����
	
	ATM_2 obj;
	
	public ATM_USER_2(ATM_2 obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
					sleep(1000);  //1�� �������� ������� �ݺ��Ѵ�.
								
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		synchronized(obj){
			
		if(flag) { //flag �� switch �� ����
			obj.deposit((int)(Math.random()*10000), getName());
			obj.getTotal();
		}
		else {
			obj.withdraw((int)(Math.random()*10000),getName());
			obj.getTotal();
		}
			}
		
		flag = !flag;
	}
}
}
public class MyATM_2 {
	public static void main(String[] args) {
		ATM_2 atm = new ATM_2(10000);  //10000���� ����ִ� ���°� ������

		ATM_USER_2 user1 = new ATM_USER_2(atm, "������");
		ATM_USER_2 user2 = new ATM_USER_2(atm, "������"); //���¸� �� ����� ������
		ATM_USER_2 user3 = new ATM_USER_2(atm, "������");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}



