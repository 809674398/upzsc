package com.up.rest;

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


    @GetMapping("/test")
    public String test(){
        return "test second AAA !";
    }

}
