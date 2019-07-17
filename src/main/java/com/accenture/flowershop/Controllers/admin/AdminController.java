package com.accenture.flowershop.Controllers.admin;

import com.accenture.flowershop.DAO.flowers.FlowerDAO;
import com.accenture.flowershop.Models.flowers.Flowers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    @Autowired
    FlowerDAO flowerDAO;

    @RequestMapping(value = "/addstock",method = RequestMethod.POST)
    public String addOnStockAdmin(@RequestParam String name, @RequestParam double price,
                               @RequestParam int val){
        flowerDAO.addFlower(new Flowers(name, price, val));
        return "addstock";
        //asd
    }

    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public String onStockAdmin(){
        return null;
    }


    @GetMapping
    public void getOrder(){}


}
