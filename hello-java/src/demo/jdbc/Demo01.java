package demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class Demo01 {
	public static final String url = "jdbc:mysql://localhost:3306/test";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "root";  
    
    public Connection conn = null;  
    public PreparedStatement pst = null;  
    
    @Before
    public void init() {  
        try {
            Class.forName(name);
            conn = DriverManager.getConnection(url, user, password);//��ȡ����  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
    
    @Test
    public void test() throws SQLException{
    	init();
    	
    	String sql="select * from t_person";
    	PreparedStatement ps = conn.prepareStatement(sql);
    	ResultSet rs=ps.executeQuery();
    	String ret = null;
    	while(rs.next()){
    		System.out.println("id:"+rs.getInt(1));
    		System.out.println("name:"+rs.getString(2));
    		System.out.println("age:"+rs.getInt(3));
    		break;
    	}
    	rs.close();
    	ps.close();
    	conn.close();
    }
    
}
