package co.yedam;

public class Person {
//이름,나이,키,혈액형
	private String name;
	int age;
	private double height; // private double height >>Person클래스 외 접근금지
	String bloodType;

	public String getName() { // 메소드 직접입력안해도 소스>게
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void showInfo() {
		System.out.println("[이름:" + this.name + " 나이:" + this.age + " 키:" + this.age + " 혈액형: " + this.bloodType + "]"); // 만든후
																															// 저장(컴파일)
	}

	public String getInfo() {
		//void 리턴없고 나머지 리턴있음
		return "{이름:"+ this.name +" 나이:"+this.age+" 키:"+this.age+" 혈액형: "+this.bloodType+"}"; //return규칙 ㅠㅠㅠㅠ...
	
	}
	public int getSum(int n1, int n2) {
		return n1+n2; //작성후 컴파일
	}
	public int getFrom10To20() {//임의값 10~20사이 생성해주는 메소드
		return(int)(Math.random()*10)+10;
	}
	public int getFromTo(int n1, int n2) {
		return(int)(Math.random()*(n2-n1))+n1;
	}
	//매개값으로 문자(이름),숫자(나이) =>제이름은? 나이는? 입니다.
	
	public String getNameAndAge(String name, int age) {
		return "제 이름은" +name+" 이고 나이는 "+age+" 입니다.";
	}
	
//	public void getNameAndAge(String s1, int s2) {
//		System.out.println("제이름은?"+s1+","+"나이는?"+s2);
//	}
	public Person creatNewPerson(String name, int age) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		
		return psn;
	}
	
	public Person creatNewPerson(String name, int age, double height) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		psn.setHeight(height);
		
		return psn;
	}
	public Person creatNewPerson(String name, int age, double height, String booldtype) {
		Person psn = new Person();
		psn.setName(name);
		psn.setAge(age);
		
		psn.setBloodType(booldtype);
		
		return psn;

	}
}
