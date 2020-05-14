package com.up.rest;

import com.up.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestRestController
 * @Description: 测试controller
 * @author: zsc
 * @date: 2020/5/11 9:17
 */
@RestController
@RequestMapping("/up")
public class TestRestController {

    @Autowired
    private UserService userService;


    @GetMapping("/test")
    public String test(){
        return userService.findAllUser();
    }

}
