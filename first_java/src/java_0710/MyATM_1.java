package java_0710;

class ATM_1 {
	private int total;  //금액을 담을 변수 total
	public ATM_1(int total) {
		this.total = total;
	}
	 
	synchronized void deposit(int amount, String name) {  //동시 접근을 막기 위해서 synchronized keyword 를 씀
		//synchronized 를 처리하면 -가 나오지 않음
		
		total += amount; //입금한 사람의 돈을 통장에 담겠다는 뜻
		System.out.println(name + " 님의 입금 금액 : " + amount + "원");		
	}
	
	synchronized void withdraw(int amount, String name) {
		if ((total - amount) > 0 ) { //통장에 있는 금액이 현재 출금하려는 금액보다 크다면 출금 가능
			total -= amount;
			System.out.println(name + " 님의 출금 금액 " + amount + "원");		
		}
		else {
			System.out.println(name + " 님의 잔액이 부족하여 출금할 수 없습니다.");		
		}
	}
	
	public void getTotal() {
		System.out.println("\n 현재 계좌의 금액 : " + total +"\n");
	}
}

class ATM_USER_1 extends Thread { //스레드 생성 ATM사용자
	boolean flag = false; // 입출금을 클릭 하나로 설정
	
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
		ATM_1 atm = new ATM_1(10000);  //계좌에 10000원 들어 있음

		ATM_USER_1 user1 = new ATM_USER_1(atm, "최지혜");
		ATM_USER_1 user2 = new ATM_USER_1(atm, "안윤슬");
		ATM_USER_1 user3 = new ATM_USER_1(atm, "김준희");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}


