package demo.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.basic.Student;
import demo.tools.DtoDebug;

public class SpringRun {
    public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MybatisConfig.class);
		StudentDao studentDao = ac.getBean(StudentDao.class);
    	
		Student student = studentDao.selectOne(2);
    	DtoDebug.debug(student);
	}
}
