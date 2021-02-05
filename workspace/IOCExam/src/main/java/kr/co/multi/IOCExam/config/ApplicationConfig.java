package kr.co.multi.IOCExam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.co.multi.IOCExam.dao"})
@Import({MyBatisConfig.class})
public class ApplicationConfig {
	//DataSource 설정
	//Mybatis 설정 
}
