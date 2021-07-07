package co.yedam.friend;

import java.util.Scanner;

public class FriendListApp {

	static Friend[] friends = new Friend[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 1.추가 2.리스트 3.종료
		boolean run = true;
		while (run) {
			System.out.println("====================");
			System.out.println("1.추가 2.리스트 3.종료");
			System.out.println("====================");
			System.out.print("선택> ");
			String selectNo = scn.next(); // next는 스트링타입
			switch (selectNo) {
			case "1":
				System.out.println("1.친구 2.학교친구 3.회사친구");
				String menu = scn.next();
				Friend friend = null;

				System.out.println("이름>>> ");
				String name = scn.next();
				System.out.println("연락처>>> ");
				String phone = scn.next();

				if (menu.equals("1")) {
					friend = new Friend(name, phone); // Friend 인스턴스.

				} else if (menu.equals("2")) {
					System.out.println("전공명>>> ");
					String major = scn.next();
					friend = new UnivFriend(name, phone, major);

				} else if (menu.equals("3")) {
					System.out.println("부서명>>> ");
					String department = scn.next();
					friend = new ComFriend(name, phone, department);
				}
				// 배열에 저장.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break; // for 빠짐
					}
				}
				break; // switch 빠짐

			case "2":
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.print(friends[i].toString());
						System.out.println();
					}
					
				}
				break;
			case "3":
				run = false;
			}
		}
		System.out.println("프로그램 종료합니다.");
	}// main
}// class
