package java_0717;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_2_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Choice Test_2_1");
		
		String[] fastfood = {"����", "ġŲ", "�ܹ���", "¥���", "������"};
		String[] fruit = {"������", "ü��", "����", "���", "�޷�"};
		String[] drink = {"������ĥ��", "�����ֽ�", "����", "�����ֽ�", "�޷���"};
		
		ff.setLayout(new FlowLayout());
		
		Label lbl1 = new Label("�����⸦ �����Ͻÿ�", Label.CENTER);
		Label lbl2 = new Label("������ �����Ͻÿ�", Label.CENTER);
		Label lbl3 = new Label("�帵ũ�� �����Ͻÿ�", Label.CENTER);
		
		
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
