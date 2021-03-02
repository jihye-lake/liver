package java_0711;

public class Wrapper_8 {
	public static void main(String[] args) {
		
		int bb_data = 0;
		
		Byte bb = new Byte("111");
		
		bb_data = bb.byteValue() + Byte.MAX_VALUE;
		
		Byte bb_2 = (byte) (bb.byteValue() + Byte.MAX_VALUE); //casting ÇßÀ½
		
		System.out.println("bb.byteValue() + Byte.MAX+VALUE : " + bb_data);
		System.out.println("(byte)bb.byteValue() + Byte.MAX_VALUE : " + bb_2);
		
		byte bbb = 0;
		int 	ii = 0;
		
		
		for (int i = 0; i < 300; i++) {
			
			System.out.println("byte : " + ++bbb + ", int : " + ++ii);
			
		}
				
	}

}
