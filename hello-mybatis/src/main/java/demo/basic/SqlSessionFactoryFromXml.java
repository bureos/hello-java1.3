package demo.basic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import demo.tools.DtoDebug;

/**
 * 使用最基础的xml配置文件方式
 */
public class SqlSessionFactoryFromXml {
	public static void main(String[] args) throws IOException {
		String resource = "cfg-basic-mysql.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		Student stu =  session.selectOne("demo.dao.StudentDao.selectOne", 2);
		DtoDebug.debug(stu);
		
		session.close();
	}
	
}
