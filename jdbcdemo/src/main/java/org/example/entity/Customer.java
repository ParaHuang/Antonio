package org.example.entity;

public class Customer {
    private int cus_no;
    private String cus_account;
    private String cus_password;
    private String cus_address;
    private String cus_gender;

    //constructors(full-params,no-param)+getters,setters+toString
    public Customer(int cus_no,String cus_account,  String cus_password, String cus_address, String cus_gender) {
        this.cus_account = cus_account;
        this.cus_address = cus_address;
        this.cus_gender = cus_gender;
        this.cus_no = cus_no;
        this.cus_password = cus_password;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_account='" + cus_account + '\'' +
                ", cus_no=" + cus_no +
                ", cus_password='" + cus_password + '\'' +
                ", cus_address='" + cus_address + '\'' +
                ", cus_gender='" + cus_gender + '\'' +
                '}';
    }

    public String getCus_account() {
        return cus_account;
    }

    public void setCus_account(String cus_account) {
        this.cus_account = cus_account;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public String getCus_gender() {
        return cus_gender;
    }

    public void setCus_gender(String cus_gender) {
        this.cus_gender = cus_gender;
    }

    public int getCus_no() {
        return cus_no;
    }

    public void setCus_no(int cus_no) {
        this.cus_no = cus_no;
    }

    public String getCus_password() {
        return cus_password;
    }

    public void setCus_password(String cus_password) {
        this.cus_password = cus_password;
    }
}
