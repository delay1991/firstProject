package conditions;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("이름입력: ");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("입력이름:" + name);
		} while (false);
		{	
			System.out.println("프로그램종료.");
		}
	}// main
}// class