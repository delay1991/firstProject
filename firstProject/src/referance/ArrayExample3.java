package referance;

import java.util.Scanner;

public class ArrayExample3 {

	static int n = 25;
	static int[] intAry = new int[n];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// 중복값제거.
		for (int i = 0; i < intAry.length; i++) {
			boolean pass = true;
			intAry[i] = (int) (Math.random() * n) + 1;
			// 이전값과 비교.
			for (int j = 0; j < i; j++) { // j--가 되려면 랜덤값을 forfor안으로 넣는다. ㅠㅠ....
				if (intAry[i] == intAry[j]) {
					pass = false;
					break;
				}
				if (!pass) {
					i--;
				}
			}// 동일한 값있으면 for반복문 벗어나기.
		} 

//		intAry[0] = 0;
//		intAry[4] = -1;
// 화면출력
		for (int i = 0; i < intAry.length; i++) {
			show(i);
			if (i % 5 == 4) {
				System.out.println();

			}

		}
		while(true) {
			System.out.println("숫자 10을 찾으세요(0~24) >>");
			int idx = scn.nextInt();
			if (idx > 24 || idx < 0) {// 잘못된범위값을 입력한경우
				System.out.println("잘못된값을 넣었습니다.(0~24까지의 값)");
				continue; // continue 아래부분실행하지않고 다시 반복의 처음으로
			}
			if (intAry[idx] == 10) {
				System.out.println("찾았습니다.");
				break;
			} else {
				intAry[idx] = 0;
			}

			for (int i = 0; i < intAry.length; i++) {
				show(i);
				if (i % 5 == 4) {
					System.out.println();
				}

			}
		}
		System.out.println("프로그램종료");
	}// main

	// prinf
	// %2d: intAry를 받아, 숫자를 두칸으로표현

	public static void show(int idx) {
		if (intAry[idx] > 0) {
			System.out.printf("(%2d)", idx);
		} else {
			System.out.printf("(**)", idx);
		}

	}
}
