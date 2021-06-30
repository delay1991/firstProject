package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동"); // p1.name="홍길동";
		p1.age = 10;
		p1.setHeight(1);// p1.height=180.3; 필드값이아닌 메소드값을 가져옴

//		System.out.println(p1.name+","+p1.age+","+p1.height);
//		ctrl : 1_ 2_객체선언쪽

		Person p2 = new Person();
		p2.setName("박길동");
		p2.age = 30;
		p2.setHeight(185.4);
		p2.bloodType = "A";

		Person p3 = new Person();
		p3.setName("김지연");
		p3.age = 11;
		p3.setHeight(111.1);
		p3.bloodType = "AAA";

		Person[] persons = { p1, p2, p3 };

		// 새로운 인스턴스 (사람)선언 : 여러분정보를 담아서~
		for (int i = 0; i < persons.length; i++) {
			// 혈액형이 A인 사람만 조회.

			if (persons[i].age >= (25)) { // (persons.bloodType == ("A"))
				persons[i].showInfo();
				System.out.println(persons[i].getInfo());

			}
		}
	}
}
