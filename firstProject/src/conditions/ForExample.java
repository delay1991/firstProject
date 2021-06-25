package conditions;

public class ForExample {
//	반복횟수알땐 for가 좋고, while은 break넣기

	public static void main(String[] args) {
		// 1 ~10 합을 구하는 프로그램.
		int sum = 0;
		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(i);
				System.out.println("현재 sum :" + sum);
//		System.out.println("안녕하세요"); *5

				try {
					Thread.sleep(500); // 0.5초기다림
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if(i ==5) {
				break;
			}
		}
		System.out.println("현재 sum :" + sum);
	}
}