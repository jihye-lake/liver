package java_0705;

public class Exception_10 {
	public static void main(String[] args) throws Exception {  //throws �� ���� : ���� ������������ ���ѱ��
		
			exceptionRun11();  // try catch Block ���� ���ΰų� throws Exception ���� ������ ���ѱ�Ⱑ �����ϴ�

	}

	private static void exceptionRun11() throws Exception {  //���⿡ throws �� ���鼭 ������ ������ ���Ѱ����µ� �� ������ ��� �� ������ �����϶�� ������ ��
		
		exceptionTest();  // ������ throws �� �ٽ� ������ �ѱ�� ������ 7������ ������ ��
		
	}

	private static void exceptionTest() throws Exception { //���� ���Ѱܼ� 16�� ���� ������
	
		throw new Exception("���� ���� Errorrrrrrrrr");
	}

}
