package java_0710;

class Queen {
	public Queen() {
		System.out.println("Queen 기본 생성자입니다.");
	}
	
	public String toString() {  //여기를 주석처리하면 주소값이 나온다.
		return "Object 클래스의 toString() 메소드 재정의";
	}
}

public class Object_2 {
	public static void main(String[] args) {
		
		Queen obj = new Queen();
		
		System.out.println(obj.toString());
	}

}
