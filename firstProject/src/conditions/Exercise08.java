package conditions;

import java.util.Scanner;

public class Exercise08 {
	// 필드
	static int balance = 0;
	static Scanner scn = new Scanner(System.in);

	public static boolean checkAdmin(String id, String pass) {
		if (id.equals("admin") && pass.equals("1234")) {
			return true;
		}
		return false;
	}

	public static void printMenu() {// return값없는 클래스 void
		System.out.println("--------------------");
		System.out.println("1.예금|2.출금|3.잔액|4.종료");
		System.out.println("--------------------");
		System.out.println("선택>");
	}

	public static void deposit() {
		System.out.println("금액입력 >>");
		int temp = scn.nextInt();

		if (balance + temp > 100000) {
			System.out.println("입금제한");
		} else {
			// balance = balance + temp;
			balance = add(balance, temp);
			System.out.println("입금액>>" + balance);
		}
	}

	public static void withdraw() {
		System.out.println("출금액입력 >>");
		int temp = scn.nextInt();

		if (temp > balance) {
			System.out.println("출금불가");
		} else
			balance = add(balance, -temp);
		// balance = balance - temp;

		System.out.println("출금액>>" + temp);
		System.out.println("출금 후 잔액: " + balance);
	}

	public static int add(int balance, int amount) {
		int sum = balance + amount;
		return sum;
	}

	public static void main(String[] args) {
		// main 간결하게 메소드로 연결 ex)checkAdmin

		boolean run = false;

		do {// id, pass -> admin, 1234값이 들어오면 실행|아닐시 종료
			if (!run) {

				System.out.println("id입력>>>");
				String id = scn.nextLine();
				System.out.println("password입력>>");
				String pass = scn.nextLine();

				run = checkAdmin(id, pass); // ctrl 누르면 위치알림, return값이 포함된것 호출 : t/f 뱉으니 담을수있다.
			} else {
				// 메뉴출력.
				printMenu(); // 메소드 호출. return값을 반환해줄수없어서 담을수없다.
				int menu = scn.nextInt();
				if (menu == 1) {
					System.out.println("예금처리");
					deposit();
				} else if (menu == 2) {
					System.out.println("출금처리");
					withdraw();

				} else if (menu == 3) {
					System.out.println("잔액조희처리");
					System.out.println("현재잔액:" + balance);

				} else if (menu == 4) {
					run = false; // else하면 n+4로 표시됌
				}

			}
		} while (run); // end of while
		System.out.println("프로그램 종료");
	}// end of main
}// end of class
