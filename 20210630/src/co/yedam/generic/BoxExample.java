package co.yedam.generic;

class Orange { // 제네릭대상: 클래스
	int price;
}

public class BoxExample {// 모든유형의 데이터타입을 사용하는 시점에, 지정해 캐스팅x 타입오류일으키지않도록!
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setObj(10);
		Integer val = box.getObj();

		Box<String> boxx = new Box<String>();
		boxx.setObj("10");
		String val2 = boxx.getObj();

		Box<Orange> box1 = new Box<Orange>();
		box1.setObj(new Orange());
		Orange ora = box1.getObj();

		// int => Integer 숫자를 클래스로 10 <== (new Integer(10))
		// byte => Byte
		// double => Double 래퍼클래스?
	}
}
