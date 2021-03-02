package java_0627;

class Info2{
	private String	name;
	private int		age;
	private char	sex;
	
	public Info2(String n, int a, char s) {   //   ������ �̸��� ������ �Ű������� �ٸ� �� => �������� Overloading
	
		name	= n;
		age	= a;
		sex	= s;
	}
	
	public Info2(String n, int a) {    //   ������
		name	= n;
		age	= a;
		sex	= 'f';
		
		// �̵��� "���ͳ��� ������ ������ ������ ���� �ο��" �� ���Ѵ�.
		// �츮�� �����̴�.
		// �츮�� �뼭���� �ʴ´�.
		// �츮�� ���� �ʴ´�.
		// �츮�� �����϶�" �� ��ϸӽ��� ����ϴ� ǥ���.
		// �� ������ ��ϸӽ��� ��ġ��, ��ȸ�� ������ �޼��ϱ� ���� ��ŷ ������ ��ġ�� ��Ƽ����(hacktivism) ��ü�� �з��ȴ�.
	}
	
	public Info2(String n, char s) {    //   ������
		name	= n;
		age	= 23;
		sex	= s;
	}
	
	public Info2(int a, char s) {    //   ������
		name	="Anonymous";
		age	= a;
		sex	= s;
	
	}
	
	public Info2() {    //   ������
		name	= "����";
		age	= 88;
		sex	= 'f';
	}
	
	public void display()
	{
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex + "\n");
	}
	
}

public class InfoTest2 {
	
	public static void main(String[] args) {
		
		Info2 info1 = new Info2("�迵��", 135, 'f');		
		Info2 info2 = new Info2("�عٶ��", 'm');		
		Info2 info3 = new Info2("����", 50);		
		Info2 info4 = new Info2( 25, 'f');		
		Info2 info5 = new Info2();
		
		info1.display();
		info2.display();
		info3.display();
		info4.display();
		info5.display();
		
	}

}
