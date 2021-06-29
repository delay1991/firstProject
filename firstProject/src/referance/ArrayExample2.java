package referance;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 크기순 정렬하기

		int num1 = 25; // (int)(Math.random()*25);
		int num2 = 22;
		int num3 = 29;

		int[] intAry = new int[3]; // 초기값할당으로 0이 3개가 들어감

		if (num1 > num2) {
			if (num1 > num3) {
				intAry[0] = num1;
				if (num2 > num3) { // 1>2>3
					intAry[1] = num2;
					intAry[2] = num3;
				} else if (num2 < num3) { // 1>3>2
					intAry[1] = num3;
					intAry[2] = num2;
				}
			}
		} if (num1 < num2) {
			intAry[0] = num2;
			if (num1 > num3) { // 2>1>3
				intAry[1] = num1;
				intAry[2] = num3;
			} else if (num1 < num3) {// 2>3>1
				intAry[1] = num3;
				intAry[2] = num1;
			}
		}
		if (num3 > num1) {
			intAry[0] = num3; 
			if (num1 > num2) { //3>1>2
				intAry[1] = num1;
				intAry[2] = num2;
			} else if (num1 < num2) { //3>2>1
				intAry[1] = num2;
				intAry[2] = num1;

			}
		}
		System.out.println(intAry[0] + "," + intAry[1] + "," + intAry[2]);
	}// main
}// class