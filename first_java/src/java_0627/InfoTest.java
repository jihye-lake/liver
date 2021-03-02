package java_0627;

class Info {
	private String name;   //  멤버 변수
	private int age;
	private char sex;
	private String phone = "010-567-9999";
	
	public Info(String n, int a, char s) {   //  생성자          이게 생성자의 overloading
		name		= n;
		age		= a;
		sex		= s;
	}
	
	public Info(String n, int a, char s, String p) {   //  생성자
		name		= n;
		age		= a;
		sex		= s;
		phone	= "010-333-7777";
		
	}
	
	public Info() {
		name		= "민주";
		age		= 88;
		sex		= 'f';
		phone	= "010-567-8977";
	}

	public void display()
	{
		System.out.println("이   름 : " + name);
		System.out.println("나   이 : " + age);
		System.out.println("성   별 : " + sex);
		System.out.println("연락처 : " + phone);
	}
}

public class InfoTest {
	
	public static void main(String[] args) {
		
		Info info0 = new Info();
		
		Info info1 = new Info("김철수", 34, 'm', "023-456-789");
		Info info2 = new Info("김영희", 34, 'f');
	
		info0.display();
		info1.display();
		info2.display();	
	}

}
