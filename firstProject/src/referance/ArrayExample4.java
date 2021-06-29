package referance;

import java.util.Scanner;

public class ArrayExample4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] names = new String[5];
		names[0] = "Hong"; // 첫번째.
		names[1] = "Hwang";// 두번째.
		names[2] = "Park";// 세번째.
		names[3] = "Kim";// 네번째.
		names[4] = "Choi";// 다섯번째.

		String[] orders = new String[5];
		orders[0] = "첫번째";
		orders[1] = "두번째";
		orders[2] = "세번째";
		orders[3] = "네번째";
		orders[4] = "다섯번째";
		// Hong Enter => 첫번째 위치에 있습니다.
		// quit => 프로그램 종료.
		// Lee Enter => 이런이름은 없습니다.

		while (true) {
			boolean pass = false;
			System.out.println("이름을 입력하세요>>");
			String input = s.nextLine();
			if (input.equals("quit")) {
				break;
			}
			// 입력한 값이랑 배열에 들어있는 값을 비교..몇번째입니다
			for (int i = 0; i < names.length; i++) {
				if (input.equals(names[i])) {
					System.out.println(orders[i] + "입니다.");
					pass = true; // 똑같은값이있다.
				}
			}
			if(!pass) {
				System.out.println("같은 값이 없습니다.");
			}
		}

	}

}
