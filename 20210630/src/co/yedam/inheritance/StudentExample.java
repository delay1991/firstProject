package co.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
		System.out.println("Student:" + std.getName() + "," + std.getStudNo());

		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
//		System.out.println(
//				"HighStudent: " + highStd.getName() + "," + highStd.getStudNo() + "," + highStd.getSchoolName());

		Student[] students = new Student[3];
		students[0] = std;
		students[1] = highStd;

		students[0].getName();
		students[0].getStudNo();
		if (students[0] instanceof HighStudent) {
			HighStudent hsx = (HighStudent) students[0]; // students[0]의 인스턴스가 HighStudent것 인지 체크
			hsx.getSchoolName();
		} // if없이는 문법상0, 실행시오류classcastexception

		students[0].showInfo();
		System.out.println(students[0]);//tostring overriding
		
		students[1].getName();
		students[1].getStudNo();
//		students[1].getschoolName(); 
		if (students[1] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1]; // 부모클래스 강제형변환
			hs.getSchoolName();
			
		}

		students[1].showInfo();
		System.out.println(students[1]);
	}
}
