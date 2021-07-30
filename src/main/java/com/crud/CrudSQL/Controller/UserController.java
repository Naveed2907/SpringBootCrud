package com.crud.CrudSQL.Controller;

import com.crud.CrudSQL.Entity.User;
import com.crud.CrudSQL.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/")
    public List<User> getAllUsers(){
        List<User> users = userService.getALlUsers();
        return users;
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }
}
