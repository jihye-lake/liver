package java_0712;

public class String_6_1 {
	public static void main(String[] args) {
		
		String[] juju = {"70006221623444", "70006241563444", "71006225623444", "70006211623214", "70006234623444", "70089211623444"};
		
		String dd = "";
		
		for (int i = 0; i < juju.length; i++) {
			dd = juju[i].substring(6,7);
			
			if (dd.equals ("1") || dd.equals("3") ) {
				System.out.println(juju[i] + " 는 남남자입니다.");
			} else 
				System.out.println(juju[i] + " 는 여자입니다.");
			
			
			
			//charAt 해보기
				
			}
			
		}
		
	}
