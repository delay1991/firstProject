package referance;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAry = new int[3]; // 배열크기만 선언.
		intAry = new int[] { 55, 65, 75, 85 }; // 각 값을 지정. intAry는 두라인의 거쳐서만듦. 주소할당후 값은 커도 상관없으나, 주소할당이 커질수는없다 
		intAry[2] = 88; // 배열이지만[]주소값넣어서 int타입, intAry=88;안됌
		intAry[1] = 90;

		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum = sum + intAry[i];
			
		}System.out.println("inAry의 합" + sum); //sysout 위치: for안에는 숫자만큼 반환하고, 한번하려면 밖에 위치
		int[] intAry2 = { 1, 2, 3, 4, 5 }; // 배열의 크기5에 각 위치에 값을 저장.
		intAry2 = new int[] {81, 82, 83, 84, 85};
		sum = 0;
		for (int i = 0; i < intAry2.length; i++) {
			sum = sum + intAry2[i];
		}
		System.out.println("inAry2의 합" + sum);

//for (int i = 0; i < 3; i++) {
//			System.out.println("값입력>>>");
//			int num = scn.nextInt();
//		intAry[i] = num;
//	}
//
//	 System.out.println(intAry[0]);
//	 System.out.println(intAry[1]);
//	 System.out.println(intAry[2]);
//	 System.out.println(intAry[3]);
//	 System.out.println(intAry[4]);
//	}
//	public static voidaryExam() {
//		int[] scores= new int [5]; //정수 스코어 5개를 담을 공간을 만들어주오.
//		scores[0]=70;
//		scores[1]=75;
//		scores[2]=80;
//		scores[2]=88;
//		scores[3]=85;
//		scores[4]=90;
//		
//		int sum =0;
//		for(int i=0; i<5; i++) {
//			System.out.println(scores[i]);
//			sum+= scores[i];
//		}double avg = sum / 5.0;
//			System.out.println(avg);
//	}
//
//	public static void intex() {
//		int score1 = 70;
//		int score2 = 75;
//		int score3 = 80;
//		score3 = 88;
//		int score4 = 85;
//		int score5 = 90; // 학생 n명일경우 n번작성
//		int sum = 0;
//		sum = score1 + score2 + score3 + score4 + score5;
//		double avg = sum / 5.0;
//		System.out.println("평균:" + avg);
//		
	}
}
