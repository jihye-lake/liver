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

public class CardLayoutTest_2_1 extends Frame {
	
	Button first, prev, next, last;
	Panel buttons;
	Panel slide;
	Panel card1, card2, card3, card4, card5, card6;
	CardLayout card;
	
	public CardLayoutTest_2_1(String title) {
		super(title);
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);
		
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		
		first.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//CardLayout 의 첫번째 slide(Panel)이 보이도록 한다.
				card.first(slide);				
			}
		});
		
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(slide);
			}
		});
		
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(slide);
			}
		});
		
		last.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.last(slide);
			}
		});		
		
		card1 = new Panel();
		card1.setBackground(new Color(240,238,199));
		card1.add(new Label("첫 번째 페이지"));
		
		card2 = new Panel();
		card2.setBackground(new Color(120,240,233));
		card2.add(new Label("두 번째 페이지"));
		
		card3 = new Panel();
		card3.setBackground(new Color(233,166,229));
		card3.add(new Label("세 번째 페이지"));
		
		card4 = new Panel();
		card4.setBackground(new Color(240,200,200));
		card4.add(new Label("네 번째 페이지"));
		
		card5 = new Panel();
		card5.setBackground(new Color(170,140,239));
		card5.add(new Label("다섯 번째 페이지"));
		
		card6 = new Panel();
		card6.setBackground(new Color(140,155,250));
		card6.add(new Label("여섯 번째 페이지"));
		
		slide.add(card1, "1");
		slide.add(card2, "2");
		slide.add(card3, "3");
		slide.add(card4, "4");
		slide.add(card5, "5");
		slide.add(card6, "6");
		
		add("South", buttons);
		add("Center", slide);
		
		setSize(300, 300);
		setLocation(300,300);
		setVisible(true);
		
//		card.show(slide, "3"); // 세 번째 페이지부터 보여주게 된다
		
	}
	
	public static void main(String[] args) {
		new CardLayoutTest_2_1("CardLayoutTest_2_1");
	}

}
