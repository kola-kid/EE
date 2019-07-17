package com.accenture.flowershop.DAO.flowers;

import com.accenture.flowershop.Models.flowers.Flowers;

import java.util.List;

public interface FlowerDAO {
    void addFlower(Flowers flowers);
    //Flowers findFlowerById(int id);
    //Flowers findFlowerByName(String name);
    List<Flowers> getAll();
}
