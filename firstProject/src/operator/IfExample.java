package operator;

public class IfExample {
	public static void main(String[] args) {
//	if (조건을만족하면) {실행한다}
		int v1 = 30;
		int v2 = 30;
		
		if(v1> v2 ) {
			System.out.println("v1이 v2보다 큽니다.");
		} else if(v1 ==v2) {
			System.out.println("v1과 v2는 같습니다.");
		}
		//추가는 else if이며, 마지막에 else가 온다
		else {
			System.out.println("v2가 v1보다 큽니다.");
		}
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동"); //문자열 비교시 클래스일경우 .equals
		
		if(str1.equals(str3)) {
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다.");
		}
		
		System.out.println("end of prog");
	}
}
