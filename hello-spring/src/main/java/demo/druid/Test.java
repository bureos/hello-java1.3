package demo.druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;

public class Test {
    public static void main(String[] args) throws SQLException {
    	DruidDataSource ds = new DruidDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setMaxActive(10);
		ds.setMaxWait(6000);
		
		Connection conn = ds.getConnection();
		String sql="select * from t_person";
    	PreparedStatement ps = conn.prepareStatement(sql);
    	ResultSet rs=ps.executeQuery();
    	while(rs.next()){
    		System.out.println("id:"+rs.getInt(1));
    		System.out.println("name:"+rs.getString(2));
    		System.out.println("age:"+rs.getInt(3));
    		break;
    	}
    	rs.close();
    	ps.close();
    	conn.close();
    	
    	ds.close();
	}
}
