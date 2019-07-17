package com.accenture.flowershop.Models.flowers;

import org.aspectj.lang.annotation.RequiredTypes;

import javax.annotation.PostConstruct;
import javax.persistence.*;

@Entity
@Table(name = "Flowers")
public class Flowers{
    private int id;
    private String name;
    private double price;
    private int val;

    public Flowers() {
    }

    public Flowers(String name, double price, int val) {
        this.name = name;
        this.price = price;
        this.val = val;
    }

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = "Val")
    public int getVal(){
        return val;
    }

    public void setVal(int val){
        this.val = val;
    }

}
