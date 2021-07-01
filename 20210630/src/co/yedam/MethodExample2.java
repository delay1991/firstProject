package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		String name = p1.getName();

//		p1.getSum(p1.getSum(10,20), p1.getSum(5, 5)); 과 같은말
		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);

		System.out.println("결과" + result);

		// 10~20
		n1 = p1.getFrom10To20();
		System.out.println(n1);
		n2 = p1.getFromTo(n1, n2);
		System.out.println(n2);
		String nameAndAge = p1.getNameAndAge("홍길동", 22);
		System.out.println(nameAndAge);

		Person newPerson = p1.creatNewPerson("오혜지", 20);
		newPerson.setHeight(167.8);
		newPerson.setBloodType("A");
		System.out.println(newPerson.getInfo());
		
		Person anotherPerson = p1.creatNewPerson("권가영", 20, 165.3);
		anotherPerson.setBloodType("AB");
		System.out.println(anotherPerson.getInfo());
		
		Person theOtherPerson = p1.creatNewPerson("안의정", 20, 165.3, "A");
		System.out.println(anotherPerson.getInfo());
		
	}
}
