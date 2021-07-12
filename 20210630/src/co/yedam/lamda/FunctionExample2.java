package co.yedam.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int eScore;
	int mScore;

	public Student(String name, int eScore, int mScore) {
		super();
		this.name = name;
		this.eScore = eScore;
		this.mScore = mScore;
	}

	public String getName() {
		return name;
	}

	public int geteScore() {
		return eScore;
	}

	public int getmScore() {
		return mScore;
	}
}

public class FunctionExample2 {// 매개값 있고, 반환값도 있음.
	static List<Student> list = Arrays.asList(new Student("Hong", 80, 90), // 한번에 여러건담기(add 대신)
			new Student("Park", 85, 95));

	public static void printString(Function<Student, String> func) { // 기능을 매개값으로 받음.
		for (Student student : list)
			System.out.println(func.apply(student)); // 익명은 메인클래스안에 정의. 따로X
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static void main(String[] args) { //html css 배울때 람다식으로 연결해보겠어요~~~ ㅠㅠ
		printString((Student t) -> {
			return t.getName();
		});

		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student t) {
				return t.getmScore();
			}
		});
	}
}
