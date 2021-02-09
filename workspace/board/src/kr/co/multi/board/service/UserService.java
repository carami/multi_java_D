package kr.co.multi.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.multi.board.dao.UsersMapper;
import kr.co.multi.board.dto.User;

@Service
public class UserService {
	@Autowired
	private UsersMapper userMapper;
	
	
	public int joinUser(User user) {
		//회원가입을 하기위한 비지니스 로직이 있다면 처리!! 
		
		return userMapper.addUser(user);
	}
}
