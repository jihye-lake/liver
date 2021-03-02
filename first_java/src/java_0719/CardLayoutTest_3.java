package java_0719;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayoutTest_3 extends Frame {
	
	CardLayout card = new CardLayout();
	Panel[] panel = new Panel[6];
	
	Color[] color = {(new Color(250,150,150)), (new Color(170,180,255)), (new Color(190,255,188)), (new Color(240,230,177)), (new Color(240,230,111)), (new Color(0,51,153))};
	
	public CardLayoutTest_3(String title) {
		super(title);
		setLayout(card);
		
		
		MouseHandler mouse = new MouseHandler();
		
		for (int i = 0; i < 6; i++) {
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			panel[i].addMouseListener(mouse);
			add(new Integer(i).toString(),panel[i]);
			
		}
		
		setSize(300, 300);
		setVisible(true);
				
	}
	
	public class MouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			card.next(CardLayoutTest_3.this);
			System.out.println(e.toString()); // �Թ��ϴϱ� ���� ������ ������ �Ѹ� �� �ֵ��� �߰���.
			// MOUSE_CLICKED,(210,82) => ������ �ȿ����� ��ǥ�� / absolute(218,112) => ȭ�� ��ü�� ��ǥ��
		}
	}
	
	public static void main(String[] args) {
		new CardLayoutTest_3("CardLayout Test");
	}

}
