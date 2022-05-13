package com.itheima.controller;

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
    // 获得映射
    @GetMapping
    public String getById() {
        System.out.println("hello,world");
        return "hello,world";
    }
}
