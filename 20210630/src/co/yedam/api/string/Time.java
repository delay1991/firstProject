package co.yedam.api.string;

import java.text.MessageFormat;

public class Time {
	public static void main(String[] args) {
		
		String data = "회원ID: {0} \n회원이름: {1} \n회원전화: {2}";
		System.out.println(MessageFormat.format(data, "123","홍길동", "123-1234"));
		
		System.out.format("회원ID: %s \n회원이름: %s \n회원전화: %s", "123", "홍길동", "123-1234");
	}

}
