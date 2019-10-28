package demo.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) throws IOException {
		Student stu = new Student();
		stu.setAge(23);
		stu.setName("jack");
        ObjectMapper mapper = new ObjectMapper();
        //返回字符串  
        String res = mapper.writeValueAsString(stu);  
        System.out.println(res);
        //输出格式化后的字符串(有性能损耗)  
        res = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stu);  
        System.out.println(res);
        String src="{\"name\":\"afdfdf\",\"age\":111}";
        System.out.println("----------");
        Student stu2 = mapper.readValue(src, Student.class);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
	}
}
