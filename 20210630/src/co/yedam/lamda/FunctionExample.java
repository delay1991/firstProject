package co.yedam.lamda; //람다식은 함수적인터페이스(ex. 자바스크립트)

@FunctionalInterface // 오버라이딩규칙 체크하는것처럼 @~적으면 체크체크!!!!!!!!해줌
interface Runnable { // 인터페이스는 기능만 구현
	String run(String name);
//	void swim(); 구현해야할 메소드가 하나만 있는 인터페이스여야 한다. 
}

class Runclass implements Runnable {
	@Override
	public String run(String name) {
		System.out.println(name + "가 달립니다.");
		return name + "화이팅!!";
	}

}

public class FunctionExample {
	public static void main(String[] args) {
		Runnable runnable = new Runclass();
		String result = runnable.run("철수");
		System.out.println(result);
		runnable = new Runnable() { // 익명구현객체 : new 인터페이스(){}
			@Override
			public String run(String name) {
				System.out.println(name + "가 달립니다.");
				return name + "뭐야 ㅠㅠ";
			}
		};
		result = runnable.run("영희"); //매개변수, 리턴타입...종류별로 ㅠㅠ........
		System.out.println(result);

		runnable = (String name) -> { //자바스크립트 low?function??
			System.out.println(name + "가 달립니다.");
			return name + "뭐야 ㅠㅠ";
		}; // 람다표현식
		result = runnable.run("익명");
		System.out.println(result);
	}
}
