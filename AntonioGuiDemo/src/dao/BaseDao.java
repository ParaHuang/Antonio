package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	//get a connection
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazonDB?useSSL=false",
                "root","a123");
        return conn;
	}
	
	
	//close connection
	public static void close(ResultSet rs, PreparedStatement psta,Connection conn) {
		try {
			//first open, last close
			if(rs != null) {
				rs.close();
			}
			
			if(psta != null) {
				psta.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
