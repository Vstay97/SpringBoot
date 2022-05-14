package com.itheima;

import com.itheima.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot05MyBatisApplicationTests {

    @Autowired
    private UserDao bookDao;


    @Test
    void contextLoads() {
        System.out.println(bookDao.getBookById(23));
    }

}
