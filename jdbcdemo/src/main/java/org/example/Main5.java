package org.example;

import org.example.dao.CustomerDao;
import org.example.entity.Customer;

public class Main5 {
    public static void main(String[] args) throws Exception {
        CustomerDao dao = new CustomerDao();
        Customer customer = dao.login("Jackie123","234234");
        if(customer == null){
            System.out.printf("login failed");
        }else{
            System.out.printf("login successfully, welcome "+customer.getCus_account());
        }
    }
}
