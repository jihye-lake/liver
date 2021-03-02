package java_0809;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		Set set2 = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45 + 1);
			set.add(new Integer(num));			
		}
		System.out.println(set);
		
		System.out.println();
		
		
		for (int i = 0; set2.size() < 6; i++) {
			int num = (int)(Math.random()*45 + 1);
			set2.add(new Integer(num));			
		}
		System.out.println(set2);
		
//		for (int i = 0; i < set2.size()-1; i++)
//			System.out.println(set2.get(i));
//			
//			System.out.print(" \n 2µî ´çÃ· ¹øÈ£ : ");
//			System.out.println(set2.get(set2.size()-1));
	}
	
}
