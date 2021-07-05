package co.yedam.exercise;

import co.yedam.pilates.Gender;
import co.yedam.pilates.Member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberId(111);
		m1.setMemberName("Park");
		System.out.println(m1.getMemberId()+","+m1.getMemberName()+","+m1.getMemberPhone());
		m1 = new Member(101, "Hong", "010222222", "0101",Gender.man);
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMemberId()+","+m1.getMemberName()+","+m1.getMemberPhone());
	
		
		
	}
}
