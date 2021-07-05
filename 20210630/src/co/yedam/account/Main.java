package co.yedam.account;

//실행클래스(main), + 나머지는 라이브러리클래스 =어플리케이션1개
public class Main {
public static void main(String[] args) { // 기본생성자
	//i)
	AccountApp.getInstance().exe();

	// ii) AccountApp app=AcountApp.getInstance(); app.exe();

//	AccountApp app1 = AccountApp.getInstance();
//	System.out.println(app == app1);
//	String str1 = new String ("hello");
//	String str2 = new String ("hello");
//	System.out.println(str1 == str2); //싱글톤을 쓰는이유~.
	
}
}
