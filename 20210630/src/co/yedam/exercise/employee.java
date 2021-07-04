package co.yedam.exercise;

import co.yedam.Person;

public class employee {
//필드(사원), 
//사원번호 1252
//이름
//이메일
//급여
//부서

	private int employeeNum;
	private String employeeName;
	private String employeeMail;
	private int employeeMoney;
	private String employeeClass;
	
	public employee() {
		
	}

	public employee(int employeeNum, String employeeName, String employeeMail, int employeeMoney,
			String employeeClass) {
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.employeeMail = employeeMail;
		this.employeeMoney = employeeMoney;
		this.employeeClass = employeeClass;
	}

	public employee(int employeeNum, String employeeName, String employeeMail) {
		this.employeeNum = employeeNum;
		this.employeeName = employeeName;
		this.employeeMail = employeeMail;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMail() {
		return employeeMail;
	}

	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}

	public int getEmployeeMoney() {
		return employeeMoney;
	}

	public void setEmployeeMoney(int employeeMoney) {
		this.employeeMoney = employeeMoney;
	}

	public String getEmployeeClass() {
		return employeeClass;
	}

	public void setEmployeeClass(String employeeClass) {
		this.employeeClass = employeeClass;
	}

	public void showInfo() {
		System.out.println("사원번호: " + employeeNum + "\t" + "이름: " + employeeName + "\t" + "이메일: " + employeeMail + "\t"
				+ "급여:" + employeeMoney + "부서:" + employeeClass);
	}

//메소드정의
// get,set private

}
