package co.yedam.modifier;

public class Example {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.getName();// 동일한 패키지내에는 호출가

		Student s1 = new Student("홍길동");//디폴트 생성자 프라이빗이라 안됌.
	}
}
