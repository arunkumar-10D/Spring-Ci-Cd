package com.example.docker.controller;

import com.example.docker.entity.User;
import com.example.docker.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DockerController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/docker")
    public String docker(){
        return "docker runnning";
    }

    @GetMapping("/user")
    public List<User> listUser(User user){
        return userRepo.findAll();
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }

}
