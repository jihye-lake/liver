package java_0715;

public class String_17 {
	public static void main(String[] args) {
		
		double dd = 26.8;
		char[] ch_arr = {'��','��','��','��','��','��','��'};
		
		String str = String.valueOf(ch_arr) + " : " + String.valueOf(dd);  //valueOf �� �پ��� overloading
		
		System.out.println(str);
	}

}
