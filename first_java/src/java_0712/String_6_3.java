package java_0712;

public class String_6_3 {   //indexOf �Ἥ �ֹε�Ϲ�ȣ�� ���� �����ϱ�
	public static void main(String[] args) {
		
		String[] juju = {"70006221623444", "70006241563444", "71006225623444", "70006211623214", "70006234623444", "70089211623444"};
		
		char dd = ' ';
		
		for (int i = 0; i < juju.length; i++) {
			
			if (juju[i].indexOf("1",6)==6 || juju[i].indexOf("3",6)==6) { //6���� �̵��ؼ� 6��° ��ġ�� 1�� �ִ°� �´ٸ�
				System.out.println(juju[i] + " �� �������Դϴ�.");
				
			} else 
				System.out.println(juju[i] + " �� �����Դϴ�.");
			
				
			}
			
		}
		
	}
