package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.Services.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/ff")
@RestController
public class F {

        @Autowired
        private IUser userService;


    }


