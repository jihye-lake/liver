package java_0627;

class Info {
	private String name;   //  ��� ����
	private int age;
	private char sex;
	private String phone = "010-567-9999";
	
	public Info(String n, int a, char s) {   //  ������          �̰� �������� overloading
		name		= n;
		age		= a;
		sex		= s;
	}
	
	public Info(String n, int a, char s, String p) {   //  ������
		name		= n;
		age		= a;
		sex		= s;
		phone	= "010-333-7777";
		
	}
	
	public Info() {
		name		= "����";
		age		= 88;
		sex		= 'f';
		phone	= "010-567-8977";
	}

	public void display()
	{
		System.out.println("��   �� : " + name);
		System.out.println("��   �� : " + age);
		System.out.println("��   �� : " + sex);
		System.out.println("����ó : " + phone);
	}
}

public class InfoTest {
	
	public static void main(String[] args) {
		
		Info info0 = new Info();
		
		Info info1 = new Info("��ö��", 34, 'm', "023-456-789");
		Info info2 = new Info("�迵��", 34, 'f');
	
		info0.display();
		info1.display();
		info2.display();	
	}

}
