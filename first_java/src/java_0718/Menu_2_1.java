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
		Menu file = new Menu("����");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("�� ����");  //CheckboxMenuItem �� ������ üũǥ�ø� ǥ��, ���� �� �� �ִ� ����
		CheckboxMenuItem file_open = new CheckboxMenuItem("�ҷ�����");  // "�ҷ�����", true �̷������� �� �ָ� ����Ʈ�� üũ�� �ȴ�.
		MenuItem file_separator = new MenuItem("-"); // ����ٴ� �ȵ�
		MenuItem file_close = new MenuItem("���ϴݱ�");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		Menu edit = new Menu("����");  // �޴��� �޴��� ���� �� ����.
		MenuItem edit_cut = new MenuItem("�����α�");
		MenuItem edit_paste = new MenuItem("���̱�");
		
		Menu test = new Menu("�߶󳻱�"); // �޴��� �޴��� �޴��� ���̱�.
		MenuItem test_out = new MenuItem("�߶󳻱�1");
		MenuItem test_out2 = new MenuItem("�߶󳻱�2");
		
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		test.add(test_out);
		test.add(test_out2);
		
		file.add(edit);  // add(edit) �� �� �༭ file �� �ٿ��༭ �޴��� �޴��� �� �� �־���
		file.add(test);
		edit.add(test);
		
		mb.add(file);  // �� ������ mb(�޴���) �� �ٿ���� ������ �޴��ٿ� �پ���
		
		setMenuBar(mb);		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu_2_1("Menu Test");
	}

}