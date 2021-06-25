package conditions;

import java.util.Scanner;

public class WhileExample5 {
	public static void main(String[] args) {
		int ran = (int) (Math.random() * 3);
		String rsp = "";
		if (ran == 0) {
			rsp = "가위";
		} else if (ran == 1) {
			rsp = "바위";
		} else if (ran == 2) {
			rsp = "보";
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("가위,바위,보 >>>>");
		String str = scn.nextLine();

		// 조건문...컴퓨터 가위바위보 <=> 사용자 가위바위보= win/same/lose

		if (rsp.equals(str)) {
			System.out.println("same");
		} else {
			if (rsp.equals("가위")) {
				if (str.equals("바위")) {
					System.out.println("win");
				} else if (str.equals("보")) {
					System.out.println("lose");

					if (rsp.equals("바위")) {
						if (str.equals("가위")) {
							System.out.println("lose");
						} else if (str.equals("보")) {
							System.out.println("win");
							if (rsp.equals("보")) {
								if (str.equals("바위")) {
									System.out.println("lose");
								} else if (str.equals("가위")) {
									System.out.println("lose");

								} 
								
							}
							
						}
					}
				}
			}
		} System.out.println("컴퓨터:" + rsp+","+ "사용자:" +str);
	}
}
