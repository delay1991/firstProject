package co.yedam;

import java.util.Calendar;

public class CalExample {
	public static void main(String[] args) {

		int year =2021;
		int month= 3;
		printCal(year, month);
	}
	
public static void printCal(int year, int month) {
		
		System.out.println("\n"+ "       <<"+year+"년"+month+"월>>"+"\n");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);

		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		// 1~31 달력만들기

		printDays();// 요일 타이틀 보여주기
		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}
		

		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i); // f+% 공간4칸으로 맞추기
			if ((firstDay+i) % 7 == 1) {
					
				System.out.println();
			}
		}
		System.out.println();

//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + (cal.get(Calendar.MONTH) +1));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));
	}

	public static void printDays() {
		String[] days = { "Sun", "Mon", "Tue", "Wen", "Thr", "Fri", "Sat" }; // 요일정보
		for (String day : days) {
			System.out.print(" " + day);
		}
		System.out.println();
	}
}