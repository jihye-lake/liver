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
		
		for (int  i = 0; true;  i += ff.speed) {  // for 문에 true 들어갔으니까 무한반복임
			
			try {
				Thread.sleep(100);  // 속도가 빨라지고, 느려진다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			gg.clearRect(0,0,350,300);  // 0,0 을 주면 누적되지 않고 깨끗하게 나온다. 더 넣어주면 누적된다.
			// 깨끗하게 지우겠다는 뜻. 숫자를 높여주면 쌓여서 누적된다.
			gg.drawString("최지혜", i, 150);  // 150은 "최지혜" 의 위치
			
			i = (i < 350) ? i : 0;  // i값이 350을 넘으면 다시 0부터 시작하겠다는 뜻
			
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

