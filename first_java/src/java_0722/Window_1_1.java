package java_0722;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Window_1_1 extends Frame{
	
Window[] win = new Window[40];
Color[] color = {Color.red, Color.yellow, Color.green, Color.cyan, Color.blue};
Window[] win2 = new Window[20];
public Window_1_1(String title) {
super(title);
int tempI=0;
int tempY=0;
int NumberOfFronts;
for (int i = 0; i < 40; i++) {
win[i] = new Window(this);
win[i].setBackground(color[i % 5]);
Label lbl = new Label(i + "번 윈도우");
win[i].add(lbl);
NumberOfFronts = (i/10)*10; //앞자리수
tempI = i%10; //뒷자리수
if ((NumberOfFronts/10)%2 == 0) {
win[i].setBounds(100+i*10, 100+(tempI*10), 100, 100);

win[i].setVisible(true);
tempY = 100+(tempI*10);
} else {
win[i].setBounds(100+i*10, tempY -(tempI*10), 100, 100);
win[i].setVisible(true);
}
}

setLocation(110, 160);

setVisible(true);
}
public static void main(String[] args) {
new Window_1_1("Window Test");
}

}
