package co.yedam.inheritance;

public class HighStudent extends Student{ //student(부모)<-high(자식), extends로 관계

	//필드
	private String schoolName;

	//부모클래스에 매개값없는것 호출, 기본생성자없으면 에러남.
	public HighStudent() {
		super();
		System.out.println("HighStudent()");
	}
	
	public HighStudent (String name, int studNo, String schoolName){
		super(name, studNo); //student(String name, int studNo)
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override //부모클래스가 가지고 있는 메소드를 제정의(override)하겠습니다. 문법적오류가있는지 체
	public void showInfo(){
		System.out.println("이름은 "+getName()+"학생번호는 "+getStudNo()+"학교는 "+schoolName);
	
	}

	@Override
	public String toString() {
		return "HighStudent [Name()=" + getName() + ", StudNo()=" + getStudNo() + ", schoolName=" + schoolName
				+ "]";
	}

	

	
}
