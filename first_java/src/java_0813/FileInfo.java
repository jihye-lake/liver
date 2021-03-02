package java_0813;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) throws IOException  {
		
		File file = new File(args[1]);  
		// 매개변수 실행법 => Run configurations 가서 Argument 에서 현재 크기가 1이니까 하나 건너뛸 만한 거 적어주고 1에 적어줌
		// src 에 있는 파일 보려면 src/gong.au 이렇게 하기 그 속으로 더 들어가려면 src/java_0813/Dir.java 이런식으로 해주기
		
		System.out.println(args[1] + "파일 상세 정보  *");
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		System.out.println("표준 경로 : " + file.getCanonicalPath());
		System.out.println("생성일 : " + new Date(file.lastModified()));
		System.out.println("파일 크기 : " + file.length());
		System.out.println("읽기 속성 : " + file.canRead());
		System.out.println("쓰기 속성 : " + file.canWrite());
		System.out.println("파일 경로 : " + file.getParent());
		System.out.println("파일 경로2 : " + file.getPath());
		System.out.println("숨김 속성 : " + file.isHidden());
		System.out.println("파일 : " + file.isFile());
	}

}
