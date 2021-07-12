package co.yedam.lamda;

import java.util.function.Consumer;
//function 패키지에 함수적인터페이스 유형별정의.
//Consumer : 매개값있음, 반환값없음.

public class ComsumerExample {// 매개값은 있는데 리턴값은 없는 유형.
	public static void main(String[] args) {
		Consumer<String> con = (String t) -> { //람다표현식.
			System.out.println(t);
		};
		con.accept("이것이 자바다ㅠㅠ");
	}

}
