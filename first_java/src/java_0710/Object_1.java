package java_0710;

class King extends Object { //모든 class 안에는 상속된 object 가 생략되어 있다.
	String kbs;
	
	public King() {  //생성자 King
		
	}

	public King(String kbs) {  //Alt+Shift+S -> Generate Constructor using fields
		this.kbs = kbs;
	}
	
	public String toString() {   //원래 Object 안에도 toString은 있지만 이렇게 또 적어주면 Overriding 을 해주는 것
		return "대한민국 만세";
	}
	
}

public class Object_1 {
	public static void main(String[] args) {
		
		King obj = new King();
		
		System.out.println("클래스 이름	: " + obj.getClass()); //주소값이 같은 건 같은 객체라는 뜻이다
		                                   //그렇기 때문에 해시코드가 같다는 건 그 주소가 같은 지를 판별한다는 뜻이다
		System.out.println("해시    코드	: " + obj.hashCode()); //객체가 만들어진 곳의 주소(해시 함수를 거쳐서 나온 숫자들)
		System.out.println("객체 문자열	: " + obj.toString()); //객체가 만들어진 곳의 주소를 16진수로 나타냄
		System.out.println("객체 문자열	: " + obj); //객체가 만들어진곳에 패키지명 / 클래스명 / 위치 이렇게 나옴
		
	}

}
