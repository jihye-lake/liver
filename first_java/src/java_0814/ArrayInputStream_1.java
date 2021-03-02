package java_0814;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ArrayInputStream_1 {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;  // �ƹ��͵� ������� ���� ����
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		// ByteArrayInputStream : ����Ʈ �迭�� �����͸� ������ϴµ� ���Ǵ� ��Ʈ��
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while ((data = input.read()) != -1) {  // ���⿡�� output �� ��ҵ��� �ְ� ����.
			output.write(data);
		}
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}
