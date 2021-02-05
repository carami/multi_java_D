package kr.co.multi.IOCExam;

import org.springframework.stereotype.Component;

@Component("myDao")
public class MyDAO {
	public MyDAO() {
		System.out.println("MyDao 생성!!!");
	}
	public void print() {
		System.out.println("나는 MyDAO 입니다.");
	}	
}
