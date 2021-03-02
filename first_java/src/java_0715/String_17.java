package java_0715;

public class String_17 {
	public static void main(String[] args) {
		
		double dd = 26.8;
		char[] ch_arr = {'오','늘','날','씨','온','도','는'};
		
		String str = String.valueOf(ch_arr) + " : " + String.valueOf(dd);  //valueOf 의 다양한 overloading
		
		System.out.println(str);
	}

}
