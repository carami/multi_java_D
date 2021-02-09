package kr.co.multi.board.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.multi.board.config.ApplicationConfig;
import kr.co.multi.board.dto.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@Transactional
public class UsersMapperTest {
	@Autowired
	private UsersMapper usersMapper;
	
	
	@Test
	public void getUser() throws Exception{
	//	System.out.println("test");
		User user = usersMapper.getUser("carami");
		System.out.println(user);
		assertNotNull(user);
		assertEquals("강경미", user.getName());
	}
	
	@Test
	public void addUser() throws Exception{
		User user = new User();
		user.setId("test6");
		user.setName("테스트");
		user.setPassword("1234");
		user.setEmail("test@test.com");
		
		int resultCount = usersMapper.addUser(user);
		
		assertEquals(1, resultCount);
		assertNotNull(usersMapper.getUser(user.getId()));
	}
	
	@Test
	public void getUsers() throws Exception{
		List<User> users = usersMapper.getUsers();
		assertEquals(6, users.size());
	}
}
