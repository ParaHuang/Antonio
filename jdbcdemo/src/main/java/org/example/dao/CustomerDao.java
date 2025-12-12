package org.example.dao;

import org.example.entity.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDao {
    //data structure (account,password,address,xxxxxx....)
    public Customer login(String account, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazondb?useSSL=false",
                    "root", "a123");

            String sql = "select * from customerTb where cus_account=? and cus_password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, account);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                //login successfully
                Customer customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        null,       //don't save password
                        rs.getString(4),
                        rs.getString(5)
                );
                return customer;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;//1.login failed(wrong account or password)  2.exception
    }
}
