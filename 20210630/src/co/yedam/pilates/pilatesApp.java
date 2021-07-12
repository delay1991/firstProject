package co.yedam.pilates;

import java.util.Scanner;

public class pilatesApp {
	private static pilatesApp singleton = new pilatesApp();

	private pilatesApp() {
	}

	public static pilatesApp getInstance() {
		return singleton;
	}

	Member[] members = new Member[10];
	Scanner scn = new Scanner(System.in);

	public void main() {
		// 1입력, 2수정, 3삭제, 4회원리스트, 5상세조회, 6종료
		// 5>> 회원번호:1 이름:홍길동
		// 생년월일:980202 연락처:010-1111-1111
		// 성별:남자(여자)
		members[0] = new Member(1, "Hong", "010123123", "970101", Gender.man);
		members[1] = new Member(2, "Hwang", "010123123", "970101", Gender.man);
		members[2] = new Member(3, "gang", "010123123", "970101", Gender.woman);
		members[3] = new Member(4, "Choi", "010123123", "970101", Gender.man);

		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberMo();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 9) {
				break;
			}

		}
		System.out.println("프로그램 종료");
	} // main

	public void memberMo() {
		int memberId = scanInt("수정할 회원번호 입력>>");
		for (int i = 0; i < members.length; i++) {
			if (members[i].getMemberId() == memberId) {
				String name = scanSrting("이름 입력>>");
				if (!name.equals("")) {
					members[i].setMemberName(name);
				}
				String phone = scanSrting("연락처 입력 >>");
				if (!phone.equals("")) {
					members[i].setMemberPhone(phone);
				}
				String birth = scanSrting("생일 입력 >>");
				if (!birth.equals("")) {
					members[i].setMemberBirth(birth);
				}

			}
		}
	}

	// 이름 선택?가능? -엔터 ㅜㅜㅜㅜㅜㅜㅜ
	// 연락처
	// 생일
//회원정보가있는지?
	public void memberDelete() {
		int delId = scanInt("삭제할 회원번호 입력>>");
		for (int i = 0; i < members.length; i++) {

			if (members[i] != null && members[i].getMemberId() == delId) {
				members[i] = null;
				System.out.println("1건이 삭제 되었습니다.");
				break;
			}
		}
	}

	public void searchByName() {
		String name = scanSrting("조회할 이름 입력>>");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberName().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist)
			System.out.println("존재하는 이름이 아닙니다.");
	}

	public void memberList() {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // null이 아닌경우만 출력
				System.out.println(members[i].showInfo());
			}
		}
	}

	public void memberAdd() {
		String name = scanSrting("이름 입력>>>");
		String phone = scanSrting("연락처 입력>>>");
		String birth = scanSrting("생일 입력>>>");
		Gender gender = scanGen("성별 입력(1:남자, 2:여)>>>");

		Member member = new Member(getNextId(), name, phone, birth, gender); // 생성자로 바로처리? 매개값없는거 기본으로만듦>정의하면 사라짐

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {// 입력시 비워져 잇는 곳에 입력.
				members[i] = member;
				break; // 비워있는 위치에 한건 입력후 종료.
			}
		}

	}// add

	public Gender scanGen(String arg) { // 입력메세지 출력후, Gender 반환
		Gender gender = null;
		while (true) { // 예외발생시 에러메세지출력 다시입력
			try { // 정상시 실행
				System.out.print(arg);
				int gen = scn.nextInt();
				if (gen == 1) {
					gender = Gender.man;
				} else if (gen == 2) {
					gender = Gender.woman;
				} else {
					System.out.println("1 또는 2를 입력하세요.");
					continue; // 반복문 탈출못하도록
				}
				break;
			} catch (Exception e) { // 에러시실행
				System.out.print("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return gender;

	}

	public String scanSrting(String arg) { // 입력메세지 출력후, 문자입력값을 반환
		System.out.print(arg);
		String val = scn.nextLine();

		return val;
	}

	public int scanInt(String arg) {
		int val = 0;
		while (true) {
			try {
				System.out.println(arg);
				val = scn.nextInt();
				scn.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력");
				scn.nextLine();
			}
		}
		return val;

	}

	public int getNextId() {
		// 회원번호 가입순서 => 1,2,3, ,5,6 ...회원삭제후 4번삭제후 7부터만들어진다.
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				if (members[i].getMemberId() > memberId) {
					memberId = members[i].getMemberId();
				}
			}
		}
		memberId++;
		return memberId;
	}

	public void showMenu() {
		System.out.println("------------------------:");
		System.out.println("1.입력 2.수정 3.삭제 4.회원리스트 5.이름조희 9.종료");
		System.out.println("------------------------:");
		System.out.print("선택>>");

	}
}
