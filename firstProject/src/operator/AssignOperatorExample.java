package operator;

public class AssignOperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		val1++;
		val1 = val1 +2;
//		val1 += 2; : a = a+2와 같은의미, 누적시키기

		val1--;
		val1 = val1 -3;
//		val1 -=3;
		
		val1 = val1 * 2;
//		val1 *=2;
		System.out.println(val1);
	
		String str1 ="A";
		str1 = str1 + "B";
//		str1 += "C";
		System.out.println(str1); //문자열은 숫자랑다르게 같이써짐

		
		String msg =""; 
		if(val1 %2 ==0) {
			msg ="짝수";
		} else {
			msg ="홀수";
		}
		System.out.println(val1 + "은 "+ msg + "입니다.");
		
		msg = (val1 % 2 ==0) ? "짝수" : "홀수";
		
	}
	
	
	
	
}
