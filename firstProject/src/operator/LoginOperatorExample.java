package operator;

public class LoginOperatorExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 60 && score < 70) {
			System.out.println("D");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		}else if(score >= 90) {
			System.out.println('A'); // 'a' "aaa" 차이
		}else{
			System.out.println("fail");
		}
	}
}
