package co.yedam.exercise;

public class Example01 {
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.setEmployeeNum(1234);
		e1.setEmployeeName("박주현");
		e1.setEmployeeMail("pjh@email.com");
		e1.setEmployeeMoney(4500000);
		e1.setEmployeeClass("개발부");
		e1.showInfo();

		employee e2 = new employee(2345, "홍미림", "hmr@email.com");
		e2.showInfo(); // 기본생성자

//    배열 :employees(5);
		employee[] employees = { e1, e2, new employee(123, "임효인", "lhi@email.com", 5000000, "총무부") };
// 첫번째위치 e1, 두번째 e2
// 세번째 new emplyee(123,"임효인","lhi@email.com", 5000000,"총무부)
		// 각요소출력

	}
}
