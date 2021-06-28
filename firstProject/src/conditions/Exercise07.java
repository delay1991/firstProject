package conditions;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------");
			System.out.println("1.예금|2.출금|3.잔액|4.종료");
			System.out.println("--------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("예금처리");
				System.out.println("금액입력 >>");
				int temp = scn.nextInt();
				
				if(balance+temp>100000) {
					System.out.println("입금제한");
				}else {
					balance = balance + temp;
					System.out.println("입금액>>" + balance);
				}
				

			} else if (menu == 2) {
				System.out.println("출금처리");
				System.out.println("출금액입력 >>");
				int temp = scn.nextInt();

				if (temp > balance) {
					System.out.println("출금불가");					
				} else					
					balance = balance - temp;

				System.out.println("출금액>>" + temp);
				System.out.println("출금 후 잔액: "+balance);
 
			} else if (menu == 3) {
				System.out.println("잔액조희처리");
				System.out.println("현재잔액:" + balance);

			} else if (menu == 4) {
				break; // else하면 n+4로 표시됌
			}
		} // end of while
		System.out.println("프로그램 종료");
	}// end of main
}// end of class
