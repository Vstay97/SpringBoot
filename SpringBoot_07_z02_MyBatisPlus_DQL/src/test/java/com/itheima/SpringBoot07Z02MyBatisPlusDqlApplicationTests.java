package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBoot07Z02MyBatisPlusDqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll(){
        /*
         * 第一种 通过列名，直接查
         */
        // QueryWrapper<User> qw = new QueryWrapper<>();
        // qw.lt("age",18);
        // List<User> userList = userDao.selectList(qw);
        // System.out.println(userList);

        /**
         * 第二种，通过lambda表达式，指定属性查
         */
        // QueryWrapper<User> qw = new QueryWrapper<>();
        // qw.lambda().lt(User::getAge,18);
        // List<User> userList = userDao.selectList(qw);
        // System.out.println(userList);

        /**
         * 第三种，通过lambda对象查
         */
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.lt(User::getAge,18);
        userDao.selectList(lqw);



    }

}
