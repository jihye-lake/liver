package java_0813;

import java.io.File;

public class Dir {
	public static void main(String[] args) {

		// ���� ���丮 ���

//		File dir = new File(".");
		File dir = new File("./src/images/.");  // src �� images �ȿ� �ִ� ������ �˰� �ʹٸ�?

		String[] strs = dir.list();

		for (int i = 0; i < strs.length; i++) {
			System.out.println(" ���� ���丮 ���� : " + strs[i]);
		}

	}

}
