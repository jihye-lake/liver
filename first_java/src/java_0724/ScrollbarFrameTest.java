package java_0724;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarFrameTest {
	public static void main(String[] args) {
		
		MyFrame ff = new MyFrame("My Speed");
		
		Graphics gg = ff.getGraphics();
		gg.setColor(new Color(0,51,153));
		
		for (int  i = 0; true;  i += ff.speed) {  // for ���� true �����ϱ� ���ѹݺ���
			
			try {
				Thread.sleep(100);  // �ӵ��� ��������, ��������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			gg.clearRect(0,0,350,300);  // 0,0 �� �ָ� �������� �ʰ� �����ϰ� ���´�. �� �־��ָ� �����ȴ�.
			// �����ϰ� ����ڴٴ� ��. ���ڸ� �����ָ� �׿��� �����ȴ�.
			gg.drawString("������", i, 150);  // 150�� "������" �� ��ġ
			
			i = (i < 350) ? i : 0;  // i���� 350�� ������ �ٽ� 0���� �����ϰڴٴ� ��
			
		}
	}
}
	
	class MyFrame extends Frame {
		
		int speed = 1;
		Scrollbar sbb = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,95);
		
		Label lSpeed = new Label("Speed : 1");		
		
		public MyFrame(String title) {
			super(title);
			
			lSpeed.setBackground(new Color(255,254,90));
			lSpeed.setSize(70, 20);
			lSpeed.setLocation(20, 40);
			
			sbb.setSize(300, 20);
			sbb.setLocation(20,250);
			
			add(sbb);
			add(lSpeed);
			
			sbb.addAdjustmentListener(new MyHandler());
			
			addWindowListener(new MyHandler());
			
			setSize(350, 350);
			setLayout(null);
			setVisible(true);
			setResizable(false);
		}
		
		class MyHandler extends WindowAdapter implements AdjustmentListener {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				speed = sbb.getValue();
				lSpeed.setText("Speed : " + speed);
				
			}
			
			public void windowClosing(WindowEvent we) {
				
				System.exit(0);
				
			}
						
		}
	}

