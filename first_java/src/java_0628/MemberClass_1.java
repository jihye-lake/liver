package java_0628;

class AA_1
{
	int aa = 20;
	
	class BB_1
	{
		final static double PI = 3.1415;
		int bb = aa + 25;
	}
}

public class MemberClass_1 {
	
	public static void main(String[] args) {
		
		AA_1 aa_1 = new AA_1();
		
		AA_1.BB_1 bb_1;
		
		bb_1 = aa_1.new BB_1();
		
		System.out.println("PI = " + AA_1.BB_1.PI);
		System.out.println("BB_1 내부 변수 bb = " + bb_1.bb);
	}

}
