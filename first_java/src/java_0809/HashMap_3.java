package java_0809;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3 {

	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNO("친구", "이민주", "010-3596-1235");
		addPhoneNO("친구", "강하나", "010-3325-8942");
		addPhoneNO("친구", "강하나", "010-5569-8547");
		addPhoneNO("친구", "강해진", "010-4578-1561");
		addPhoneNO("회사", "송주안", "010-8547-1205");
		addPhoneNO("회사", "진   영", "010-2157-9141");
		addPhoneNO("회사", "한   강", "010-5849-2610");
		addPhoneNO("회사", "한지원", "010-4502-6589");
		addPhoneNO("세탁", "010-4356-9018");

		printList();

	}

// 전화번호부 전체를 출력
	private static void printList() {
		Set set = phoneBook.entrySet();
		Iterator itt = set.iterator();

		while (itt.hasNext()) {

			Map.Entry e = (Entry) itt.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();

			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Entry) subIt.next();

				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();

				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}

	private static void addPhoneNO(String name, String tel) {
		addPhoneNO("기타", name, tel);
	}

	private static void addPhoneNO(String groupName, String name, String tel) {
		addGroup(groupName);

		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}

	private static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {  // 그룹명이 존재하지 않으면 그룹명으로 HasMap 을 만들겠다
			phoneBook.put(groupName, new HashMap());
		}
	}
}
