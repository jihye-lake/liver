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
	Panel card1, card2, card3, card4, card5, card6;			//slide에 포함된 Panel
	CardLayout card;  // 하나씩만 보인다
	
	public CardLayoutTest_2(String title) {
		super(title);
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);
		
		//Button을 담을 Panel
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		
		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");		//버튼이라는 이름의 패널이다
		last = new Button(">>");
		
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		
		first.addActionListener(new ActionListener() {				//Anonymous 클래스방식(객체 생성없이 이벤트만 발생시키고 끝낸다)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//CardLayout 의 첫번째 slide(Panel)이 보이도록 한다.
				card.first(slide);
			}
		}
	);
		prev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  // this 붙여서 쓸 수도 있지만 이렇게 많이 씀
				card.previous(slide);  // previous 메소드 존재(CardLayout 의 메소드인 previous)
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
		card1.add(new Label("첫번째 페이지"));
		
		card2 = new Panel();
		card2.setBackground(new Color(150,250,150));
		card2.add(new Label("두번째 페이지"));
		
		card3 = new Panel();
		card3.setBackground(new Color(250,150,150));
		card3.add(new Label("세번째 페이지"));
		
		card4 = new Panel();
		card4.setBackground(new Color(250,250,150));
		card4.add(new Label("네번째 페이지"));
			
		card5 = new Panel();
		card5.setBackground(new Color(150,250,250));
		card5.add(new Label("다섯번째 페이지"));
		
		card6 = new Panel();
		card6.setBackground(new Color(250,250,230));
		card6.add(new Label("여섯번째 페이지"));
		
		slide.add(card1,"1");									//slide(Panel)에 card1(Panel)을 "1이라는 이름으로 추가
		slide.add(card2,"2");
		slide.add(card3,"3");
		slide.add(card4,"4");
		slide.add(card5,"5");
		slide.add(card6,"6");  // 순서를 바꾸고 싶으면 card123456만 바꿔주면 됨
		
		add("South",buttons);
		add("Center"	,slide);  // CardLayout 을 갖고 있기 때문에 하나밖에 안 보인다.

		setSize(300,300);
		setLocation(300,300);
		setVisible(true);
		
		card.show(slide, "3");  // 맨 처음에 세 번째가 나온다
	}
	public static void main(String[] args) {
		new CardLayoutTest_2("CardLayout Test");
	}
}
