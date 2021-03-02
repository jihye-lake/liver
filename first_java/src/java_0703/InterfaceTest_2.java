package java_0703;

interface Component_4
{
	int kbs = 789;  //static final 이 생략되어 있으므로 숫자를 변경할 수 없음 - 상수화 되어 있음(Line 18 에서 오류가 생기는 이유)
}							//상수화 => 값 변경 불가능하다는 뜻

class Mbc_1 implements Component_4
{
	
}

public class InterfaceTest_2 {
	public static void main(String[] args) {
		
		Mbc_1 obj_1 = new Mbc_1();
		
		//obj_1.kbs = 345;
		System.out.println(obj_1.kbs);
		
	}

}
