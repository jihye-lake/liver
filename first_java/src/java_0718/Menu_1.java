package java_0718;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
//import java.awt.ScrollPane;
import java.awt.TextArea;

public class Menu_1 extends Frame	{
	
	public Menu_1(String title) {
		super(title);
		
//		ScrollPane scp = new ScrollPane();
		TextArea ta = new TextArea(); //���� ���� ��ũ���� �ڵ����� �����.
		
		MenuBar mb = new MenuBar();  // �����ӿ� �޴��ٸ� ���̰�, �޴��ٿ� �޴��� ���̰�, �޴��� �޴��������� ���δ�.
		Menu file = new Menu("����");
		
		MenuItem file_new = new MenuItem("�� ����");
		MenuItem file_open = new MenuItem("�ҷ�����");
		MenuItem file_close = new MenuItem("���ϴݱ�");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);
		
		Menu edit = new Menu("����");
		
		MenuItem edit_cut = new MenuItem("�����α�");
		MenuItem edit_paste = new MenuItem("���̱�");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu Run = new Menu("����");
		
		MenuItem run_debug = new MenuItem("Debug");
		MenuItem run_runas = new MenuItem("Run as");
		
		Run.add(run_debug);
		Run.add(run_runas);
		
		mb.add(file);
		mb.add(edit);
		mb.add(Run);
		
//		add("Center", scp);
		add("Center", ta);
		
		setMenuBar(mb);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu_1("Menu Test");
	}

}
