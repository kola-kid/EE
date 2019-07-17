package com.accenture.flowershop.DAO.users;

import com.accenture.flowershop.Models.user.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    User findUserById(int id);
    User findUserByLogin(String login);
    List<User> getAll();

}
