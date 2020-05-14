package com.up;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: Application
 * @Description: 启动类
 * @author: zsc
 * @date: 2020/5/11 9:22
 */
@SpringBootApplication
@MapperScan(basePackages = "com.up.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
