package co.yedam.exercise;

public class school {
	private int studentNum;
	private String studentName;
	private String studentPhone;
	
	
	
	public school(int studentNum, String studentName, String studentPhone) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
	}
	public school() {
		
	}
	public school(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public school(int studentNum) {
		this.studentNum = studentNum;
	}
	
	
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	
	

	
}
