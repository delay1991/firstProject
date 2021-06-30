package co.yedam;

public class Person {
//이름,나이,키,혈액형
	private String name;
	int age;
	private double height; // private double height >>Person클래스 외 접근금지
	String bloodType; 
	
	public String getName() { //메소드 직접입력안해도 소스>게
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
		System.out.println("[이름:"+ this.name +" 나이:"+this.age+" 키:"+this.age+" 혈액형: "+this.bloodType+"]"); //만든후 저장(컴파일)
	}
	public String getInfo() {
		//void 리턴없고 나머지 리턴있음
		return "{이름:"+ this.name +" 나이:"+this.age+" 키:"+this.age+" 혈액형: "+this.bloodType+"}"; //return규칙 ㅠㅠㅠㅠ...
	}

}
