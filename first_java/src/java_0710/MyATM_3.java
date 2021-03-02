package java_0710;

class ATM_3 {
	private int total;
	public ATM_3(int total) {
		this.total = total;
	}
	
	void deposit(int amount, String name) {
		
		total += amount;
		System.out.println(name + " ���� �Ա� �ݾ� : " + amount + "��");
	}
	
	void withdraw(int amount, String name) {
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + " ���� ��� �ݾ�" + amount + "��");
		}
		else {
			System.out.println(name + " ���� �ܾ��� �����Ͽ� ����� �� �����ϴ�.");
		}
	}
	
	public void getTotal() {
		System.out.println("\n ���� ������ �ݾ� : " + total + "\n");
	}
}

class ATM_USER_3 extends Thread {
	boolean flag = false;
	
	ATM_3 obj;
	
	public ATM_USER_3(ATM_3 obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				
				sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (flag) {
				obj.deposit((int)(Math.random()*10000), getName());
				obj.getTotal();
			}
			else {
				obj.withdraw((int)(Math.random()*10000), getName());
				obj.getTotal();
			}
			flag = !flag;
		}
	}
}

public class MyATM_3 {
	public static void main(String[] args) {
		ATM_3 atm = new ATM_3(10000);
		
		ATM_USER_3 user1 = new ATM_USER_3(atm, "������");
		ATM_USER_3 user2 = new ATM_USER_3(atm, "������");
		ATM_USER_3 user3 = new ATM_USER_3(atm, "������");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}
