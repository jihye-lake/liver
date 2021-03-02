package java_0813;

import java.io.File;

public class Dir_1_1 {
	public static void main(String[] args) {

		// 현재 디렉토리 출력

//		File dir = new File(".");
//		File dir = new File("./src/images/."); // src 의 images 안에 있는 내용을 알고 싶다면?
		File dir = new File("./src/.");

		String[] strs = dir.list();

		for (int i = 0; i < strs.length; i++) {
//			int str2 = strs[i].indexOf("."); // index 를 이용해서 . 의 위치를 찾아내고
			int str2 = strs[i].lastIndexOf(".");  // . 을 빼고 비교를 하려고

			String str3 = strs[i].substring(str2 + 1); // . 다음 글자부터 모두 str3 에 담음

			if (str3.equals("au")) { // 그 글자가 au 와 같다면 뽑아내라는 뜻
				System.out.println(strs[i]);
			}
		}

		for (int i = 0; i < strs.length; i++) {
			// 출처 : https://itpangpang.xyz/276

			System.out.println(" 현재 디렉토리 파일 : " + strs[i]);
		}

	}

}