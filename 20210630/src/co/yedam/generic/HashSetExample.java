package co.yedam.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("박지현");
		names.add("박현진");

		System.out.println("크기: " + names.size());

		Iterator<String> iter = names.iterator(); // 반복자생성해주는 메소드.
		while (iter.hasNext()) {

			String val = iter.next();
			System.out.println("값: " + val);
		}

		System.out.println("===============================");
		names.add(new String ("안의정"));
		names.add("안의정"); 
		iter = names.iterator(); //반복자는 한번만...가능해서 
		while (iter.hasNext()) { 

			String val = iter.next();
			System.out.println("값: " + val);
		}
		System.out.println("프로그램종료");
	}
}
