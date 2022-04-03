package com.example.wseiLab2.Controllers;

import com.example.wseiLab2.Models.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UsersController {
    private Map<Integer, UserEntity> users;

    public UsersController() {
        var user1 = new UserEntity(
                1,
                "MS1",
                "Mary",
                "Sue"
        );
        users = new HashMap<>();
        users.put(user1.getId(), user1);
    }

    @RequestMapping("users")
    @ResponseBody
    public Map<Integer, UserEntity> getAll(){
        return users;
    }

    @RequestMapping("users/{user-id}/get")
    @ResponseBody
    public Object getUser(@PathVariable(name = "user-id") Integer userId){
        if(users.containsKey(userId))
            return users.get(userId);
        return "user doesn't exist";
    }

    @RequestMapping("users/{user-id}/remove")
    @ResponseBody
    public String removeUser(@PathVariable(name = "user-id") Integer userId){
        if(users.containsKey(userId)){
            users.remove(userId);
            return "Success";
        }
         return "user doesn't exist";
    }

    @RequestMapping("user/add")
    @ResponseBody
    public Object addUser(
        @RequestParam Integer id,
        @RequestParam String login,
        @RequestParam String firstname,
        @RequestParam String lastname
    ){
        var newUser = new UserEntity(id, login, firstname, lastname);
        users.put(newUser.getId(), newUser);
        return newUser;
    }

}
