package iducs.springboot.board.service;

import java.util.List;

import iducs.springboot.board.domain.User;

public interface UserService {
	User getUser(long id); // primary key에 해당하는 id로  조회
	User getUserByUserId(String userId); // unique key에 해당하는 userId로 조회
	List<User> getUsers(); // 모든 사용자 조회
	List<User> getUsersByName(String name); // name으로 조회
	List<User> getUsersByCompany(String company); // company으로 조회
	List<User> getUsersByPage(int index, int size); // 페이지로 조회
	void saveUser(User User); // 생성
	void updateUser(User User); // 수정
	void deleteUser(long id); // 삭제
}
