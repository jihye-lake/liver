package java_0717;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_2_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Choice Test_2_1");
		
		String[] fastfood = {"피자", "치킨", "햄버거", "짜장면", "떡볶이"};
		String[] fruit = {"복숭아", "체리", "딸기", "사과", "메론"};
		String[] drink = {"복숭아칠러", "포도주스", "두유", "수박주스", "메론주"};
		
		ff.setLayout(new FlowLayout());
		
		Label lbl1 = new Label("쓰레기를 선택하시오", Label.CENTER);
		Label lbl2 = new Label("과일을 선택하시오", Label.CENTER);
		Label lbl3 = new Label("드링크를 선택하시오", Label.CENTER);
		
		
		Choice choice1 = new Choice();
		Choice choice2 = new Choice();
		Choice choice3 = new Choice();
		
		for (int i = 0; i < fastfood.length; i++) 
			choice1.add(fastfood[i]);
		
		for (int i = 0; i < fruit.length; i++) 
			choice2.add(fruit[i]);
		
		for (int i = 0; i < drink.length; i++) 
			choice3.add(drink[i]);
		
		ff.add(lbl1); ff.add(choice1);
		ff.add(lbl2); ff.add(choice2);
		ff.add(lbl3); ff.add(choice3);
				
		ff.setLocation(500, 300);
		ff.setSize(250, 300);
		ff.setVisible(true);
	}
	

}
