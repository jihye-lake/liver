package java_0814;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStream_1 {
	public static void main(String[] args) throws Exception {
		
		String str, date_str, date_str2;
		Date date;
		
		FileInputStream fis = new FileInputStream("c:\\temp_1\\obbb_1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.print(ois.readInt());
		
		str = (String) ois.readObject();
		
		System.out.print("\n" + str);
		
		date = (Date) ois.readObject();
		
		date_str = (date.getYear() + 1900) + "�� ";
		date_str += (date.getMonth()+1) + "�� ";
		date_str += (date.getDate()) + "�� ";
		date_str += "\n����Ư���� ������ ��¼�� �ӽñ�";
		System.out.println(date_str);
		date_str2 = "������ �ٺ� :P";
		System.out.print(date_str2);
		
		ois.close();
		
	}

}
