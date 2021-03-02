package java_0710;

class ATM_2 {
	private int total;  //금액을 담을 변수 total
	public ATM_2(int total) {
		this.total = total;
	}
	
	void deposit(int amount, String name) {
		
		total += amount; //입금한 사람의 돈을 통장에 담겠다는 뜻
		System.out.println(name + " 님의 입금 금액 : " + amount + "원");		
	}
	
	void withdraw(int amount, String name) {
		if ((total - amount) > 0 ) { //통장에 있는 금액이 현재 출금하려는 금액보다 크다면 출금 가능
			total -= amount;
			System.out.println(name + " 님의 출금 금액 " + amount + "원");		
		}
		else {
			System.out.println(name + " 님의 잔액이 부족하여 출금할 수 없습니다.\n");		
		}
	}
	
	public void getTotal() {
		System.out.println("\n 현재 계좌의 금액 : " + total +"\n");
	}
}

class ATM_USER_2 extends Thread { //스레드 생성 ATM사용자
	boolean flag = false; // 입출금을 클릭 하나로 설정
	
	ATM_2 obj;
	
	public ATM_USER_2(ATM_2 obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
					sleep(1000);  //1초 간격으로 입출금을 반복한다.
								
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		synchronized(obj){
			
		if(flag) { //flag 는 switch 의 개념
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
		ATM_2 atm = new ATM_2(10000);  //10000원이 들어있는 계좌가 생성됨

		ATM_USER_2 user1 = new ATM_USER_2(atm, "최지혜");
		ATM_USER_2 user2 = new ATM_USER_2(atm, "안윤슬"); //계좌를 세 사람이 공유함
		ATM_USER_2 user3 = new ATM_USER_2(atm, "김준희");
		
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}



