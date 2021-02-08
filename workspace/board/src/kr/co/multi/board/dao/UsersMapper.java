package kr.co.multi.board.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.co.multi.board.dto.User;

@Mapper
public interface UsersMapper {
	public User getUser(String id); 
	public int addUser(User user);
}
