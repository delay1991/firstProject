package conditions;

import java.util.Scanner;

public class homeforfor {
public static void main(String[] args) {
	
	for(int i=2; i<=9; i++) {
		
		for(int j=1; j<=9; j++) {
			System.out.println(i+"단> "+i+"x"+j+"="+i*j+"\t");
		}
		System.out.println();
	}
}



public static void ex1(){
	
	Scanner s = new Scanner(System.in);
	System.out.println("구구단 몇단을 출력할까요? >>");
	int dan = s.nextInt();
	
	if(dan<=1 && dan <10 ) {
		System.out.println("2~9단 사이를 입력하세요.");
	}else {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"단: "+dan+"x"+i+"="+ (dan*i));
		}
	}
	}
}
