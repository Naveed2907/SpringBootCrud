package com.crud.CrudSQL.Service;

import com.crud.CrudSQL.DAO.UserDAO;
import com.crud.CrudSQL.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public List<User> getALlUsers() {
        return userDAO.findAll();
    }

    public String addUser(User user) {
        userDAO.save(user);
        return "User saved successfully";
    }

    public User getUserById(Integer id) {
        return userDAO.findById(id).get();
    }
}
