package java_0705;

public class Exception_7 {
	public static void main(String[] args) {
		
		try {
			stratInstall();  //프로그램 설치시 필요한 준비를 한다.
			copyFile(); //파일을 복사한다.  아무것도 없이 올 때는 반드시 static 으로 선언되어야 한다.(밑에 있음)
						   //private 으로 되어 있으니까 이 패키지 안에서만 사용하겠다는 의미임.
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("프로그램 설치에 문제가 있습니다.");
			
		} finally {
		
		System.out.println("프로그램 설치가 완료되었습니다.");
		deleteTempFiles();  //프로그램 설치에 필요한 임시파일을 지웁니다.
		
		}
		
		
	}

	static void deleteTempFiles() {  //void 제외하고는 모두 return 되는 Method 이다.
		
		
	}

	static void copyFile() {
		
		
	}

	static void stratInstall() {
		
		
	}

}
