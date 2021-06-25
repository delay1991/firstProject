package conditions;

public class ForExample3 {
	public static void main(String[] args) {
		// 1~50 까지 중 2또는 3의 배수 합을 구하시오.

		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			
			if(i%2 ==0 || i%3==0) {
				sum = sum +i;
			System.out.println("i:"+i+", sum:"+sum);
		}
			System.out.println(sum);
	}
	}
}
