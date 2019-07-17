package com.accenture.flowershop.Controllers.user;

import com.accenture.flowershop.DAO.flowers.FlowerDAO;
import com.accenture.flowershop.DAO.users.UserDAO;
import com.accenture.flowershop.Models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserDAO userDAO;

    @Autowired
    FlowerDAO flowerDAO;


    /*@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@RequestParam String login, @RequestParam String email,
                               @RequestParam String password) {
        // userDAO.addUser(new User(login, email, password));
        return "register";
    }*/

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String homePageUser(@RequestParam String login, @RequestParam String email,
                               @RequestParam String password, @RequestParam String fullName) {
        userDAO.addUser(new User(login, email, password, fullName));
        return "redirect:/web/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@RequestParam String login, @RequestParam String password){
        userDAO.findUserByLogin(login);
        if(userDAO.findUserByLogin(login).getPassword().equals(password)){
            return "redirect:/web/order";
        }else return "login";
    }

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public String shopUser() {
        return null;
    }
}
    /*@RequestMapping(value = "/login/{userId}", method = RequestMethod.POST)
    public String loginUser(@RequestParam String login, @RequestParam String password, @PathVariable int userId){
        if(password.equals(userDAO.findUserByLogin(password))){
            userDAO.findUserById(userId);
        }
        return "login";
    }
}
*/