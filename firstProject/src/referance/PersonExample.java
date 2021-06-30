package referance;

public class PersonExample {
public static void main(String[] args) {
	Person ohj = new Person(); //실제 존재를 만듦-> 인스턴스화(개체), Person클래스는 새로운타입의데이터유형
	ohj.name = "홍길동";
	ohj.age = 20;
	ohj.height =167.4;
	ohj.weight =50;
//	ohj.birth="2020"; Person필드에없어서 사용불가

	ohj.walk();
	ohj.sleep();
	ohj.showInfo(); //메소드는 출력함
	
	Person psy = null; //실체가없는데 할당되서 오류남 ㅠㅠ....
	psy.walk();
}
}
