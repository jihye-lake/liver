package java_0814;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy {
	public static void main(String[] args) {

		if (args.length != 2) { // 2가 아니라면(이 표현을 == 2 보다 더 많이 씀)
			System.out.println("Usage : Copy <source> <destination>");
		} else {
			// 복사를 위해 copy 를 호출하고 발생하는 예외 처리
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

		// 소스파일이 존재하는지, 파일인지, 읽을 수 있는지 확인

		if (!from_file.exists()) abort("no such source file : " + from_name);
		if (!from_file.isFile()) abort("can't copy directory : " + from_name);
		if (!from_file.canRead()) abort("source file is unreadable : " + from_name);
		
		// to_name 이 디렉토리면 source 파일이름을 destination 파일이름으로 그대로 사용
		
		if (to_file.exists()) {
			if (!to_file.canWrite()) {
				abort("쓰기가 불가능합니다." + to_name);
			}
			// 덮어쓸 것인지를 지정
			System.out.print(("덮어쓸까요?" + to_file.getName() + "(Y/N)"));
			System.out.flush();
			
			// 사용자 입력을 기다림
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String response = in.readLine();
			
			// 응답을 확인해서 Yes 가 아니면 복사를 중지
			if (!response.equals("Y")&& !response.equals("y")) {
				abort("덮어쓰기 할 수 없는 파일입니다.");
				
			} else {
				// 파일이 없으면, 디렉토리가 존재하고, 쓰기가 가능한지 확인
				String parent = to_file.getParent();
				
				if (parent == null) {
					parent = System.getProperty("user.dir"); // null 인 경우 현재 디렉토리
					
					File dir = new File(parent); // 파일로 변환
					
					if (!dir.exists()) {abort("파일이 존재하지 않습니다." + parent);
					}
					if (!dir.isDirectory()) {abort("디렉토리가 아닙니다." + parent);
					}
					if (!dir.canWrite()) {abort("파일이 쓰기방지가 되어 있습니다." + parent);
					}
					// 파일 복사
					
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
