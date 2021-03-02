package java_0802;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Progress_1 extends JFrame {
	
	JProgressBar progress;
	JLabel lbl_info;
	
	public Progress_1(String title) {
		super(title);
		
		progress = new JProgressBar();
		progress.setMinimum(0);  // 프로그래스 최소값
		progress.setMaximum(100);  // 프로그래스 최대값  //  여기 바꿔주면 밑에 for문도 바꿔줘야 함
		progress.setValue(0);  // 프로그래서 시작값
		
		lbl_info = new JLabel("");
		
		this.getContentPane().add(progress,"North");
		getContentPane().add(new JLabel("  JProgress Test 중 입니다."), "Center");
		getContentPane().add(lbl_info, "South");
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(300, 200);
		setVisible(true);   // 전부 this.  쓸 수 있지만 생략해 준 것임. 쓸 수도 있고, 안 쓸 수도 있는 것.
								// this 는 현재 나 자신의 클래스를 지칭함
		progress_start();
		
		
	}

	private void progress_start() {
		
		int i;
		
		try {
			for (i = 0; i <= 100; i++) {  // 200까지 5씩 증가 여기 숫자 바꿔주면 도달 % 와 얼만큼 갈지 정할 수 있음
				progress.setValue(i);
				Thread.sleep(100);
				lbl_info.setText("  현재 진행률  " + i + " %");
				
				if (i == 32) {				
					
				throw new Exception();
//					int a = (45/0);					
				}
				
				
				if (i == 100) {
					lbl_info.setText(" 다운로드가 완료되었습니다. ");
					
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			lbl_info.setText("문제가 발생했습니다.");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Progress_1("Progress Test");
	}

}
