package co.friend.access;

import java.util.List;

import co.friend.model.Friend;

//FriendAccess(인터페이스) 구현객체.
//DB저장
public class FriendDB implements FriendAccess {

	@Override
	public void insert(Friend friend) {

	}

	@Override
	public void update(Friend friend) {

	}

	@Override
	public void delete(String Name) {

	}

	@Override
	public List<Friend> selectAll() {
		return null;
	}

	@Override
	public Friend selectOne(String name) {
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		return null;
	}



}
