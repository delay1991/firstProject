package conditions;

public class ForExample4 {
	public static void main(String[] args) {

		ForSum();
		
	}

	public static void WhileSum() {
 		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if (i % 2 == 0)
				sum += i;
			i++;

		}
		System.out.println("1~10까지 짝수 합계: " + sum);
	}

	public static void ForSum() {
		// 1부터 10까지 i변수 활용
		// int sum =0;
		// 1~10까지 홀수 값

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1)
				sum += i;
			System.out.println("sum>"+sum+",i>"+i);

		}
		System.out.println("1~10까지 홀수 합계: " + sum);
	}
}
