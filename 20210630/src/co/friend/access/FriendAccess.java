package co.friend.access;

import java.util.List;

import co.friend.model.Friend;

public interface FriendAccess {
	// 동일한 이름의 친구는 없다.
	//입력,수정,삭제, 전체리스트, 이름조회, 전화번호조회
	//DB배우면 소스코드넣어보기
	public void insert(Friend friend);
	
	public void update(Friend friend);
	
	public void delete(String name);
	
//	public Friend[] selectAll();
	public List<Friend> selectAll();
	
	public Friend selectOne(String name);

	public Friend findTel(String tel);
}
