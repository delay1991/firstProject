package co.yedam.account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

	// 사용자가 입력한 값을 문자열로 반환.
	public static String ScanString(String arg) {
		System.out.println(arg);
		String val = scn.nextLine();
		return val;
	}

	public static String scanNumberString(String arg) { //메세지출력
		String val="";
		while (true) {
			System.out.println(arg);
			val = scn.nextLine(); //숫자나 문자열
			try {
				Integer.parseInt(val); // 1000, 1200
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}
		}
		return val;

	}
}
