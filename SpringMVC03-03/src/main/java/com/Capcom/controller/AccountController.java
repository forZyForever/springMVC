package com.Capcom.controller;


import com.Capcom.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/trade")
    public String Demo01(@RequestParam Map<String,Object> map){
        try {
            accountService.transTo(map);
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}
