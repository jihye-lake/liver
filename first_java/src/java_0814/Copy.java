package java_0814;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy {
	public static void main(String[] args) {

		if (args.length != 2) { // 2�� �ƴ϶��(�� ǥ���� == 2 ���� �� ���� ��)
			System.out.println("Usage : Copy <source> <destination>");
		} else {
			// ���縦 ���� copy �� ȣ���ϰ� �߻��ϴ� ���� ó��
			try {
				copy(args[0], args[1]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	private static void copy(String from_name, String to_name) throws IOException {
		File from_file = new File(from_name);
		File to_file = new File(to_name);

		// �ҽ������� �����ϴ���, ��������, ���� �� �ִ��� Ȯ��

		if (!from_file.exists()) abort("no such source file : " + from_name);
		if (!from_file.isFile()) abort("can't copy directory : " + from_name);
		if (!from_file.canRead()) abort("source file is unreadable : " + from_name);
		
		// to_name �� ���丮�� source �����̸��� destination �����̸����� �״�� ���
		
		if (to_file.exists()) {
			if (!to_file.canWrite()) {
				abort("���Ⱑ �Ұ����մϴ�." + to_name);
			}
			// ��� �������� ����
			System.out.print(("������?" + to_file.getName() + "(Y/N)"));
			System.out.flush();
			
			// ����� �Է��� ��ٸ�
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String response = in.readLine();
			
			// ������ Ȯ���ؼ� Yes �� �ƴϸ� ���縦 ����
			if (!response.equals("Y")&& !response.equals("y")) {
				abort("����� �� �� ���� �����Դϴ�.");
				
			} else {
				// ������ ������, ���丮�� �����ϰ�, ���Ⱑ �������� Ȯ��
				String parent = to_file.getParent();
				
				if (parent == null) {
					parent = System.getProperty("user.dir"); // null �� ��� ���� ���丮
					
					File dir = new File(parent); // ���Ϸ� ��ȯ
					
					if (!dir.exists()) {abort("������ �������� �ʽ��ϴ�." + parent);
					}
					if (!dir.isDirectory()) {abort("���丮�� �ƴմϴ�." + parent);
					}
					if (!dir.canWrite()) {abort("������ ��������� �Ǿ� �ֽ��ϴ�." + parent);
					}
					// ���� ����
					
					FileInputStream from = null;
					FileOutputStream to = null;
					
					try {
						from = new FileInputStream(from_file);
						to = new FileOutputStream(to_file);
						
						byte[] buffer = new byte[4096];
						int bytes_read;
						while ((bytes_read = from.read(buffer)) != -1) {
							to.write(buffer,0,bytes_read);
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (from != null) {
							try {
							from.close();
							} catch (Exception e) {
							e.printStackTrace();
						} if (to != null) {
							try {
							to.close();
							} catch (Exception e) {
							e.printStackTrace();
						}

				}
				}
			}
		}
			}
		}

}

	private static void abort(String msg) throws IOException {
		throw new IOException("Copy : " + msg);
	}

}
