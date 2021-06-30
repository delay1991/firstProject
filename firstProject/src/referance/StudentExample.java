package referance;

import co.yedam.Person;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.setName("홍길동");
		s1.setGrade(1);
		s1.setEngilshScore(20);
		s1.setMathScore(45);

		s2.setName("박길동");
		s2.setGrade(2);
		s2.setEngilshScore(22);
		s2.setMathScore(55);

		s3.setName("김길동");
		s3.setGrade(3);
		s3.setEngilshScore(24);
		s3.setMathScore(66);

		// 최고의 영어점수- 이름
		Student[] student = { s1, s2, s3 };
		int maxvalue = 0;
		Student maxStudent = null;

		for (int i = 0; i < student.length; i++) {
			if (student[i].getMathScore() > maxvalue ) {
				maxvalue = student[i].getMathScore();
				maxStudent = student[i];
				
			}//ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
		}System.out.println("최고수학점수"+maxvalue +maxStudent.getName()+maxStudent.getEngilshScore());
	}
}