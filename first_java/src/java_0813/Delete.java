package java_0813;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		
		if (args.length != 1) {   // 매개변수가 1개가 아니면 지울 수 없음(하나만 지울 수 있도록 설정함)
			System.out.println("Usage : java Delete < file or director > ");
		}
		
		try {
			delete(args[0]);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();  // 메소드가 발생한 경로를 띄워 줌
			System.out.println(e.getMessage());
		}
	}
	
	// 삭제 정적 메소드
	// 지정한 파일이나 디렉토리를 삭제하기 전에 삭제가 가능한지 확인
	// 문제가 발생하면 IllegalArgumentException 을 발생

	private static void delete(String filename) {
		
		File ff = new File(filename);
		
		// 파일이나 디렉토리가 존재하는지와 쓰기 방지 되었는지 확인
		
		if (!ff.exists()) {  // 그 파일이 존재하지 않는다면? 밑의 메세지를 보인다
			fail("Delete : no such file or director " + filename);
			
		}
		if (!ff.canWrite()) {  // 파일이 존재는 하는데 쓰기금지가 되어있지 않다면(readonly 라면 canread라면)? 밑의 메시지를 보인다.
			fail("Delete : write protected " + filename);
		}
		
		// 디렉토리면 비어있는지 확인
		
		if (ff.isDirectory()) {  // 디렉토리라면
			String[] files = ff.list();  // 그 디렉토리의 리스트를 읽어들여라
			
			if (files.length > 0) {  // 파일들의 길이를 체크해서 0보다 크다면
				fail("Delete : directory not empty " + filename);  // 파일이 있는 것이므로 디렉토리를 지울 수 없음
			}
		}
		
		// 모든 검사를 통과하면 파일 삭제
		
		boolean success = ff.delete();
		if (!success) {  // 성공이 아니라면? 지워지지 않았다는 뜻임
			fail("Delete : deletion failed ");
		} else
			System.out.println("성공적으로 삭제되었습니다.");
		
	}

	private static void fail(String msg) throws IllegalArgumentException {
		throw new IllegalArgumentException(msg);
	}

}
