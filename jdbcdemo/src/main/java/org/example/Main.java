package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {
        try {
            //1.declare the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.get the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                    "root",
                    "a123");
//        System.out.println("connect successfully ");
            //3.use connection to manipulate database (insert,delete,update,select)
            //sql is a command, PreparedStatement is a tool
            String sql = "insert into usertb values ('testuser1','112233','13455557777','Jack',null,null)";
            PreparedStatement psta = connection.prepareStatement(sql);
            //4.execute
            int row = psta.executeUpdate();   //insert,delete,update
            System.out.println("insert successfully");
            //5.close PreparedStatement, connection
            psta.close();
            connection.close();
        }catch (Exception e){
            System.out.println("failed");
        }
        //psta.executeQuery();    //select


    }
}