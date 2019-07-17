package com.accenture.flowershop.DAO.orders;

import com.accenture.flowershop.Models.orders.Orders;
import com.accenture.flowershop.Models.user.User;

import java.util.List;

public interface OrdersDAO {
    Orders findOrderById(int id);
    //List<Orders> findOrderByUser(User user);
    List<Orders> getAll();
    void addOrder(Orders orders);
}
