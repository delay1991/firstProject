package co.yedam.api.string;

class Apple implements Cloneable{
	int price;

	Apple(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		return this.price == ((Apple) obj).price; //ap.price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}

public class ObjectExample {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.equals(new Object()));

		Apple ap1 = new Apple(1000);
		Apple ap2 = new Apple(1000);
		try {
			Apple ap3 = (Apple)ap1.clone();
			System.out.println("ap3: "+ap3.price);
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ap1.equals(ap2));
		


	}
}


