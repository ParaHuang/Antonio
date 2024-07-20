package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the username:");
        String username = scanner.nextLine();
        System.out.println("please input the password:");
        String password = scanner.nextLine();
        System.out.println("please input the phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input the name:");
        String name = scanner.nextLine();
        System.out.println("please input the email:");
        String email = scanner.nextLine();
        System.out.println("please input the address:");
        String address = scanner.nextLine();


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                "root","a123");

        String sql = "insert into usertb values (?,?,?,?,?,?)";
        PreparedStatement psta = conn.prepareStatement(sql);            //Pre compile tool

//        psta.setString(which ?, what content);
        psta.setString(1,username);
        psta.setString(2,password);
        psta.setString(3,phoneNumber);
        psta.setString(4,name);
        psta.setString(5,email);
        psta.setString(6,address);

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
