package co.yedam.exercise;

public class schoolExample {
	public static void main(String[] args) {
		school s1 = new school();
		s1.setStudentNum(456); // 3개만들기
		s1.setStudentName("박길동");
		s1.setStudentPhone("01099999999");
		System.out.println(s1.getStudentNum() + "," + s1.getStudentName() + "," + s1.getStudentPhone());

		school s2 = new school(123, "홍길동"); // 2개만들기
		System.out.println(s2.getStudentNum() + "," + s2.getStudentName());

		school s3 = new school(103, "최길동");
		System.out.println(s3.getStudentName());

		school s4 = new school(104);

		school[] schools = new school[5];
		schools[0] = s1;
		schools[1] = s2;
		schools[2] = s3;
		schools[3] = s4;

		for (int i = 0; i < schools.length; i++) {
			if (schools[i] != null) {
				System.out.println(schools[i].getStudentNum() + "," + schools[i].getStudentName() + ","
						+ schools[i].getStudentPhone());
			}
		}

	}
}
