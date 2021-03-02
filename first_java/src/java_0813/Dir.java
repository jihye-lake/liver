package java_0813;

import java.io.File;

public class Dir {
	public static void main(String[] args) {

		// 현재 디렉토리 출력

//		File dir = new File(".");
		File dir = new File("./src/images/.");  // src 의 images 안에 있는 내용을 알고 싶다면?

		String[] strs = dir.list();

		for (int i = 0; i < strs.length; i++) {
			System.out.println(" 현재 디렉토리 파일 : " + strs[i]);
		}

	}

}
