package kr.co.multi.IOCExam.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(
		annotationClass = Mapper.class,
		basePackages = "kr.co.multi.IOCExam.dao",
		sqlSessionFactoryRef = "sqlSessionFactoryBean"
		)
public class MyBatisConfig {
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean
	(DataSource dataSource, ApplicationContext applicationContext) throws IOException{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/configuration.xml"));
		factoryBean.setMapperLocations(applicationContext.getResources("classpath:mybatis/mappers/**/*.xml"));
		
		return factoryBean;
	}
}
