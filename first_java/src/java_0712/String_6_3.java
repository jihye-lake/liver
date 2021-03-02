package java_0712;

public class String_6_3 {   //indexOf 써서 주민등록번호로 성별 구별하기
	public static void main(String[] args) {
		
		String[] juju = {"70006221623444", "70006241563444", "71006225623444", "70006211623214", "70006234623444", "70089211623444"};
		
		char dd = ' ';
		
		for (int i = 0; i < juju.length; i++) {
			
			if (juju[i].indexOf("1",6)==6 || juju[i].indexOf("3",6)==6) { //6으로 이동해서 6번째 위치에 1이 있는게 맞다면
				System.out.println(juju[i] + " 는 남남자입니다.");
				
			} else 
				System.out.println(juju[i] + " 는 여자입니다.");
			
				
			}
			
		}
		
	}
