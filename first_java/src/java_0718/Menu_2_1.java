package java_0718;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2_1 extends Frame {
	
	public Menu_2_1 (String title) {
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("새 파일");  //CheckboxMenuItem 의 역할이 체크표시를 표시, 해제 할 수 있는 것임
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");  // "불러오기", true 이런식으로 해 주면 디폴트로 체크가 된다.
		MenuItem file_separator = new MenuItem("-"); // 언더바는 안됨
		MenuItem file_close = new MenuItem("파일닫기");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		Menu edit = new Menu("편집");  // 메뉴가 메뉴에 붙을 수 있음.
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		Menu test = new Menu("잘라내기"); // 메뉴에 메뉴에 메뉴를 붙이기.
		MenuItem test_out = new MenuItem("잘라내기1");
		MenuItem test_out2 = new MenuItem("잘라내기2");
		
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		test.add(test_out);
		test.add(test_out2);
		
		file.add(edit);  // add(edit) 을 해 줘서 file 에 붙여줘서 메뉴에 메뉴가 올 수 있었음
		file.add(test);
		edit.add(test);
		
		mb.add(file);  // 그 파일을 mb(메뉴바) 에 붙여줬기 때문에 메뉴바에 붙었음
		
		setMenuBar(mb);		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu_2_1("Menu Test");
	}

}