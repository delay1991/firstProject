package co.friend.model;

public class Friend {
// 친구구분, 이름, 연락처

	private String gubun;
	private String name;
	private String tel;

	public Friend() {

	}

	public Friend(String gubun, String name, String tel) {
		this.gubun = gubun;
		this.name = name;
		this.tel = tel;
	}
	
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Friend [gubun=" + gubun + ", name=" + name + ", tel=" + tel + "]";
	}//부모클래스 메소드,매개값등이 맞는지 확인함(시그너처)
	
	
}
