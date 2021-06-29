package referance;

public class ArrayExample5 {
	public static void main(String[] args) {
		// 배열을 선언. 학생의 점수 scores
		// 평균점수와 가장 높은 점수를 구하하는 것.

		int[] scores = { 90, 80, 84 }; // 3개의값
//		for (int i = 0; i < scores.length; i++) {
//			scores[i] = (int) (Math.random() * 20) + 80;
//		}

		double avg = 0.0;
		int maxValue = 0;
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
			if (maxValue < scores[i]) {
				maxValue = scores[i];
				
			}
		}

		avg = sum / 3.0;

		System.out.println("평균은" + avg);
		System.out.println("최고점수는 " + maxValue);

	}
}
