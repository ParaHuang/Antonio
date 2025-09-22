package org.example;

import java.sql.*;

public class Main4 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                "root","a123");

        String sql = "select * from userTable";
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs =  ps.executeQuery();
        boolean f1 = rs.next();  //move cursor to the next row
        System.out.println(f1);
        System.out.println(rs.getString(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getString(3));
        System.out.println(rs.getDate(4));
        System.out.println(rs.getString(5));

        while (rs.next()){
            String d1 = rs.getString(1);
            System.out.println(d1);
            System.out.println(rs.getString("password"));
            System.out.println(rs.getString(3));
            System.out.println(rs.getDate(4));
            System.out.println(rs.getString(5));
            System.out.println();
        }
    }
}
