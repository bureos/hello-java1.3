package demo.dao;

import demo.basic.Student;

public interface StudentDao {
	Student selectOne(int id);
	int insertOne(Student stu);
}
