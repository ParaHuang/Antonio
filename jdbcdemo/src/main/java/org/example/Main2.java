package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                "root","a123");

//        String sql = "delete from usertb where username='testuser1'";
        String sql = "update usertb set password='123' where username='Para'";
        PreparedStatement psta = conn.prepareStatement(sql);
        int row = psta.executeUpdate();
        if(row>0){
            System.out.println("update successfully");
        }else {
            System.out.println("failed");
        }
        psta.close();
        conn.close();
    }
}
