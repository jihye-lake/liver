package java_0729;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Clock extends Frame implements ActionListener {
	
	Analog analog;
	Button btn;
	//생성자
	public Clock(String title) {
		super(title);
		// 아날로그 프레임 붙이기
		analog = new Analog();
		analog.setSize(300, 330);
		btn = new Button("시계 종료");
		btn.addActionListener(this);
		add("Center", analog);
		add("South", btn);
		setSize(330, 380);
		setVisible(true);
	}
	//스레드 시작
	public void Start() {
		new Thread(analog).start();
	}
	//프로그램 강제 종료
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock("아날로그 시계");
		clock.Start();
	}

}

//사각형 영역을 저장하는 클래스

class RECT {
	int left;  // 왼쪽 X 좌표
	int top;  // 위쪽 Y 좌표
	int right; // 오른쪽 X 좌표
	int bottom;  // 왼쪽 Y좌표
	public RECT(int left, int top, int right, int bottom) {
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	
	// 수평 방향, 수직 방향 보정
	public void offSet(int horizontal_offset, int vertical_offset) {
		left += horizontal_offset;
		right += horizontal_offset;
		top += vertical_offset;
		bottom += vertical_offset;
		
	}
}

//아날로그 클래스

class Analog extends Canvas implements Runnable {
	RECT rect;
	static int h; // 시간
	static int m; // 분
	static int s; // 초
	static int center_x , center_y; // 시계 바늘 중심 좌표
	
	//생성자
	public Analog() {
		rect = new RECT(10, 10, 290, 290);
		center_x = (rect.right + rect.left) / 2; // 시계 중심 x 좌표
		center_y = (rect.bottom + rect.top) / 2; // 시계 중심 y 좌표
		
	}
	
	// 현재 시간 알아내는 메서드
	static void CurruntTime() {
		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:ss yyyy", Locale.getDefault());
		
		
   // 초 알아내기
	formatter.applyPattern("s");
	try {
		s = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		s = 0;
	}
  // 분 알아내기
	formatter.applyPattern("m");
	try {
		m = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		m = 10;
	}
  // 시 알아내기
	formatter.applyPattern("h");
	try {
		h = Integer.parseInt(formatter.format(currentDate));
	} catch (NumberFormatException e) {
		h = 10;
	}
	
	}
	//화면에 출력하기
	public void paint(Graphics g) {
		CurruntTime();
		// 시계 모양 그리기
		g.drawOval(rect.left,  rect.top,  rect.right,  rect.bottom);
		// 시간 좌표
		int xh = (int) (Math.cos((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 70 + center_x);
		int yh = (int) (Math.sin((h*30 + m / 2) * Math.PI / 180 - Math.PI / 2) * 70 + center_y);
		
		// 분 좌표
		int xm = (int) (Math.cos(m * Math.PI / 30 - Math.PI / 2) * 90 + center_x);
		int ym = (int) (Math.sin(m * Math.PI / 30 - Math.PI / 2) * 90 + center_y);
		
		//초 좌표
		int xs = (int) (Math.cos(s * Math.PI / 30 - Math.PI / 2) * 110 + center_x);
		int ys = (int) (Math.sin(s * Math.PI / 30 - Math.PI / 2) * 110 + center_y);
		
		 String c;		// 1~12 숫자 춝력 문자 저장
		 RECT tRect = new RECT(0,0,0,0);		// 눈금 출력 영역 설정
		 
		 // 눈금 출력 부분
		 for (int i = 0; i < 60; i++) {
			 tRect.top = (int)(Math.cos(i * Math.PI / 30 - Math.PI / 2) * 125 + center_x);
			 tRect.left = (int)(Math.sin(i * Math.PI / 30 - Math.PI / 2) * 125 + center_y);
			 
			 if(i % 5 == 0) {
				 tRect.right = tRect.left + 9;
				 tRect.bottom = tRect.top + 9;
				 
				 tRect.offSet(7, 5);  // 눈금 좌표 보정
				 
				 if((i / 5) == 0)
					 c = "12";
				 else
					 c = (int)(i / 5) + "";
				 
				 g.setColor(new Color(0,0,0));
				 g.drawString(c,  tRect.top-2,  tRect.left-1);
				 
				 
			 }
			 
			 // 초 바늘 그리기
			 g.setColor(new Color(100,100,255));
			 g.drawLine(center_x,  center_y,  xs,  ys);
			 
			 // 분 바늘 그리기
			 g.setColor(new Color(100,255,100));
			 g.drawLine(center_x,  center_y,  xm,  ym);
			 
			 // 시 바늘 그리기
			 g.setColor(new Color(255,0,10));
			 g.drawLine(center_x,  center_y,  xh,  yh);
			
		}
		
	}
	
	public void run() {
		for (; ;) {
			try {
				Thread.sleep(1000);
				repaint();
			} catch (InterruptedException e) {	}
			
		}
	}
}
