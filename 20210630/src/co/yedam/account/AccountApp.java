package co.yedam.account;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

// 데이터를 담아놓기 위한 Account
// 컨트롤 입금, 출금 => 사용자의 입력으로 메뉴를 실행.
public class AccountApp {
//필드
//	public AccountApp(String str){} //생성자선언
//	public AccountApp() { //생성자 선언하면 기본생성자도 선언해줘야 활용가능
//		
//	}

	static AccountApp app = new AccountApp();

	public static AccountApp getInstance() {
		return app;
	}

	private AccountApp() { // private Account만쓰면 main에서 활용X

	}

	Account[] accounts = new Account[10];
	Scanner scn = new Scanner(System.in);
	File file = new File("accountList.txt");

//메소드
	private void printMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.파일저장 6.파일열기 7.종료");
		System.out.println("-----------------------------------------------------");
		System.out.print("선택> ");
	}

	private void creatAccount() {
		String ano = Utils.ScanString("계좌번호 입력>>");
		System.out.print("예금주 이름>>");
		String owner = scn.nextLine();
		System.out.print("금액 입력>>");
		String amount = scn.nextLine(); // "1000" > 1000
		Account acnt = new Account(ano, owner, Integer.parseInt(amount));
//		acnt.setAno(ano);
//		acnt.setOwner(owner);
//		acnt.setBalance(Integer.parseInt(amount)); //문자열로 되어있는 숫자를 int 숫자로 전환.

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = acnt;
				System.out.println("한건 입력되었습니다.");
				break; // 비어있는 위치에 한건 입력후 종료.
			}
		}
	}// end of creatAccount

	private void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.println("accounts정보: " + accounts[i].getAno() + "," + accounts[i].getOwner() + ","
						+ accounts[i].getBalance());
			}
		}
	}// end of accountList

	// 계좌번호(ano)를 입력 해당계좌를 반환해주는 메소드.
	private Account findAccount(String ano) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAno().equals(ano)) {
				return accounts[i];
			}
		}
		return null;

	}

	private void deposit() {
		String ano = Utils.ScanString("계좌번호 입력>>");
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌가 없습니다.");
		} else {
			String amt = Utils.scanNumberString("예금액을 입력>>");
			int balance = acnt.getBalance();
			acnt.setBalance(balance + Integer.parseInt(amt));
			System.out.println(amt + "원이 예금되었습니다.");

		}
	}

	private void withdraw() {
		String ano = Utils.ScanString("계좌번호 입력>>");
		Account acnt = findAccount(ano);
		if (acnt == null) {
			System.out.println("해당 계좌가 없습니다.");
		} else {
			System.out.println("출금액을 입력>>");
			String amt = scn.nextLine();
			int balance = acnt.getBalance();
			if (balance <= Integer.parseInt(amt)) {
				System.out.println("출금에러");
			} else {

				acnt.setBalance((balance - Integer.parseInt(amt)));
//				acnt.setBalance(acnt.getBalance()-Integer.parseInt(amt));
				System.out.println(Integer.parseInt(amt) + "원이 출금되었습니다.");
			}
		}

	}

	private void fileSave() {
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					Account account = accounts[i];
					String val = account.getAno() + "," + account.getOwner() + "," + account.getBalance() + "\n";
					os.write(val.getBytes());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.flush();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void fileOpen() {
		Reader is =null;
		try {
			is = new FileReader(file);
			int readByte =0;
			StringBuffer sb= new StringBuffer();
			while((readByte = is.read()) != -1){
				sb.append((char) readByte);
			}
				String[]acnts=sb.toString().split("\n");
				for(int i=0; i<acnts.length; i++) {
					String[]acnt = acnts[i].split(",");
					accounts[i]=new Account(acnt[0], acnt[1], Integer.parseInt(acnt[2]));
				}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void exe() {
		boolean run = true;
		// 1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
		while (run) {
			printMenu();
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {
				System.out.println("계좌생성");
				creatAccount();
			} else if (selectNo == 2) {
				accountList();
				System.out.println("계좌목록");
			} else if (selectNo == 3) {
				System.out.println("예금");
				deposit();
			} else if (selectNo == 4) {
				System.out.println("출금");
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("파일저장");
				fileSave();
			} else if (selectNo == 6) {
				fileOpen();
			} else if (selectNo == 7) {
				run = false;
			}

		}
		System.out.println("프로그램종료");
	}

}