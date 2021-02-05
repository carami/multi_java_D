package kr.co.multi.IOCExam.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.multi.IOCExam.config.ApplicationConfig;
import kr.co.multi.IOCExam.dto.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class UsersMapperTest {
	@Autowired
	private UsersMapper usersMapper;
	
	
	@Test
	public void getUser() throws Exception{
	//	System.out.println("test");
		User user = usersMapper.getUser("carami");
		System.out.println(user);
		Assert.assertNotNull(user);
		Assert.assertEquals("강경미", user.getName());
	}
}
