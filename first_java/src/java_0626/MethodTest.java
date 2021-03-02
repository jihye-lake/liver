package java_0626;

public class MethodTest {
	public static void main(String[] args) {  //  main 이 있는 클래스명으로 저장하기
		
		MyMethod obj = new MyMethod();
		
		long result1 = obj.add(5L, 5L);  //  MyMethod 에 add 라는 메소드가 없음
		long result2 = obj.sub(55L, 33L);
		long result3 = obj.mul(5L, 3L);
		double result4 = obj.div(55L, 3L);  //  ctrl + 마우스 좌 클릭 => 그것이 정의 된 곳으로 감
		long result5 = obj.mod(55L, 3L);
		
		
		System.out.println("add() : " + result1);
		System.out.println("sub() : " + result2);
		System.out.println("mul() : " + result3);
		System.out.println("div() : " + result4);
		System.out.println("mod() : " + result5);
		
		
	}

}

class MyMethod {

	public long add(long l, long m) {

		return (l + m);
	}
	
	long sub(long kk, long jj) {
		
		return(kk - jj);
	}
	
	long mul(long hh, long ff) {
		
		return(hh * ff);
	}
	
	double div(long tt, long dd) {
		
		return(tt / (double)dd);  //  double 이니까 소수점이하 값을 가져야하기 때문에 double 써 줌.
	}
	
	long mod(long aa, long bb) {
		
		return(aa % bb);
	}
	
}
