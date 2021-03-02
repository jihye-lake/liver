package java_0712;

public class String_10 {
	public static void main(String[] args) {
		
		String str_1 = "AAA";
		String str_2 = new String("AAA");
		
		if (str_1 == str_2) {
			System.out.println("str_1 == str_2 = true");			
		} else
			System.out.println("str_1 == str_2 = false");
		
		System.out.println();
		System.out.println("str_1 : " + System.identityHashCode(str_1)); //�ؽ��ڵ� �� �ҷ�����
		System.out.println("str_2 : " + System.identityHashCode(str_2));
		
		str_2 = str_2.intern();
		//Intern() �޼ҵ��, ���Ӱ� ������� String ��ü�� ���ȭ �����ݴϴ�.
		//������� String ��ü�� �̹� ����� ������� ���ڿ��̶��,
		//���� ������� ���� ������, ����� ����Ű�� �մϴ�.
		//��, Heap �� ���Ӱ� ������� ��ü�� ������, ����� ��Ȱ���ϵ��� �ϰ� �ϴ� ������.
		
		System.out.println("\nintern() �޼ҵ� ȣ�� �� \n");
		
		if (str_1 == str_2) {
			System.out.println("str_1 == str_2 = true");			
		} else
			System.out.println("str_1 == str_2 = false");
		
		System.out.println(System.identityHashCode(str_1));
		System.out.println(System.identityHashCode(str_2));
		
	}

}
