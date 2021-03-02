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
		
		popup = new PopupMenu("���� �˾� �޴�");
		txt = new TextArea("�������� ������");
		
		MenuItem cut = new MenuItem("�����α�");
		MenuItem paste = new MenuItem("�ٿ��ֱ�");
		MenuItem copy = new MenuItem("�����ϱ�");
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		txt.addMouseListener(this); // txtArea �� ���콺�� ������ ��ڴٴ�  ��
		txt.add(popup);  // add�� �߰��ϴ� ��
		
		add(txt);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PopupMenu_1("Popup Menu Test");
	}

	@Override  //��� �־ �Ȱ����� �⺻������ Press �� ������ ���� ��
	public void mouseClicked(MouseEvent e) {
//	popup.show(txt, e.getX(), e.getY());  // add �� �ű�� ��
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // �̰� �־��ָ� �ܼ�â�� ��ǥ���̶� �� �ܿ� �������� �����ش�
	}

	@Override
	public void mousePressed(MouseEvent e) {  //������ ���� ���� Press��
		popup.show(txt, e.getX(), e.getY());  // add �� �ű�� ��
		System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // �̰� �־��ָ� �ܼ�â�� ��ǥ���̶� �� �ܿ� �������� �����ش�
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//	popup.show(txt, e.getX(), e.getY());  // add �� �ű�� ��
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // �̰� �־��ָ� �ܼ�â�� ��ǥ���̶� �� �ܿ� �������� �����ش�
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//	popup.show(txt, e.getX(), e.getY());  // add �� �ű�� ��
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // �̰� �־��ָ� �ܼ�â�� ��ǥ���̶� �� �ܿ� �������� �����ش�
	}

	@Override
	public void mouseExited(MouseEvent e) {	
//	popup.show(txt, e.getX(), e.getY());  // add �� �ű�� ��
//	System.out.println("" + txt + " :" + e.getX() + "," + e.getY());  // �̰� �־��ָ� �ܼ�â�� ��ǥ���̶� �� �ܿ� �������� �����ش�
		
	}

}
