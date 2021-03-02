package java_0627;

class Info2{
	private String	name;
	private int		age;
	private char	sex;
	
	public Info2(String n, int a, char s) {   //   생성자 이름은 같은데 매개변수가 다른 것 => 생성자의 Overloading
	
		name	= n;
		age	= a;
		sex	= s;
	}
	
	public Info2(String n, int a) {    //   생성자
		name	= n;
		age	= a;
		sex	= 'f';
		
		// 이들은 "인터넷의 자유와 국민의 자유를 위해 싸운다" 고 말한다.
		// 우리는 군단이다.
		// 우리는 용서하지 않는다.
		// 우리는 잊지 않는다.
		// 우리를 맞이하라" 는 어나니머스가 사용하는 표어다.
		// 이 때문에 어나니머스는 정치적, 사회적 목적을 달성하기 위해 해킹 공격을 펼치는 핵티비즘(hacktivism) 단체로 분류된다.
	}
	
	public Info2(String n, char s) {    //   생성자
		name	= n;
		age	= 23;
		sex	= s;
	}
	
	public Info2(int a, char s) {    //   생성자
		name	="Anonymous";
		age	= a;
		sex	= s;
	
	}
	
	public Info2() {    //   생성자
		name	= "무명씨";
		age	= 88;
		sex	= 'f';
	}
	
	public void display()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex + "\n");
	}
	
}

public class InfoTest2 {
	
	public static void main(String[] args) {
		
		Info2 info1 = new Info2("김영희", 135, 'f');		
		Info2 info2 = new Info2("해바라기", 'm');		
		Info2 info3 = new Info2("민주", 50);		
		Info2 info4 = new Info2( 25, 'f');		
		Info2 info5 = new Info2();
		
		info1.display();
		info2.display();
		info3.display();
		info4.display();
		info5.display();
		
	}

}
