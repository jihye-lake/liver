package java_0813;

import java.io.File;

public class Dir_1_1 {
	public static void main(String[] args) {

		// ���� ���丮 ���

//		File dir = new File(".");
//		File dir = new File("./src/images/."); // src �� images �ȿ� �ִ� ������ �˰� �ʹٸ�?
		File dir = new File("./src/.");

		String[] strs = dir.list();

		for (int i = 0; i < strs.length; i++) {
//			int str2 = strs[i].indexOf("."); // index �� �̿��ؼ� . �� ��ġ�� ã�Ƴ���
			int str2 = strs[i].lastIndexOf(".");  // . �� ���� �񱳸� �Ϸ���

			String str3 = strs[i].substring(str2 + 1); // . ���� ���ں��� ��� str3 �� ����

			if (str3.equals("au")) { // �� ���ڰ� au �� ���ٸ� �̾Ƴ���� ��
				System.out.println(strs[i]);
			}
		}

		for (int i = 0; i < strs.length; i++) {
			// ��ó : https://itpangpang.xyz/276

			System.out.println(" ���� ���丮 ���� : " + strs[i]);
		}

	}

}