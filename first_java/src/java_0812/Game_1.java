package java_0812;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Ex6 extends JFrame {
	GamePanel panel;
	ImageIcon icon = new ImageIcon("src\\images\\popcorn_2.png");

	Ex6() {
		this.setTitle("총알총알");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new GamePanel();
		this.add(panel);

		this.setLocationRelativeTo(null);
		// setLocationRelativeTo(null) 프레임의 위치를 컴포넌트에 따라 상대적인 위치를 지정한다.
		// 매개변수에 null 을 넣으면 화면 중앙에 프레임이 위치한다.
		this.setSize(400, 400);
		this.setVisible(true);
		panel.requestFocus();  // 게임 패널에 포커스를 맞춤
	}

	class GamePanel extends JPanel {
		GamePanel() {
			this.setLayout(null);
			this.addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent me) {

				}

				@Override
				public void mousePressed(MouseEvent me) {
					// 클릭한 곳의 위치를 알아내고, 그 위치에 대한 스레드 객체를 생성하고 실행
					int x = me.getX();
					int y = me.getY();
					BalloonThread bt = new BalloonThread(x, y);
					bt.start();
				}

				@Override
				public void mouseExited(MouseEvent me) {

				}

				@Override
				public void mouseEntered(MouseEvent me) {

				}

				@Override
				public void mouseClicked(MouseEvent me) {

				}
			});
		}
	}

	class BalloonThread extends Thread {
		int x, y;

		// 마우스 리스너를 통해 입력된 좌표를 받는다.
		public BalloonThread(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void run() {
			// 좌표에 대한 이미지를 생성한다.
			JLabel la = new JLabel(icon);
			la.setSize(30, 30);
			la.setLocation(x, y);
			la.setOpaque(true);
			// setOpaque(true) 일 경우 경계내의 모든 픽셀을 채움
			// true 를 돌려주는 경우, 컴퍼넌트는 그 사각형 영역의 모든 픽셀을 반투명하게 페인트하지 않는 것을 보증합니다.
			// 컴퍼넌트가 이 API에 true를 돌려주는 경우, Swing 시스템은, 특정의 컴퍼넌트에 paint 메소드를 호출할 때까지
			// 그 area의 무엇인가를 페인트하지 않게, 페인트를 최적화합니다.
			panel.add(la);

			while (true) {
				int x = la.getX();
				int y = la.getY() - 5; // 5픽셀씩 위로 올라간다.

				// 레이블이 프레임 밖으로 나가면 스레드를 종료
				if (la.getHeight() + 30 <= 0)
					return;
				// 아니면 계속 올라간다.
				else
					la.setLocation(x, y);
				try {
					sleep(20); // 0.02초에 5픽셀 이동
				} catch (Exception e) {
					return;
				}
			}
		}
	}
}

public class Game_1 {
	public static void main(String[] args) {
		new Ex6();
	}

}
