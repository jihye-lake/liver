package java_0710;

class King extends Object { //��� class �ȿ��� ��ӵ� object �� �����Ǿ� �ִ�.
	String kbs;
	
	public King() {  //������ King
		
	}

	public King(String kbs) {  //Alt+Shift+S -> Generate Constructor using fields
		this.kbs = kbs;
	}
	
	public String toString() {   //���� Object �ȿ��� toString�� ������ �̷��� �� �����ָ� Overriding �� ���ִ� ��
		return "���ѹα� ����";
	}
	
}

public class Object_1 {
	public static void main(String[] args) {
		
		King obj = new King();
		
		System.out.println("Ŭ���� �̸�	: " + obj.getClass()); //�ּҰ��� ���� �� ���� ��ü��� ���̴�
		                                   //�׷��� ������ �ؽ��ڵ尡 ���ٴ� �� �� �ּҰ� ���� ���� �Ǻ��Ѵٴ� ���̴�
		System.out.println("�ؽ�    �ڵ�	: " + obj.hashCode()); //��ü�� ������� ���� �ּ�(�ؽ� �Լ��� ���ļ� ���� ���ڵ�)
		System.out.println("��ü ���ڿ�	: " + obj.toString()); //��ü�� ������� ���� �ּҸ� 16������ ��Ÿ��
		System.out.println("��ü ���ڿ�	: " + obj); //��ü�� ����������� ��Ű���� / Ŭ������ / ��ġ �̷��� ����
		
	}

}
