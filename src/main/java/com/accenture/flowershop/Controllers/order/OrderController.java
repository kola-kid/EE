package com.accenture.flowershop.Controllers.order;

import com.accenture.flowershop.DAO.orders.OrdersDAO;
import com.accenture.flowershop.Models.orders.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;

@Controller
public class OrderController {
    @Autowired
    OrdersDAO ordersDAO;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String doOrder(@RequestParam int userId, @RequestParam int flowerId, @RequestParam double totalPrice,
                          @RequestParam Date openDate, @RequestParam Date closeDate, @RequestParam String status){
        ordersDAO.addOrder(new Orders(userId, flowerId, totalPrice, openDate, closeDate, status));
        return "order";
    }

}
