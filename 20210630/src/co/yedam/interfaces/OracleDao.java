package co.yedam.interfaces;

public class OracleDao implements Dao{//implements 뒤에는 ?? extends 뒤에는 ??
	//오라클DBMS를 사용한 CRUD작업
	
	@Override
	public void insert() {
		System.out.println("오라클DB 입력처리");
	}

	@Override
	public void update() {
		System.out.println("오라클DB 수정처리");
	}

	@Override
	public void delete() {
		System.out.println("오라클DB 삭제처리");
	} 

}
