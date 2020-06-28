package com.uocloud.demo.controller;


import com.uocloud.demo.mapper.UserMapper;
import com.uocloud.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user/getalluser")
    public List<User> getalluser(){
        List<User> userList=userMapper.getallusers();
        return userList;
    }

    @RequestMapping("/user/adduser")
    public  String adduser( String username, String password) {
        User user = userMapper.findUser(username);
        if(user!=null){
            return "" +
                    "";
        }else {
            userMapper.adduser(username,password);

            return "the user"+username+"added";

        }


    }


    @GetMapping("/user/updateuser")
    public  void updateuser(String username,String password) {
        userMapper.updateuser(username,password);
    }

    @GetMapping("/user/deleteuser")
    public  void deleteuser(String username) {
        userMapper.deleteuser(username);

    }

    @RequestMapping("/user/getuser")

    public Object hi(String username){



        System.out.println(username);
        User user = userMapper.findUser(username);
        if(user!=null){
        System.out.println(user.getUsername());
        }else {
            System.out.println("wrong");
        }


        return user;
    }
}

