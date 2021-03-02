package java_0628;

class This_2 {
	String name;
	int age;
	char sex;
	
	public This_2(String name, int age, char sex) {  //  지역변수가 우선순위가 더 높으므로 this 를 붙여서 명시해 줘야함
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public This_2() { 
		// System.out.println("둥그런 감자");  //  *생성자 안에서 또 다른 생성자는 먼저 호출되어야 함*(syso는 아래에)
		this("해바라기	", 22, 'm');  //  여기서 this 는 매개변수 세 개짜리 자기 자신을 호출한다는 뜻
		System.out.println("둥그런 감자");
	}
	
	public This_2(String name, int age) {
		this(name, age, 'f');
	}
	
	public This_2(String name, char sex) {
		this(name, 85, sex);
	}
	
	public This_2(int age, char sex) {  //  생성자에서 생성자 호출은 반드시 첫번째 줄(왜? 객체가 먼저 생성되어야 하기 때문)
		// System.out.println("초원의 말들");
		this("들 국 화	", age, sex);
		System.out.println("초원의 말들");
	}
	
	public void display() {
		System.out.println("이름은 : " +name+ " | 나이는 : " +age+ " | 성별은 : " +sex );
	}
}

public class ThisTest_2 {
	
	public static void main(String[] args) {
		
		This_2 obj_1 = new This_2();
		This_2 obj_2 = new This_2("민     주	", 25);
		This_2 obj_3 = new This_2("진     영	", 'f');
		This_2 obj_4 = new This_2(20, 'm');
		This_2 obj_5 = new This_2("사     랑	", 17, 'm');
		This_2 obj_6 = new This_2("순     애	", 20, 'm');
		
		obj_1.display();
		obj_2.display();
		obj_3.display();
		obj_4.display();
		obj_5.display();
		obj_6.display();
		
		
	}

}
