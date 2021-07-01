package co.yedam;

public class Student {
	private String name;
	private int grade;
	private int EngilshScore;
	private int MathScore;

	public Student() { //매개값을 생성자 기본생성자. //인스턴스는 클래스이름과 동일
		
	}
	public Student(String name) { //매개값을 가지는 생성자.
		this.name = name;
	}
	public Student(String name, int grade) {
		this.name= name;
		this.grade = grade;
	}
	
	public Student(String name, int grade, int engilshScore, int mathScore) {
		this.name = name;
		this.grade = grade;
		EngilshScore = engilshScore;
		MathScore = mathScore;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getEngilshScore() {
		return EngilshScore;
	}

	public void setEngilshScore(int engilshScore) {
		EngilshScore = engilshScore;
	}

	public int getMathScore() {
		return MathScore;
	}

	public void setMathScore(int mathScore) {
		MathScore = mathScore;
	}

}