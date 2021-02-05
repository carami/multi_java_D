package kr.co.multi.IOCExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext context =  new ClassPathXmlApplicationContext("exam.xml"); 
				/* new AnnotationConfigApplicationContext(MyBeanConfig.class); */
		System.out.println("ApplicationContext 생성후!!");
		
		MyDAO dao = context.getBean("myDao",MyDAO.class);
		dao.print();
		
		MyBean bean = context.getBean("myBean",MyBean.class);
		bean.checkDao();
		System.out.println(bean.getName());
	}

}
