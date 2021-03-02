package java_0718;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class PanelTest_2_3 extends Frame{
 public PanelTest_2_3(String title) {
  super(title);
  setLayout(null);
  
  Panel panel1 = new Panel();
  panel1.add(new Button("Panel1 위의 버튼"));
  panel1.add(new Checkbox("김희진"));
  panel1.setSize(200,100);
  panel1.setLocation(50,50);
  
  Panel panel2 = new Panel();
  panel2.add(new Label("라벨라벨"));
  panel2.add(new Button("Panel2 위의 버튼"));
  panel2.setSize(200,100);
  panel2.setLocation(50,250);
  
  Panel panel3 = new Panel();      
  panel3.add(new Button("Panel3 버튼"));
  panel3.setSize(100, 100);
  panel3.setLocation(50, 150);
  
  Panel panel4 = new Panel();
  panel4.add(new Button("Panel4 버튼"));
  panel4.setSize(100,100);
  panel4.setLocation(150, 150);
  
  add(panel1);
  add(panel2);
  add(panel3);
  add(panel4);
  
  setSize(300,350);
  setVisible(true);
 }
 public static void main(String[] args) {
  new PanelTest_2_3("Panel Test_2");
 }
} 