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
		progress.setMinimum(0);  // ���α׷��� �ּҰ�
		progress.setMaximum(100);  // ���α׷��� �ִ밪  //  ���� �ٲ��ָ� �ؿ� for���� �ٲ���� ��
		progress.setValue(0);  // ���α׷��� ���۰�
		
		lbl_info = new JLabel("");
		
		this.getContentPane().add(progress,"North");
		getContentPane().add(new JLabel("  JProgress Test �� �Դϴ�."), "Center");
		getContentPane().add(lbl_info, "South");
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(300, 200);
		setVisible(true);   // ���� this.  �� �� ������ ������ �� ����. �� ���� �ְ�, �� �� ���� �ִ� ��.
								// this �� ���� �� �ڽ��� Ŭ������ ��Ī��
		progress_start();
		
		
	}

	private void progress_start() {
		
		int i;
		
		try {
			for (i = 0; i <= 100; i++) {  // 200���� 5�� ���� ���� ���� �ٲ��ָ� ���� % �� ��ŭ ���� ���� �� ����
				progress.setValue(i);
				Thread.sleep(100);
				lbl_info.setText("  ���� �����  " + i + " %");
				
				if (i == 32) {				
					
				throw new Exception();
//					int a = (45/0);					
				}
				
				
				if (i == 100) {
					lbl_info.setText(" �ٿ�ε尡 �Ϸ�Ǿ����ϴ�. ");
					
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			lbl_info.setText("������ �߻��߽��ϴ�.");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Progress_1("Progress Test");
	}

}
