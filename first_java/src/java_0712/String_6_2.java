package java_0712;

public class String_6_2 {
	public static void main(String[] args) {
		
		String[] juju = {"70006221623444", "70006241563444", "71006225623444", "70006211623214", "70006234623444", "70089211623444"};
		
		char dd = ' ';
		
		for (int i = 0; i < juju.length; i++) {
			dd = juju[i].charAt(6);
			
			if (dd == '1' || dd == '3') {
				System.out.println(juju[i] + " 는 남남자입니다.");
			} else 
				System.out.println(juju[i] + " 는 여자입니다.");
			
				
			}
			
		}
		
	}
