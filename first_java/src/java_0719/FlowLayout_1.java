package java_0719;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout_1 extends Frame {
	
	FlowLayout fll = new FlowLayout();  // 화면에 다 들어가지 못 하면 위나 아래로 내려갈 수 있게 함
	Button[] btn = new Button[10];
	
	public FlowLayout_1(String title) {
		super(title);
		setLayout(fll);  // 없으면 센터에 들어가게 되고 누적이 되면서 하나만 보이게 됨
		//Layout 을 쓰지 않으면 BorderLayout 인데 이건 중간에 쌓이게 된다.
		//BorderLayout 을 쓰려면 동서남북 배치를 해줘야 한다. 아니면 센터에만 들아가서 계속 겹친다
		
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button(i + "번 버튼");
			add(btn[i]);			
		}
		
		setBounds(100,100,200,200);  // setLocation + setSize 를 합친 것
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FlowLayout_1("FlowLayout Test");
		
	}

}
