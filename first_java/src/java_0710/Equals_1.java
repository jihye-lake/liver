package java_0710;

class Kbs {
	int number;
	
	public Kbs(int num) {
		
		number = num;
		
	}
}

public class Equals_1 {
	public static void main(String[] args) {
		
		Kbs obj_1 = new Kbs(10);
		Kbs obj_2 = new Kbs(10);
		
		if (obj_1.equals(obj_2)) {  //new �� ��� ������ �ٸ� ������ ��������Ƿ� �ּҰ� �޶���
			System.out.println("obj_1 �� obj_2 �� ����.");
			
		} else
			System.out.println("obj_1 �� obj_2 �� �ٸ���.");
		
		System.out.println("$$" + obj_1.hashCode());  //�ؽ��ڵ�� ���� ���� �ȴ�
		System.out.println("$$" + obj_2.hashCode());
		
		obj_2 = obj_1;  //�����ϰ� �ǹǷ� ���� ���� ����Ű�� �ǰ�, ���� ������
		
		if (obj_1.equals(obj_2)) {
			System.out.println("obj_1 �� obj_2 �� ����.");
			
		} else
			System.out.println("obj_1 �� obj_2 �� �ٸ���.");
		
		System.out.println("&&" + obj_1.hashCode());
		System.out.println("&&" + obj_2.hashCode());
		}
		
	}

