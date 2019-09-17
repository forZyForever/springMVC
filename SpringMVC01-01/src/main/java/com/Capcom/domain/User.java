package com.Capcom.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String address;
    /*内置的时间转化器*/
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private IdCard idCard;
    private List<Mobile> mobiles;

    public User() {
    }

    public User(String username, String password, String address,Date date,IdCard idCard,List<Mobile> mobiles) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.date=date;
        this.idCard=idCard;
        this.mobiles=mobiles;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", idCard=" + idCard +
                ", mobiles=" + mobiles +
                '}';
    }
}
