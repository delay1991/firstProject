package co.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {

		Dao dao = new MysqlDao();

		dao.insert();
		dao.update();
		dao.delete();

		// sqlite, postgreSQL
		Dao dao2 = new Dao() { // 익명으로 그때그때마다?

			@Override
			public void insert() {
				System.out.println("sqlite 입력처리");
			}

			@Override
			public void update() {
				System.out.println("sqlite 수정처리");
			}

			@Override
			public void delete() {
				System.out.println("sqlite 삭제처리");
			}

		};

		dao2.insert();
		dao2.update();
		dao2.delete();

//	dao = new MysqlDao();
	}
}
