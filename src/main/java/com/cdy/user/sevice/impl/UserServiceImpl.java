package com.cdy.user.sevice.impl;

import com.cdy.api.sevice.user.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl  implements UserService {
    @Override
    public String hello() {
        return "hello feign";
    }
}
