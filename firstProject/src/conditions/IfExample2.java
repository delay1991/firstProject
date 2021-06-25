package conditions;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// 사용자의 입력값을 읽어오는 클래스 Scanner , java.util.Scanner라고 써야하지만 import를 쓰면된다
		Scanner scanner = new Scanner(System.in); // 대문자 타입, 소문자 변수ex. int, System.in:키보드입력
		System.out.println("숫자입력..");
		int val = scanner.nextInt();
		System.out.println("입력값:" + val);

		// 홀수인지 짝수인지 구분하든 코드.
		if (val % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	} //end of main
}//end of class
