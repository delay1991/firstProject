package referance;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int studentNum = 0;
		int[] scores = null;
		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 >>");

			int selectNo = s.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수>>");// 배열크기등장
				scores = new int[s.nextInt()];
				
				//studenNum =s.netInt(0);
				//score=new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores" + "(" + i + ") :");
					scores[i] = s.nextInt();

				}
			} else if (selectNo == 3) { //1>2 실행후 3,4,5된다

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores" + "(" + i + ") :" + scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				int maxValue = 0;
				double avg = 0.0;

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (maxValue < scores[i]) {
						maxValue = scores[i];
					}

				}
				avg = (double) sum / scores.length;

				System.out.println("최고점수 :" + maxValue);
				System.out.println("평균점수 :" + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}// main
}// class
