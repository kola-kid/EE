package com.accenture.flowershop.Models.user;

import com.accenture.flowershop.Models.orders.Orders;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    private String login;
    private String email;
    private String password;
    private String fullName;
    private double money;
    private int discount;

    /*@OneToMany
    @JoinColumn(name = "Orders_id")
    private Orders orders;*/
    public User() {
    }

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public User(String login, String email, String password, String fullName) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.money = 2000;
        this.discount = 0;
    }

    @Id
    @Column(name = "login", nullable = false)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "E_mail", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "Full_name", nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "Money")
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Column(name = "Discount")
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
