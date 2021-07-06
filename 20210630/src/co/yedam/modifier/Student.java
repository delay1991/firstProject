package co.yedam.modifier;

class Teacher {
	private String name;
	private String major;
	
	Teacher(){
		
	}
	
	String getName() {
		return name;
	}
}

public class Student {
	private String name;
	private String major;
	private int grade;

	private Student() {
//private
	}

	protected Student(String name) {
		this.name = name;
	}

//default
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
//public
}
