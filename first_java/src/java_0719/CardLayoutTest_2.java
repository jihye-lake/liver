package java_0719;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest_2 extends Frame{
	Button first, prev,next,last;
	Panel buttons;
	Panel slide;
	Panel card1, card2, card3, card4, card5, card6;			//slide�� ���Ե� Panel
	CardLayout card;  // �ϳ����� ���δ�
	
	public CardLayoutTest_2(String title) {
		super(title);
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);
		
		//Button�� ���� Panel
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");		//��ư�̶�� �̸��� �г��̴�
		last = new Button(">>");
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		
		first.addActionListener(new ActionListener() {				//Anonymous Ŭ�������(��ü �������� �̺�Ʈ�� �߻���Ű�� ������)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//CardLayout �� ù��° slide(Panel)�� ���̵��� �Ѵ�.
				card.first(slide);
			}
		}
	);
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // this �ٿ��� �� ���� ������ �̷��� ���� ��
				card.previous(slide);  // previous �޼ҵ� ����(CardLayout �� �޼ҵ��� previous)
			}
		}
	);
	
		next.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(slide);
			}
		}
	);
	
		last.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.last(slide);
			}
		}
	);
		card1 = new Panel();
		card1.setBackground(new Color(150,150,250));
		card1.add(new Label("ù��° ������"));
		
		card2 = new Panel();
		card2.setBackground(new Color(150,250,150));
		card2.add(new Label("�ι�° ������"));
		
		card3 = new Panel();
		card3.setBackground(new Color(250,150,150));
		card3.add(new Label("����° ������"));
		
		card4 = new Panel();
		card4.setBackground(new Color(250,250,150));
		card4.add(new Label("�׹�° ������"));
			
		card5 = new Panel();
		card5.setBackground(new Color(150,250,250));
		card5.add(new Label("�ټ���° ������"));
		
		card6 = new Panel();
		card6.setBackground(new Color(250,250,230));
		card6.add(new Label("������° ������"));
		
		slide.add(card1,"1");									//slide(Panel)�� card1(Panel)�� "1�̶�� �̸����� �߰�
		slide.add(card2,"2");
		slide.add(card3,"3");
		slide.add(card4,"4");
		slide.add(card5,"5");
		slide.add(card6,"6");  // ������ �ٲٰ� ������ card123456�� �ٲ��ָ� ��
		
		add("South",buttons);
		add("Center"	,slide);  // CardLayout �� ���� �ֱ� ������ �ϳ��ۿ� �� ���δ�.

		setSize(300,300);
		setLocation(300,300);
		setVisible(true);
		
		card.show(slide, "3");  // �� ó���� �� ��°�� ���´�
	}
	public static void main(String[] args) {
		new CardLayoutTest_2("CardLayout Test");
	}
}
