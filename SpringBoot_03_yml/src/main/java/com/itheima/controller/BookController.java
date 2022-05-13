package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST模式
// @RestController = @Controller + @ResponseBody
// @Controller: 注入服务
// @ResponseBody: 设置当前控制器方法响应内容为当前返回值，无需解析
@RestController
// 访问路径
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;

    @Value("${users1.name}")
    private String name1;

    @Value("${likes[0]}")
    private String likes1;

    @Value("${users[0].age}")
    private String age1;

    @Value("${currDir}")
    private String dir1;




    // 获得映射
    @GetMapping
    public String getById() {
        System.out.println("hello,world");

        System.out.println("country =====>>> "+country1);
        System.out.println("user.name =====>>> "+name1);
        System.out.println("likes[0] =====>>> "+likes1);
        System.out.println("user[0].age =====>>> "+age1);
        System.out.println("dir1 =====>>> "+dir1);





        return "hello,world";
    }
}
