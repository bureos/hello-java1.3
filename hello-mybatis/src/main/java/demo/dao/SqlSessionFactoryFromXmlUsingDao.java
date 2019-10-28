package demo.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import demo.basic.Student;
import demo.tools.DtoDebug;

/**
 * 使用接口的方式简化应用,要求Dao接口里的方法签名和mapper.xml文件中的一致.
 */
public class SqlSessionFactoryFromXmlUsingDao {
	public static void main(String[] args) throws IOException {
		String resource = "cfg-basic-mysql.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		Student stu =  dao.selectOne(2);
		DtoDebug.debug(stu);
		
		session.close();
	}
	
}
