package com.accenture.flowershop.Models.orders;

import com.accenture.flowershop.Models.flowers.Flowers;
import com.accenture.flowershop.Models.user.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Orders")
public class Orders {
    private int id;
    private int userId;
    private int flowerId;
    private double totalPrice;
    private Date openDate;
    private Date closeDate;
    private String status;

    public Orders() {
    }

    public Orders(int userId,int flowerId, double totalPrice, Date openDate, Date closeDate, String status) {
        this.userId = userId;
        this.flowerId = flowerId;
        this.totalPrice = totalPrice;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.status = status;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "User_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        userId = userId;
    }

    @Column(name = "Total_price")
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Column(name = "Open_date")
    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Column(name = "Close_date")
    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "Flower_id")
    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }


}
