package conditions;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		// 임의의 수 1,2,3 생성. 1: 가위, 2: 바위 ,3: 보
		// 사용자 값을 입력.. 2입력
		// 임의의 값 = 사용자 입력값 비교 : 맞을시 정답! 틀릴시 실패!

//		int val = (int) (Math.random() * 3 + 1);

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자입력");

//		int val1 = scanner.nextInt();
//		System.out.println("입력값:" + val1);

//		if (val1 == 2) {
//			System.out.println("정답입니다");
//		} else {
//			System.out.println("오답입니다");
//		}

//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("123 중 하나입력");
//		String name = scanner.nextLine();
//		System.out.println("입력값: " + name); // == equls()

//		if ("1".equals(name)) {
//			System.out.println("가위");
//		} else if ("2".equals(name)) {
//			System.out.println("바위");
//		} else if ("3".equals(name)) {
//			System.out.println("보");
//		}

		int ran = (int) (Math.random() * 3) + 1;
		String anyVal = "";
		if (ran == 1) {
			anyVal = "가위";
		} else if (ran == 2) {
			anyVal = "바위";
		} else if (ran == 3) {
			anyVal = "보";
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 입렵>");
		String ran1 = scanner.nextLine();

	
		if (anyVal.equals(ran1)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

	
	}
}
