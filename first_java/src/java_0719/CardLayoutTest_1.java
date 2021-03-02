package java_0719;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayoutTest_1 {
	public static void main(String[] args) {
		
		final Frame ff = new Frame("CardLayoutTest");
		final CardLayout card = new CardLayout(10, 10);  // �׵θ����� H���� = ���� V���� = ����
		
		ff.setLayout(card);
		
		Panel card_1 = new Panel();
		card_1.setBackground(new Color(255,180,180));
		card_1.add(new Label(" ** Card_1 ** "));
		
		Panel card_2 = new Panel();
		card_2.setBackground(new Color(200,255,200));
		card_2.add(new Label(" @@ Card_2 @@ "));
		
		Panel card_3 = new Panel();
		card_3.setBackground(new Color(180,180,255));
		card_3.add(new Label(" %% Card_3 %% "));
				
		ff.add(card_3);
		
		Panel card_4 = new Panel();
		card_4.setBackground(new Color(190,190,190));
		card_4.add(new Label(" ## Card_4 ## "));
		
		ff.add(card_1, "1"); // Frame �� card_1 �� "1" �̶�� �̸��� �ٿ� �߰�
		ff.add(card_2, "2");
		ff.add(card_3, "3");
		ff.add(card_4, "4");
		
		class Handler extends MouseAdapter {  // inner class�� / Adapter �� ���� �ϳ��� �ᵵ �� �� �� �ִ�.
			public void mouseClicked(MouseEvent e) {
				// ���콺 ������ ��ư�� ������ ��
				if (e.getModifiers() == e.BUTTON1_MASK) {  // BUTTON1 -> ������ ��ư 2�� ��, 3�� ������ ��ư
					card.previous(ff); // CardLayout �� ���� Panel �� ������
				} else {
					card.next(ff); // CardLayout �� ���� Panel �� ������
				}  //������ ���콺 Ŭ���ϸ� �ڷ�, ���� ���콺 Ŭ���ϸ� ������
			}
		}  // class Handler
		
		card_1.addMouseListener(new Handler()); // this �� class �ڽ��� implements �� ���, Handler �� �ٸ� �� �ִٴ� �ǹ�
		card_2.addMouseListener(new Handler());
		card_3.addMouseListener(new Handler());
		card_4.addMouseListener(new Handler());
		
		ff.setLocation(1100, 200);
		ff.setSize(300, 300);
		ff.setVisible(true);

	}

}
