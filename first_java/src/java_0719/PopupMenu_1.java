package java_0719;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenu_1 extends Frame implements MouseListener{
	PopupMenu popup;
	TextArea txt;
	
	public PopupMenu_1(String title) {
		super(title);
		
		popup = new PopupMenu("나의 팝업 메뉴");
		txt = new TextArea("최지혜는 최지혜");
		
		MenuItem cut = new MenuItem("오려두기");
		MenuItem paste = new MenuItem("붙여넣기");
		MenuItem copy = new MenuItem("복사하기");
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		txt.addMouseListener(this); // txtArea 에 마우스가 들어오면 잡겠다는  뜻
		txt.add(popup);  // add는 추가하는 것
		
		add(txt);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PopupMenu_1("Popup Menu Test");
	}

	@Override  //어디에 넣어도 똑같지만 기본적으로 Press 가 눌렀다 떼는 것
	public void mouseClicked(MouseEvent e) {
//	popup.show(txt, e.getX(), e.getY());  // add 는 옮기는 것
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // 이걸 넣어주면 콘솔창에 좌표값이랑 그 외에 정보들을 보여준다
	}

	@Override
	public void mousePressed(MouseEvent e) {  //눌렀다 떼는 것이 Press다
		popup.show(txt, e.getX(), e.getY());  // add 는 옮기는 것
		System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // 이걸 넣어주면 콘솔창에 좌표값이랑 그 외에 정보들을 보여준다
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//	popup.show(txt, e.getX(), e.getY());  // add 는 옮기는 것
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // 이걸 넣어주면 콘솔창에 좌표값이랑 그 외에 정보들을 보여준다
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//	popup.show(txt, e.getX(), e.getY());  // add 는 옮기는 것
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // 이걸 넣어주면 콘솔창에 좌표값이랑 그 외에 정보들을 보여준다
	}

	@Override
	public void mouseExited(MouseEvent e) {	
//	popup.show(txt, e.getX(), e.getY());  // add 는 옮기는 것
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // 이걸 넣어주면 콘솔창에 좌표값이랑 그 외에 정보들을 보여준다
		
	}

}
