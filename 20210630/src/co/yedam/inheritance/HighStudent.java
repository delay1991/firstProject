package co.yedam.inheritance;

public class HighStudent extends Student{ //student(부모)<-high(자식), extends로 관계

	 //부모꺼 모두가져옴
	private String schoolName;
	//추가적으로 가능

	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	

	
}
