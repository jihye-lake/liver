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
		TextArea ta = new TextArea(); //가로 세로 스크롤이 자동으로 생긴다.
		
		MenuBar mb = new MenuBar();  // 프레임에 메뉴바를 붙이고, 메뉴바에 메뉴를 붙이고, 메뉴에 메뉴아이템을 붙인다.
		Menu file = new Menu("파일");
		
		MenuItem file_new = new MenuItem("새 파일");
		MenuItem file_open = new MenuItem("불러오기");
		MenuItem file_close = new MenuItem("파일닫기");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);
		
		Menu edit = new Menu("편집");
		
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu Run = new Menu("실행");
		
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
