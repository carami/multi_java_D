package kr.co.multi.IOCExam.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.co.multi.IOCExam.dto.User;

@Mapper
public interface UsersMapper {
	public User getUser(String id);
}
