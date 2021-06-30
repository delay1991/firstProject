package referance;
// 현실세계의 사람(Object) => 필드, 메소드로 구현

public class Person { //클래스에 대한 개념정의.
	//필드
	int age;// 나이 
	String name;// 이름 
	double height;// 키 
	double weight;// 몸무게 

	//메소드
	void walk() { //()안에 주석처리안됌. ()기능
		System.out.println("걷습니다.");
	}
	void sleep() {
		System.out.println("잠을 잠니다.");
	}
	void showInfo() {
		System.out.println("이름은"+name+"나이는"+age+"입니다.");
	}
}
