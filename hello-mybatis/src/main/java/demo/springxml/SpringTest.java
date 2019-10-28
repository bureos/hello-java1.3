package demo.springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.basic.Student;
import demo.tools.DtoDebug;

public class SpringTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        
		StudentDao studentDao = ac.getBean(StudentDao.class);
		Student student = studentDao.selectOne(2);
		DtoDebug.debug(student);
		ac.close();
	}
}
