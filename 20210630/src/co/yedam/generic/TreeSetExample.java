package co.yedam.generic; //트리셋,트리맵(이진트리구조(=바이너리트리)-오름차순정렬)>루트>부모>자식

import java.util.TreeSet;

class Member implements Comparable<Member> { // comparable정의 : 순위비교
	int memberNo;
	String memberName;

	public Member(int memberNo, String memberName) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
	}

	@Override
	public int compareTo(Member o) {

//		if (this.memberNo < o.memberNo)
//			return -1;
//		else if (this.memberNo == o.memberNo)
//			return 0;
//		else
//			return 1;
// 		a<b<c
//		return this.memberNo - o.memberNo;
//		return this.memberNo - o.memberNo; // 3, 5 = -2 오름차순
//		return o.memberNo -this.memberNo; //5, 3 = 2 내림차순
		
		if(this.memberName.compareTo(o.memberName) ==0) {
			return this.memberNo - o.memberNo;
		}
		return this.memberName.compareTo(o.memberName); //이름으로 오름차순
		
	}

}

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Member> members = new TreeSet<Member>();
		members.add(new Member(1001, "Hong")); // class는 comparable 기준x
		members.add(new Member(1002, "Choi"));
		members.add(new Member(1003, "Kim"));
		members.add(new Member(1004, "Hong"));

		while (!members.isEmpty()) {
			Member mem = members.pollFirst();
			System.out.println(mem.memberNo + "," + mem.memberName);
		}

		System.out.println("String.compareTo :" + "Hark".compareTo("Hong")); // 이름으로 오름차순가능

		TreeSet<Integer> set = new TreeSet<>(); // integer은 comparable 이 있음.
		set.add(10); // Integer, new Integer(10)
		set.add(5);
		set.add(13);

		set.first(); // 가장작은값
		set.last();

		while (!set.isEmpty()) {
			Integer v = set.pollFirst(); // 가장작은값부터 읽어옴
			System.out.println(v);
		}
		System.out.println("end");
	}
}
