package kr.co.multi.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.multi.board.dao.UsersMapper;
import kr.co.multi.board.dto.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UsersMapper userMapper;
	public User getUser(String id) {
		return userMapper.getUser(id);
	}
	@Transactional(readOnly = false)
	public int joinUser(User user) throws RuntimeException{
		//회원가입을 하기위한 비지니스 로직이 있다면 처리!! 
		
		int returnValue = 0;
		
		
		try {
			returnValue =  userMapper.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			returnValue =  0;
		}
		
//		if(true)
//			throw new RuntimeException();
		
		return returnValue;
	}
	
	public List<User> getUsers(){
		return userMapper.getUsers();
	}
}
