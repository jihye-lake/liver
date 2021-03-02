package java_0628;

class AA_2{
	public void displayAA_2(final int TT) {
		class BB_2 {
			int bb = TT + 33;
			public void showBB_2() {
				System.out.println("TT = " + TT + "\nbb = " + bb);
			}
			
		}
		
		BB_2 bb_2 = new BB_2();
		bb_2.showBB_2();
	}
}

public class LocalClass_1 {
	
	public static void main(String[] args) {
		
		AA_2 obj_1 = new AA_2();
		
		obj_1.displayAA_2(55);
		
	}

}
