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
		final CardLayout card = new CardLayout(10, 10);  // 테두리여백 H여백 = 가로 V여백 = 세로
		
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
		
		ff.add(card_1, "1"); // Frame 에 card_1 을 "1" 이라고 이름을 붙여 추가
		ff.add(card_2, "2");
		ff.add(card_3, "3");
		ff.add(card_4, "4");
		
		class Handler extends MouseAdapter {  // inner class임 / Adapter 를 쓰면 하나만 써도 다 쓸 수 있다.
			public void mouseClicked(MouseEvent e) {
				// 마우스 오른쪽 버튼이 눌렸을 때
				if (e.getModifiers() == e.BUTTON1_MASK) {  // BUTTON1 -> 오른쪽 버튼 2는 휠, 3은 오른쪽 버튼
					card.previous(ff); // CardLayout 의 이전 Panel 을 보여줌
				} else {
					card.next(ff); // CardLayout 의 이후 Panel 을 보여줌
				}  //오른쪽 마우스 클릭하면 뒤로, 왼쪽 마우스 클릭하면 앞으로
			}
		}  // class Handler
		
		card_1.addMouseListener(new Handler()); // this 는 class 자신이 implements 한 경우, Handler 는 다른 데 있다는 의미
		card_2.addMouseListener(new Handler());
		card_3.addMouseListener(new Handler());
		card_4.addMouseListener(new Handler());
		
		ff.setLocation(1100, 200);
		ff.setSize(300, 300);
		ff.setVisible(true);

	}

}
