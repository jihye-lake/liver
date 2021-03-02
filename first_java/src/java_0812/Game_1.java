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
		this.setTitle("�Ѿ��Ѿ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new GamePanel();
		this.add(panel);

		this.setLocationRelativeTo(null);
		// setLocationRelativeTo(null) �������� ��ġ�� ������Ʈ�� ���� ������� ��ġ�� �����Ѵ�.
		// �Ű������� null �� ������ ȭ�� �߾ӿ� �������� ��ġ�Ѵ�.
		this.setSize(400, 400);
		this.setVisible(true);
		panel.requestFocus();  // ���� �гο� ��Ŀ���� ����
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
					// Ŭ���� ���� ��ġ�� �˾Ƴ���, �� ��ġ�� ���� ������ ��ü�� �����ϰ� ����
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

		// ���콺 �����ʸ� ���� �Էµ� ��ǥ�� �޴´�.
		public BalloonThread(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void run() {
			// ��ǥ�� ���� �̹����� �����Ѵ�.
			JLabel la = new JLabel(icon);
			la.setSize(30, 30);
			la.setLocation(x, y);
			la.setOpaque(true);
			// setOpaque(true) �� ��� ��賻�� ��� �ȼ��� ä��
			// true �� �����ִ� ���, ���۳�Ʈ�� �� �簢�� ������ ��� �ȼ��� �������ϰ� ����Ʈ���� �ʴ� ���� �����մϴ�.
			// ���۳�Ʈ�� �� API�� true�� �����ִ� ���, Swing �ý�����, Ư���� ���۳�Ʈ�� paint �޼ҵ带 ȣ���� ������
			// �� area�� �����ΰ��� ����Ʈ���� �ʰ�, ����Ʈ�� ����ȭ�մϴ�.
			panel.add(la);

			while (true) {
				int x = la.getX();
				int y = la.getY() - 5; // 5�ȼ��� ���� �ö󰣴�.

				// ���̺��� ������ ������ ������ �����带 ����
				if (la.getHeight() + 30 <= 0)
					return;
				// �ƴϸ� ��� �ö󰣴�.
				else
					la.setLocation(x, y);
				try {
					sleep(20); // 0.02�ʿ� 5�ȼ� �̵�
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
