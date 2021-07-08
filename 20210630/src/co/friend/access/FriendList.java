package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.friend.model.Friend;

//FriendAccess(인터페이스)구현하는 객체.
//파일에 저장.
public class FriendList implements FriendAccess {

	String path = "c:/tmp/friendList.txt";
	List<Friend> friends;

	public void open() {
		File file = new File(path);
		if (!file.exists()) {// path에 해당파일이 없으면 디렉터리&파일 생성.
			File dir = new File("c:/tmp/");
			dir.mkdirs(); // c:/tmp 디렉터리 생성.
			try {
				file.createNewFile(); // file을 생성.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			Scanner scn = new Scanner(file); // 파일의 내용 한번에 읽음.
			while (true) {
				if (!scn.hasNext()) {
					break;
				}
				String readStr = scn.next();
				String[] arr = readStr.split(",");

				Friend friend = new Friend(arr[0], arr[1], arr[2]);

				// 배열공간에 한건씩 저장
//				for (int i = 0; i < friends.size(); i++) {
//					if (friends[i] == null) {
//						friends[i] = friend;
//						break;
//					}
//				}
				friends.add(friend);
			}
			scn.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public void save() {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(path));
			for (int i = 0; i < friends.size(); i++) {
				br.write(String.format("%s,%s,%s\n", friends.get(i).getGubun(), friends.get(i).getName(),
						friends.get(i).getTel()));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public FriendList() {
		friends = new ArrayList<Friend>();
		open();
	}

	@Override
	public void insert(Friend friend) {
//		for (int i = 0; i < friends.size(); i++) {
//			if (friends[i] == null) {
//				friends[i] = friend;
//				break;
//			}
//			;
		friends.add(friend);
		save();
	}

	@Override
	public void update(Friend friend) {
		for (int i = 0; i < friends.size(); i++) { // 배열 요소중에서 값이 있는 요소만 가져와서
			if (friends.get(i).getName().equals(friend.getName())) {
				friends.get(i).setTel(friend.getTel());

				break;

			}

		}
		save();
	}

	@Override
	public void delete(String name) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.remove(i);

				break;
			}
		}
		save();
	}

	@Override
	public List<Friend> selectAll() {

		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				return friends.get(i);
			}
		}

		return null;
	}

	@Override
	public Friend findTel(String tel) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getTel().equals(tel)) {
				return friends.get(i);
			}
		}
		return null;
	}

}
