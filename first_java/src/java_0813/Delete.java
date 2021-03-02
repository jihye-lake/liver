package java_0813;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		
		if (args.length != 1) {   // �Ű������� 1���� �ƴϸ� ���� �� ����(�ϳ��� ���� �� �ֵ��� ������)
			System.out.println("Usage : java Delete < file or director > ");
		}
		
		try {
			delete(args[0]);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();  // �޼ҵ尡 �߻��� ��θ� ��� ��
			System.out.println(e.getMessage());
		}
	}
	
	// ���� ���� �޼ҵ�
	// ������ �����̳� ���丮�� �����ϱ� ���� ������ �������� Ȯ��
	// ������ �߻��ϸ� IllegalArgumentException �� �߻�

	private static void delete(String filename) {
		
		File ff = new File(filename);
		
		// �����̳� ���丮�� �����ϴ����� ���� ���� �Ǿ����� Ȯ��
		
		if (!ff.exists()) {  // �� ������ �������� �ʴ´ٸ�? ���� �޼����� ���δ�
			fail("Delete : no such file or director " + filename);
			
		}
		if (!ff.canWrite()) {  // ������ ����� �ϴµ� ��������� �Ǿ����� �ʴٸ�(readonly ��� canread���)? ���� �޽����� ���δ�.
			fail("Delete : write protected " + filename);
		}
		
		// ���丮�� ����ִ��� Ȯ��
		
		if (ff.isDirectory()) {  // ���丮���
			String[] files = ff.list();  // �� ���丮�� ����Ʈ�� �о�鿩��
			
			if (files.length > 0) {  // ���ϵ��� ���̸� üũ�ؼ� 0���� ũ�ٸ�
				fail("Delete : directory not empty " + filename);  // ������ �ִ� ���̹Ƿ� ���丮�� ���� �� ����
			}
		}
		
		// ��� �˻縦 ����ϸ� ���� ����
		
		boolean success = ff.delete();
		if (!success) {  // ������ �ƴ϶��? �������� �ʾҴٴ� ����
			fail("Delete : deletion failed ");
		} else
			System.out.println("���������� �����Ǿ����ϴ�.");
		
	}

	private static void fail(String msg) throws IllegalArgumentException {
		throw new IllegalArgumentException(msg);
	}

}
