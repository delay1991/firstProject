package co.yedam.friend;

public class ComFriend extends Friend{
	private String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [name()=" + getName() + ", phone()=" + getPhone() + ", department=" + department + "]";
	}
	
	
}
