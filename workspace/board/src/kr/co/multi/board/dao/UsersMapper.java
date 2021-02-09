package kr.co.multi.board.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.multi.board.dto.User;

@Mapper
public interface UsersMapper {
	public User getUser(String id) ; 
	public int addUser(User user) throws Exception; 
	public List<User> getUsers();
}
