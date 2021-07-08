package co.yedam.generic;

import java.util.ArrayList;
import java.util.List; //List컬렉션: 배열처럼 여러 인스턴스 저장.

public class BoxExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //리스트는 인터페이스, ArrayList는 구현객체라 타입이같음.
		// 배열[0]을 메소드로받음
		list.add("hello");
//		list.add(3); 컴파일단계에서 에러발생
//		list.add(new Orange()); //다른유형의 인스턴스도 가능한데 여러개를 동시에넣으면 위험?

		for (int i = 0; i < list.size(); i++) {
			String val = list.get(i); // list[i];
			System.out.println(val);
		}
		
		String[] names = new String[10];
		for(int i=0; i<names.length; i++) {
			names[i]= new String(""+i);
		}
		for(int i=0; i<100; i++) { //배열보다 사용하기편함. add/get/remove
			list.add(new String(""+i));
		}

	}
}
