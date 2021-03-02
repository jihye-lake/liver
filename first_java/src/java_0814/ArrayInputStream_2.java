package java_0814;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ArrayInputStream_2 {
	public static void main(String[] args) {

		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		byte[] temp = new byte[10];

		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		input.read(temp, 0, temp.length); // 읽어온 데이터 배열을 temp 배열에 담는다.
		output.write(temp, 5, 4); // temp[5] 부터 4개를 write 한다는 뜻. 뒤에 숫자를 5로 바꾸면 다섯개가 나온다

		outSrc = output.toByteArray();

		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Result : " + Arrays.toString(outSrc));
	}

}
