package referance;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 38, 22, 52 };
		System.out.println("배열크기" + intAry.length);
		System.out.println(intAry[0]);
		intAry[0] = 11;
		
		int sum=0;
		int maxValue=0;
		//규칙 중요합니다'~'
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry[" + i + "]의 값: " + intAry[i]);
			sum+=intAry[1];
			if(maxValue < intAry[i]) {
				maxValue = intAry[i];
			}//max에 배열의 각 값비교후 큰값을 max에 대입
			
		}System.out.println("합계:"+sum);
		 System.out.println("가장큰값:"+maxValue);
		 
		 
//		double[] dblAry = {1.0, 2.0, 3.0};
//		String[] names = {"Hong", "Kim", "Park"};
//		names[0]="Hwang";
//		
//		//향상된 for문 : names에 담긴 값을 다 출력.
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
//		for(double num : dblAry) {
//			System.out.println(num);
//		}
	}//end of main
}//end of class
