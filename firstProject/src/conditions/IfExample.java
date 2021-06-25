package conditions;

public class IfExample {
	public static void main(String[] args){ {
		System.out.println((int) (Math.random() * 6) + 1); // same
		int ran = (int) (Math.random() * 6) + 1; // 1~6 범위의 임의의값.
		if (ran == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (ran == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (ran == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (ran == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (ran == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if (ran == 6) {
			System.out.println("6번이 나왔습니다.");
		}
	}

//1~100 난수, score에 담아서 80b, 90a
	int score = (int) (Math.random() * 100) + 1; // random(0.n), +1 =100, 구조적으로 접근 

	if(score>=90)
	{
		if (score >= 95) {
			System.out.println("A+");
		} else {
			System.out.println("A");
		}
	}else if(score>=80)
	{
		if (score >= 85) {
			System.out.println("B+");
		} else {
			System.out.println("B");
		}
	}else if(score>=70)
	{
		if (score >= 75) {
			System.out.println("C+");
		} else {
			System.out.println("C");
		}
	}else if(score>=60)
	{
		if (score >= 65) {
			System.out.println("D+");
		} else {
			System.out.println("D");
		}
	}else
	{
		System.out.println("F");
	}
}}