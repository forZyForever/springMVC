package com.Capcom.controller;

import com.Capcom.domain.Result;
import com.Capcom.domain.User;
import com.Capcom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/check")
    public Result Demo01(String username) {
        Result result = new Result(true);
        try {
            User user = userService.checkUserByUsername(username);
            if (user != null) {
                result.setData(true);
            } else {
                result.setData(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setFlag(false);
        }
        return result;
    }
}
