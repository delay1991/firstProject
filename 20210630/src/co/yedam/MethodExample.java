package co.yedam;

public class MethodExample {
	public static String makeUsefulInfo(String str) { // (매개변수)
		String[] info = str.split(" ");
		String name = info[0]; // 홍길동
		String birth = info[1]; // 19901010
		String phone = info[2]; // 01000001234;

		name = "이름 :" + name;
		birth = "\n생일:" + birth.substring(0, 4) + "년" + birth.substring(4, 7);
		phone = "\n전화:" + phone.substring(0, 3) + "-" + phone.substring(3, 6)+ "-" + phone.substring(6, 10);
		String result;
		result = name;
		result += birth;
		result += phone;
		
//		System.out.println("----------");
		return result;
	}

	public static void main(String[] args) {
		String str1 = new String("홍길동 19901010 0100001234");
		String result = makeUsefulInfo(str1); // 매개값
		System.out.println(result);
		
		String str2 = new String("박길동 19901010 0100001234");
		System.out.println(makeUsefulInfo(str2));
		
		String str3 = new String("김길동 19901010 0100001234");
		makeUsefulInfo(str3);
		
		System.out.println("프로그램종료");
	}

}
