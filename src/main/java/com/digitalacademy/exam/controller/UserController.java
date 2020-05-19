package com.digitalacademy.exam.controller;

import com.digitalacademy.exam.model.User;
import com.digitalacademy.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public HttpEntity getUserInfoById(@PathVariable Long id) {
        System.out.println("call id : " + id);
        User res = null;
        try {
            res = userService.getUserInfoById(id);
        } catch (Exception e) {
            return (HttpEntity) ResponseEntity.notFound();
        }
        return ResponseEntity.ok(res);
    }

    @GetMapping(path = "/hello")
    public String hello(){
        return "hello spring boot";
    }
}
