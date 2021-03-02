package java_0808;

public class LoopExample_3 {
	public static void main(String[] args) {
		int i = 1;
		int e = 0;
		while (i <= 10) {
			e += i;
			i++;
		}
		System.out.println("1+2+3+ ... +9+10 = " + e);
	}

}
