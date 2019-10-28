package demo.springannotation;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages="demo.springannotation")
@PropertySource("classpath:config/mysql.properties")
public class MybatisConfig {
   
	@Bean
	public DataSource dataSource(
			@Value("${jdbc.url}") String url,
			@Value("${jdbc.driver}") String driverClassName,
			@Value("${jdbc.username}") String username,
			@Value("${jdbc.password}") String password){
		System.out.println(url);
		System.out.println(driverClassName);
		DruidDataSource ds = new DruidDataSource();
		ds.setUrl(url);
		ds.setDriverClassName(driverClassName);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMaxActive(10);
		ds.setMaxWait(5000);
		return ds;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(@Autowired DataSource dataSource) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		factoryBean.setMapperLocations(resolver.getResources("classpath:mapperspringannotation/*.xml"));
		// factoryBean.setMapperLocations(new Resource[]{new ClassPathResource("classpath:mapperspringannotation/*.xml")});
		factoryBean.afterPropertiesSet();
		return factoryBean.getObject();
	}
	
	@Bean
	public MapperScannerConfigurer mapperScanConfigure(){
		MapperScannerConfigurer mapperScan = new MapperScannerConfigurer();
		mapperScan.setBasePackage("demo.springannotation");
		return mapperScan;
	}
	
}
