package kr.co.multi.board.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@ComponentScan(basePackages = {"kr.co.multi.board.dao","kr.co.multi.board.service"})
@Import({MyBatisConfig.class})
public class ApplicationConfig {
	//DataSource 설정
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(oracle.jdbc.driver.OracleDriver.class);
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("tuser");
		dataSource.setPassword("test");
		
		return dataSource;
	}
	
	
	
	//Mybatis 설정 
}
