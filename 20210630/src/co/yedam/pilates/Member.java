package co.yedam.pilates;


public class Member {
private int memberId;
private String memberName;
private String memberPhone; 
private String memberBirth;
private Gender memberGen;



public Member(int memberId, String memberName, String memberPhone, String memberBirth, Gender memberGen) { //순서동일해야함
	this.memberId = memberId;
	this.memberName = memberName;
	this.memberPhone = memberPhone;
	this.memberBirth = memberBirth;
	this.memberGen = memberGen;
}
public int getMemberId() {
	return memberId;
}
public void setMemberId(int memberId) {
	this.memberId = memberId;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public String getMemberPhone() {
	return memberPhone;
}
public void setMemberPhone(String memberPhone) {
	this.memberPhone = memberPhone;
}
public String getMemberBirth() {
	return memberBirth;
}
public void setMemberBirth(String memberBirth) {
	this.memberBirth = memberBirth;
}
public Gender getMemberGen() {
	return memberGen;
}
public void setMemberGen(Gender memberGen) {
	this.memberGen = memberGen;
}
public String showInfo() {
	String info="회원번호: "+memberId+"\t"+"회원이름: "+memberName+"\t"+"연락처: "+memberPhone+"\t"+"생연월일: "+memberBirth+"\t"+" 성별: "+ memberGen;
	return info;
}




}
