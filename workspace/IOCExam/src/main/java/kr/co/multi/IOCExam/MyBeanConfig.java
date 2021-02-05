package kr.co.multi.IOCExam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.co.multi")
public class MyBeanConfig {
//	@Bean
//	public MyBean myBean(MyDAO myDao) {
//		MyBean bean = new MyBean(myDao); 
//		bean.setName("kang kyung mi");
//		return bean;
//	}
//	@Bean
//	public MyDAO myDao() {
//		return new MyDAO();
//	}
}
