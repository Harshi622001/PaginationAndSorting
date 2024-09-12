package com.PagingAndSorting.PagingAndSorting.controller;

import com.PagingAndSorting.PagingAndSorting.entity.Student;
import com.PagingAndSorting.PagingAndSorting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Page<Student> getUsers(@RequestBody MyRequest request) {
        return userService.getUsers(request.getPage(), request.getSize(), request.getSortBy());
    }
}


