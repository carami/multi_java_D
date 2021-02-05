package kr.co.multi.IOCExam.tvuser;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.multi.IOCExam.tv.TV;

public class User {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationConext.xml");
		
		TV tv = factory.getBean("etv",TV.class);
		
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
		
		
	}

}
