package java_0710;

class ATM_3 {
	private int total;
	public ATM_3(int total) {
		this.total = total;
	}
	
	void deposit(int amount, String name) {
		
		total += amount;
		System.out.println(name + " 님의 입금 금액 : " + amount + "원");
	}
	
	void withdraw(int amount, String name) {
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + " 님의 출금 금액" + amount + "원");
		}
		else {
			System.out.println(name + " 님의 잔액이 부족하여 출금할 수 없습니다.");
		}
	}
	
	public void getTotal() {
		System.out.println("\n 현재 계좌의 금액 : " + total + "\n");
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
		
		ATM_USER_3 user1 = new ATM_USER_3(atm, "도혜림");
		ATM_USER_3 user2 = new ATM_USER_3(atm, "한유진");
		ATM_USER_3 user3 = new ATM_USER_3(atm, "김진영");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}
