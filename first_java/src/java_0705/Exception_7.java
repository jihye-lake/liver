package java_0705;

public class Exception_7 {
	public static void main(String[] args) {
		
		try {
			stratInstall();  //���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFile(); //������ �����Ѵ�.  �ƹ��͵� ���� �� ���� �ݵ�� static ���� ����Ǿ�� �Ѵ�.(�ؿ� ����)
						   //private ���� �Ǿ� �����ϱ� �� ��Ű�� �ȿ����� ����ϰڴٴ� �ǹ���.
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("���α׷� ��ġ�� ������ �ֽ��ϴ�.");
			
		} finally {
		
		System.out.println("���α׷� ��ġ�� �Ϸ�Ǿ����ϴ�.");
		deleteTempFiles();  //���α׷� ��ġ�� �ʿ��� �ӽ������� ����ϴ�.
		
		}
		
		
	}

	static void deleteTempFiles() {  //void �����ϰ�� ��� return �Ǵ� Method �̴�.
		
		
	}

	static void copyFile() {
		
		
	}

	static void stratInstall() {
		
		
	}

}
