package java_0716;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String str = "�ڹٴ�$ �پ���$ ���ڿ� ó��, ��¥ ó��, " + "�ð� ó��, �� ����$ �޼ҵ带$ ���� �ֽ��ϴ�.";
		
		StringTokenizer stt = new StringTokenizer(str,",$");  // ,$ �� ��ū�и���ȣ��
		System.out.println("��ū ',' �� �� : " + stt.countTokens());
		
		while (stt.hasMoreElements()) {
			System.out.println(stt.nextToken());
			//���ε��� �̾Ƴ��� �� �� �ִ�
		}
	}

}
